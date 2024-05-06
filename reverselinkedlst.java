public class Main {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    public static Node reverse(Node head) {
        Node curr = head;
        Node after = null;
        Node prev = null;
        while(curr!=null){
            after= curr.next;
            curr.next=prev;
           prev=curr;
            curr = after;
        }
        return prev;


    }

    public static void display(Node head) {
        if (head == null) {
            return;
        }
        System.out.print(head.val + " ");
        display(head.next);
    }


    public static void main(String[] args) {

        Node a = new Node(21);
        Node b = new Node(43);
        Node c = new Node(2);
        Node d = new Node(4);
        Node e = new Node(5);
        Node f = new Node(7);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        display(a);
        Node r= reverse(a);
        display(r);
    }
}
