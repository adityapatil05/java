package dsa.recursion;


public class ReverseLinkedList_usingRecursion {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    Node head;
    int count=0;
    public void addAtEnd(int data) {
        Node newNode = new Node(data);
        count++;

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;

    }
    public static Node reverselist(Node head){
        return reverseusingrecursion(null,head);
    }
    public static Node reverseusingrecursion(Node prev ,Node current){
        if(current==null)return prev;

         Node next=current.next;
        current.next=prev;

        return reverseusingrecursion(current,next);

    }
    public void display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println("null");
    }

    static void main(String[] args) {
        ReverseLinkedList_usingRecursion list=new ReverseLinkedList_usingRecursion();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);

        list.display(list.head);
        System.out.println("***************8");
        list.head=reverselist(list.head);

        list.display(list.head);
    }

}
