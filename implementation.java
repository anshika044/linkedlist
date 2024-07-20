package linkedlist;

public class implementation {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
        }
    }
    public static class linkedlist{
        Node head=null;
        Node tail=null;
        int size=0;
        int getelement(int idx){
            Node temp=head;
            for(int i=1; i<=idx; i++){
                temp=temp.next;
            }
            return temp.data;
        }
        //function
        void insertAtEnd(int val){
            Node temp= new Node(val);
            if(head==null){
                head=temp;
            }else{
                tail.next=temp;
            }
            tail=temp;
            size++;
        }

        void deleteAt(int idx){
            Node temp=head;
            for(int i=1;i<=idx-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            tail=temp;
            size--;
        }

        // int size(){
        //     Node temp=head;
        //     int count=0;
        //     while(temp!=null){
        //         count++;
        //         temp=temp.next;;
        //     }
        //     return count;
        // }
        //function
        void displayy(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }

        }

        void insertAtHead(int val){
            Node temp=new Node(val);
            if(head==null){
                head=tail=temp;
            }else{
                temp.next=head;
                head=temp;
            }
            size++;
        }

        void insertAt(int idx,int val){
            Node t=new Node(val);
            Node temp=head;
            if(idx==size){
                insertAtEnd(val);
                return;
            }
            else if(idx==0){
                insertAtHead(val);
                return;
            }else if(idx<0 || idx>size){
                System.out.println("wrong");
                return;
            }
            for(int i=1; i<=idx-1;i++){//temp zero pr h hi
                temp=temp.next;
            }
            t.next=temp.next;
                temp.next=t;
                size++;
        }
            
    }



    public static void main(String[] args) {
    linkedlist ll =new linkedlist();
    ll.insertAtEnd(4);
    ll.insertAtEnd(5);
    ll.displayy();
    System.out.println();
    ll.insertAtEnd(13);
    ll.insertAtHead(8);
    ll.displayy();
    System.out.println();
    // System.out.println(ll.size);
    System.out.println();
    ll.insertAt(5, 9);
    ll.displayy();
    System.out.println();
    System.out.println(ll.getelement(2));
    System.out.println(ll.size);
    ll.deleteAt(3);
    ll.displayy();
    System.out.println();
    System.out.println(ll.size);
    System.out.println(ll.tail.data);
    

        
    }
    
}
