package linkedlist;

public class nthnodefromend {

    public static node nthnode(node head,int n){
        int size=0;
        node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        int m=size-n+1;
        //mth node from start
        temp=head;
        for(int i=1;i<=m-1;i++){
            temp=temp.next;
        }
        return temp;
    }

    public static node deleteNthNodeFromEnd(node head,int n){
        node slow=head;
        node fast=head;
        for(int i=1; i<=n;i++){
            fast=fast.next;

        }
        if(fast==null){
            head=head.next;
            return head;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    public static node nthnode2(node head, int n){
        node slow=head;
        node fast=head;
        for(int i=1; i<=n; i++){
            fast=fast.next;
        }
        while (fast!=null) {
            slow=slow.next;
            fast=fast.next;
            
        }
        return slow;
    }

    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }

    }
    public static class node{
        int data;
        node next;
       node(int data){
        this.data=data;
       }
    }


    public static void main(String[] args) {
        node a= new node(2);
        node b= new node(3);
        node c= new node(4);
        node d= new node(6);
        node e= new node(8);
        node f= new node(9);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        // node q=nthnode2(a,3);
        // node g=nthnode(a, 3);
        // System.out.println(q.data);
        // System.out.println(g.data);
        // display(a);
        // System.out.println();
        // deleteNthNodeFromEnd(a, 5);
         display(a);
         System.out.println();
        a=deleteNthNodeFromEnd(a, 5);
        display(a);


    }
    
}
