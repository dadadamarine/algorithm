import algo.data.Queue;

import java.io.*;

public class Main {
    MyQueue queue = new MyQueue();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Main main = new Main();
        int lines = Integer.parseInt(br.readLine());
        for (int i = 0; i < lines; i++) {
            int msg = main.doCommand(br.readLine().split(" "));
            if (msg != -100) {
                bw.write("" + msg + "\n");
            }
        }
        bw.close();

    }

    public int doCommand(String[] s) {
        String command = s[0];
        if (s.length == 2 && command.equals("push")) {
            return queue.push(Integer.parseInt(s[1]));
        }
        if (command.equals("front")) {

            return queue.front();
        }
        class Qsueue extends Queue{

        }
        if (command.equals("back")) {

            return queue.back();
        }
        if (command.equals("pop")) {

            return queue.pop();
        }
        if (command.equals("size")) {
            return queue.size();
        }
        if (command.equals("empty")) {
            return queue.empty();
        }
        return -100;
    }

    class Node {
        int data;
        Node next;

        public Node(int data) {
            data = data;
            next = null;
        }
    }

    class MyQueue {
            Node tail, head;
            int size;

        public MyQueue() {
            tail = head = new Node(1000);
            size = 0;
        }

        public int push(int data) {
            Node newNode = new Node(data);
            tail.next = newNode;
            if(head == null) {
                head = tail;
            }
            size++;
            return -100;
        }

        public int empty() {
            if (head == null) {
                return 1;
            }
            return 0;
        }

        public int pop() {
            if (empty() == 1) {
                return -1;
            }
            Node temp = head.next;
            head = temp.next;
            size--;
            return temp.data;
        }

        public int front() {
            if (empty() == 1) {
                return -1;
            }
            return head.next.data;
        }

        public int back() {
            if (empty() == 1) {
                return -1;
            }
            return tail.data;
        }

        public int size() {
            return size;
        }
    }
}



