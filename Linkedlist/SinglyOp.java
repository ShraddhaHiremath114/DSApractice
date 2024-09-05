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

    public static void main(String[] args) {
        SinglyOp ob=new SinglyOp();
        ob.insertAtBeg(10);
        ob.insertAtBeg(20);
        ob.insertAtBeg(30);
        ob.insertAtEnd(5);
        ob.display();
    }
}