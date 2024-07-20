package linkedlist;

public class middleelement {

    public static node middle(node head){
        node slow=head;
        node fast=head;
        while( fast.next!=null && fast.next.next!=null   ){//odd and left even middle
            slow=slow.next;
            fast=fast.next.next;
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
        public node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        node a=new node(1);
        node b=new node(2);
        node c=new node(3);
        node d=new node(4);
        node e=new node(5);
         node f=new node(6);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
         e.next=f;
        System.out.println("list appear");
        display(a);
        node z=middle(a);
        System.out.println();
        System.out.println(z.data);

        
        

        

    }
    
}
