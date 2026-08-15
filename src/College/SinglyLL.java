package College;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class SinglyLL {
    Node head =null;
    public void addFirst(int data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty List");
            return;
        }
        head=head.next;
    }
public void deleteLast(){
        if(head==null){
            System.out.println("Empty list");
            return;
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node curr=head;
        while (curr.next.next!=null){
            curr=curr.next;
        }
        curr.next=null;
}
   void display(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+ " ->");
            curr=curr.next;
        }
       System.out.println("null");
    }
    public static void main(String[] args) {
        SinglyLL list=new SinglyLL();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addFirst(7);
        list.display();

        list.deleteFirst();
        list.display();

        list.deleteLast();
        list.display();
    }
}

