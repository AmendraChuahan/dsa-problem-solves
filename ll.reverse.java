scond way to reverse linkedlist print
public class Main {

    public static class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }
    // recursion use this code
    public static Node reverse( Node head) {
        if(head.next==null) return head;
        Node newhead= reverse(head.next);
        head.next.next= head;
        head.next=null;
        return newhead;

    }
    // yaha code revser ka but esme node reverse nhi hoga balki value reverse hogi
//    public static void displayres(Node head){
//        if(head==null) return;
//        displayres(head.next);
//        System.out.println(head.next.val +" ");
//    }
    public static void display(Node head){
        if(head==null){
            return ;
        }
        System.out.print(head.val+ " ");
        display(head.next);
    }





        public static void main (String[] args){

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


