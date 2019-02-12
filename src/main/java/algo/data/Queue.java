package algo.data;

class Data {
    int data;

    public Data(int data) {
        this.data = data;
    }
}

class Node {
    Data data;
    Node next;

    public Node(Data data) {
        this.data = data;
        this.next = null;
    }
}

public class Queue {

    Node front, rear;

    public Queue() {
        this.front = this.rear = null;
    }

    public void enqueue(Data data) {
        Node newNode = new Node(data);
        newNode.next = this.rear;
        this.rear = newNode;

        if (this.front == null) {
            this.front = newNode;
        }

    }

    public Data dequeue() {
        if (this.front == null) {
            return null;
        }
        Node tempNode = front;
        this.front = this.front.next;
        return tempNode.data;
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.enqueue(new Data(10));
        q.enqueue(new Data(20));
        q.dequeue();
        q.dequeue();
        q.enqueue(new Data(30));
        q.enqueue(new Data(40));
        q.enqueue(new Data(50));

        System.out.println("Dequeued item is " + q.dequeue().data);
    }
}
