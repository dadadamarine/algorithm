package algo.data;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
        }
    }

    public void push(int newData) {
        Node newNode = new Node(newData);
        newNode.next = this.head;
        this.head = newNode;
    }

    public void insertAfter(Node previousNode, int newData) {

        if (previousNode == null) {
            return;
        }
        Node newNode = new Node(newData);
        newNode.next = previousNode.next;
        previousNode.next = newNode;

    }

    public void append(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            this.head = newNode;
            return;
        }
        newNode.next=null;

        Node last = head;
        while(last.next !=null){
            last = last.next;
        }
        last.next = newNode;
        return;
    }
    void deleteNode(int key){
        Node temp = this.head;
        Node prev = null;

        if(temp !=null && temp.data == key){
            this.head = temp.next;
            return;
        }

        while(temp != null && temp.data != key){
            prev = temp;
            temp = temp.next;
        }
        if(temp == null) return;

        prev.next = temp.next;
    }

    public void printList(){
        Node node = head;
        while(node!=null){
            System.out.print(node.data+ " -> ");
            node = node.next;
        }
        System.out.println("");
    }


    public static void main(String[] args)
    {

        LinkedList llist = new LinkedList();

        llist.push(7);
        llist.push(1);
        llist.push(3);
        llist.push(2);

        System.out.println("\nCreated Linked list is:");
        llist.printList();

        llist.deleteNode(1); // Delete node at position 4

        System.out.println("\nLinked List after Deletion at position 4:");
        llist.printList();
    }
}
