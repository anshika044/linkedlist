package linkedlist;

public class deepcopyLL {
    public static class node{
        int data;
        node next;
        public node(int data){
            this.data=data;
        }
    }

    public static boolean isreverse(node head1 ,node newhead){
    node temp1=head1;
    node temp2=newhead;
    while(temp1!=null){
        if(temp1.data==temp2.data){
            temp1=temp1.next;
            temp2=temp2.next;
            return true;
        }
       
    }
    return false;


    }
    public static node reverse(node head){
        if(head.next==null)return head;
        node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;

    }
    

    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        node a= new node(1);
        node b= new node(2);
        node c= new node(3);
        node d= new node(3);
        node e= new node(2);
        node f= new node(2);
        
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        f.next=null;
    
        System.out.println("original list");
        display(a);
        System.out.println();
        System.out.println("reverse list");
        node g =reverse(a);
        display(g);
        System.out.println();
        System.out.println(isreverse(a, f));


    }
    
}
