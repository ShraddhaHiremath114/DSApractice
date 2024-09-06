class Node{
    int data;
    Node next;

    public Node(int data){
        this.data=data;
        this.next=null;
    }
}

public class SinglyOp{
    Node head;

    public void insertAtBeg(int data){
        Node newnode=new Node(data);
        newnode.next=head;
        head=newnode;
    }

    public void display(){
        Node temp=head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void insertAtEnd(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;

        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    public void insertAtInd(int data,int ind){
        Node newnode=new Node(data);
        Node prev=head;
        if(ind==0)insertAtBeg(data);
        int i=1;
        while (i<ind) {
            prev=prev.next;
            i++;
        }
        newnode.next=prev.next;
        prev.next=newnode;
    }

    public void insertAtPos(int data,int ind){
        Node newnode=new Node(data);
        Node prev=head;
        if(ind==1)insertAtBeg(data);
        int i=1;
        while (i<ind-1) {
            prev=prev.next;
            i++;
        }
        newnode.next=prev.next;
        prev.next=newnode;
    }

    public void deleteFirstNode(){
        head=head.next;
        return;
    }
    public void deleteLast(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return;
    }
    public void deleteKey(int key){
        Node temp=head,prev=null;
        if(temp!=null && temp.data==key){
            head=temp.next;
            return;
        }
        while (temp!=null && temp.data!=key) {
            prev=temp;
            temp=temp.next;
            

        }
        if(temp==null)return;
        prev.next=temp.next;

    }

    public static void main(String[] args) {
        SinglyOp ob=new SinglyOp();
        ob.insertAtBeg(10);
        ob.insertAtBeg(20);
        ob.insertAtBeg(30);
        // ob.insertAtEnd(5);
        // ob.insertAtInd(100, 4);
        // ob.insertAtPos(70, 3);
        // ob.insertAtPos(80, 6);
        // ob.insertAtPos(33, 8);
        // ob.deleteFirstNode();
        // ob.deleteLast();
        ob.deleteKey(30);
        ob.display();
    }
}