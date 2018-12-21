public class Stack <G> {
    private class Node {
        G data;
        Node next;
        private Node(G data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
    Node head;

    public void push(G data) {
        Node newNode = new Node(data, this.head);
        this.head = newNode;

    }
    
    public G pop() {
        if (this.head == null) {
            return null;
        }
        G data = this.head.data;
        this.head = this.head.next;
        return data;

    }

    public G peak() {
        if (this.head == null) {
            return null;
        }
        return this.head.data;
    }

    public boolean isEmpty() {
        return this.head == null;
    }
    
    public Stack() {
        this.head = null;
    }
}