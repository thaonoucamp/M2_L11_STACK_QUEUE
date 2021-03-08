package myQueue;

public class MyLinkedListQueue {
    private Node head;
    private Node tail;

    public MyLinkedListQueue(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public MyLinkedListQueue() {

    }

    public void enQueue(int key) {
        Node temp = new Node(key);
        if (this.tail == null) {
            this.head = this.tail = temp;
            return;
        }
        this.tail.next = temp;
        this.tail = temp;
    }

    public Node deQueue() {
        if (this.head == null)
            return null;
        Node temp = this.head;
        this.head = this.head.next;
        if (this.head == null)
            this.tail = null;
        return temp;
    }
}
