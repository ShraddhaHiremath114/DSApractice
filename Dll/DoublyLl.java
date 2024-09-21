
    
public class DoublyLl{
    class Node{
        int data;
        Node next;
        Node prev;
    
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    
    }
    Node head;
    
    public void insertAtBeg(int data){
        
        Node newnode=new Node(data);
        if(head!=null){
            newnode.next=head;
        head.prev=newnode;
        
        }
        head=newnode;

    }

    public void display(){
        if(head==null ){
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void insertAtEnd(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
        newnode.prev=temp;
    }

    public void insertAtPosition(int pos,int data){
        Node newnode=new Node(data);
        if (pos==1) {
            insertAtBeg(data);
            return;
        }
        Node temp=head;
        Node ptr=temp.next;
        for(int i=1;i<pos-1;i++){
            temp=ptr;
            ptr=ptr.next;
        }
        newnode.next=ptr;
        ptr.prev=newnode;
        newnode.prev=temp;
        temp.next=newnode;
    }
    public void deleteFirst(){
        Node temp=head;
        temp=temp.next;
        head=temp;
        head.prev=null;
    }
    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return;
    }
    public void deletePosition(int pos){
        if(pos==1){
            deleteFirst();
            return;
        }
        Node temp=head;
        Node ptr=temp.next;
        int i=1;
        while(i<pos-1){
            temp=ptr;
            ptr=ptr.next;
        }
        temp.next=ptr.next;
        ptr.next.prev=temp;
    }
    public void deleteKey(int key){
        if(key==head.data){
            deleteFirst();
            return;
        }
        Node temp=head;
        Node prev=null;

        while(temp!=null && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)return;
        if(temp.next==null){
            prev.next=null;
            return;
        }
        prev.next=temp.next;
        temp.next.prev=prev;
    }
    public static void main(String[] args) {
        DoublyLl dll=new DoublyLl();
        dll.insertAtBeg(10);
        dll.insertAtBeg(20);
        // dll.display();
        // System.out.println();
        dll.insertAtEnd(30);
        // dll.display();
        dll.insertAtPosition(1, 5);
        dll.display();
        System.out.println();
        dll.deleteFirst();
        dll.display();
        // dll.deleteLast();
        // System.out.println();
        // dll.display();
        System.out.println();
        // dll.deletePosition(2);
        dll.deleteKey(30);
        dll.display();
    }
}