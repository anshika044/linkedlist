package linkedlist;

public class RevRecurseLL {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }
    public static void display(node head){
        if(head==null)return;
        System.out.print(head.data+" ");
        display(head.next);
        }

        public static void displayrev(node head){
            if(head==null)return;
            displayrev(head.next);//call
            System.out.print(head.data+" ");//selfwork
            }

            public static node reverse(node head){
                if(head.next==null)return head;
                node newhead = reverse(head.next);
                head.next.next=head;
                head.next=null;
                return newhead;
            }


    public static void main(String[] args) {
        node a =new node(3);
        node b =new node(5);
        node c =new node(1);
        node d =new node(2);
        node e =new node(4);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=null;
        display(a);
        System.out.println();
        displayrev(a);
        System.out.println();
        node f =reverse(a);
        display(f);
    }
    
}
