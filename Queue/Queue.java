public class Queue <G> {
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
        Node node = new Node(data, null);
        if(this.head == null) {
            this.head = node;
            return;
        }
        Node curr = this.head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = node;
    }
    public G pop() {    
        if (this.head == null) {
            return null;
        }
        G data = head.data;
        head = head.next;

        return data; 
    }
    public G peek () {
        if (this.head == null) {
            return null;
        }
        return head.data;
    }

    public boolean isEmpty () {
        return (head == null);
    }
}