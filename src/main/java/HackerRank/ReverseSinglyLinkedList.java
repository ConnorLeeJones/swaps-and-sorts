package HackerRank;


public class ReverseSinglyLinkedList {
    static Node reverse(Node head) {
        if (head == null){
            return head;
        }
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null){
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        current = prev;
        return current;
    }

    public class Node {
        int data;
        Node next;
        public Node(){
        }
    }

}
