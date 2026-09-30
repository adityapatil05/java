package dsa.linkedList;

class Node{
    int data;   //data tobe stored in Linked List
    Node next;  //Reference to the next node

    public Node(int data) {
        this.data = data;
        next=null;
    }
}

class LinkedList{
    Node head;  //Creating Head
    int count;  //Creating count variable for size and Adding to last postion

    public void addAtEnd(int data){
        Node newNode=new Node(data);
        count++;

        if(head==null){
            head=newNode;
            return;
        }

        Node temp =head;
        while (temp.next != null){
            temp=temp.next;
        }
        temp.next=newNode;
    }

    public void display(){
        Node temp=head;

        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public void addAtFront(int data){
        Node newNode=new Node(data);
        count++;
        if(head==null){
            head =newNode;
            return;
        }
        newNode.next =head;
        head=newNode;

    }

    public void addAtPosition(int position, int data){
        Node newNode=new Node(data);
        //Handling Negative position
        if(position< 0||position> count){
            System.out.println("Please Enter Correct Position , Invalid position....");
            return;
            //handled
        }
        //Handling position 0
        if(position==0){
            addAtFront(data);
            return;//handled
        }
        //Handling last position of Linked List
        if (position == count) {
            addAtEnd(data);
            return;
            //handled
        }
        Node temp =head;
        for (int i = 0; i < position - 1; i++) {    //position -1 becoz position has reference of next node
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        count++;
    }

    public void deleteHead(){
        Node temp=head;
        head=temp.next;
        temp.next=null;
        count--;
    }

    public void deleteAtPosition(int position){
        Node temp=head;
        if (position==0) {
            deleteHead();
            return;
        }
        if(position<0||position>count){
            System.out.println("Invalid position to Delete..... ");
            return;
        }
    if(position==count){
        deleteEnd();
        return;
    }
    for(int i=0;i<position-1;i++){
        temp=temp.next;
    }
    temp.next=temp.next.next;
    count--;
    }

    public void deleteEnd(){
        Node temp=head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        count--;
    }

    public void deleteByValue(int value){
        Node temp=head;
        while(temp.next !=null){
            if(temp.next.data==value){
                temp.next=temp.next.next;

            }
            temp=temp.next;

        }
        count--;

    }

    public void reverse(){
        Node temp=head;
        Node previous=null;
        Node current=head;
        Node next;

        while (current!=null){
            next=current.next;
            current.next=previous;
            previous=current;
            current=next;
        }
        head=previous;
    }

    public int size(){
        return count;
    }

}
public class LinkedListTest {
    static void main(String[] args) {
        LinkedList linkedList =new LinkedList();
        linkedList.addAtEnd(10);
        linkedList.addAtEnd(20);
        linkedList.addAtEnd(30);
        linkedList.display();


        linkedList.addAtFront(9);
        linkedList.addAtFront(7);
        linkedList.display();

        linkedList.addAtPosition(0,5);
        linkedList.addAtPosition(9,55);
        linkedList.display();
        //System.out.println(linkedList.size());

        linkedList.deleteEnd();
        linkedList.display();

        linkedList.deleteHead();
        linkedList.display();
        linkedList.deleteAtPosition(2);
        linkedList.display();

        linkedList.deleteAtPosition(8);


        linkedList.addAtEnd(30);
        linkedList.display();

        linkedList.deleteByValue(9);
        linkedList.display();

        linkedList.reverse();
        linkedList.display();



    }
}
