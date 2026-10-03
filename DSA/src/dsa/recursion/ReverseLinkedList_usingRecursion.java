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
    public static Node reverseusingrecursion(Node head){
        if(head==null)return head;

        Node newHead = reverseusingrecursion(head.next);
        System.out.println(head.data);
        return newHead;

    }

    static void main(String[] args) {
        ReverseLinkedList_usingRecursion list=new ReverseLinkedList_usingRecursion();

        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.addAtEnd(40);
        list.addAtEnd(50);

        reverseusingrecursion(list.head);

    }

}
