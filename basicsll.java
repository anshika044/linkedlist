package linkedlist;

public class basicsll {

    public static void insertAtEnd(node head, int val){
        node temp=new node(val);
        node t= head;
        while(t.next!=null){
            t=t.next;
        }
        t.next=temp;
    }

    public static int length(node head){
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        return count;
    }

    public static void displayr(node head){
        if(head==null)return;
        System.out.print(head.data);
        displayr(head.next);
    }

    

    public static void display(node head){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.data+ " ");
            temp=temp.next;
        }
    }
    public static class node{
        int data;//value
        node next;//address of next node
        public node(int data){
            this.data=data;
        }
    }

    public static void main(String[] args) {
        node a=new node(5);
        node b=new node(3);
        node c=new node(4);
        node d=new node(8);
        node e=new node(9);
        node f=new node(2);
        //5 3 4 8 9 2
        a.next=b;//5 -> 3 4 8 9 2
        b.next=c;//5 -> 3 -> 4 8 9 2
        c.next=d;//5 -> 3 -> 4 -> 8 9 2
        d.next=e;//5 -> 3 -> 4 -> 8 -> 9 2
        e.next=f;//5 -> 3 -> 4 -> 8 -> 9 -> 2
        System.out.println(a.next.data);//b data
        // node temp=a;
        // while(temp!=null){
        //     System.out.print(temp.data+" ");
        //     temp=temp.next;
        // }
         int lr=length(a);
        System.out.println(lr);
        display(a);

        System.out.println();
        displayr(a);
        System.out.println();
        insertAtEnd(a, 6);
        display(a);
       

    }
    
}
