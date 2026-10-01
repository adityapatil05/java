package dsa.linkedList;

class DoublyLinkedList {
        class Node {
            int data;
            Node next;
            Node prev;

            public Node(int data) {
                this.data = data;
            }
        }

        Node head, tail;
        int count=0;

        public void addAtEnd(int data){
            Node newNode = new Node(data);
            count++;
            if (head == null) {
                head=tail=newNode;
                return;
            }
            while(tail.next!=null) {
                tail = tail.next;

            }
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }

        public void addAtFront(int data){
            Node newNode =new Node(data);
            count++;
            if (head == null) {
                head=newNode;
                return;
            }
            newNode.next=head;
            head.prev=newNode;
            head =newNode;

        }

        public void addAtPosition(int position, int data){
            if(position==0){
                addAtFront(data);
                return;
            }
            if(position<0 || position>count){
                System.out.println("Invalid Position...Enter Valid Position....");
                return;
            }
            if(position==count){
                addAtEnd(data);
                return;
            }

            Node newNode =new Node(data);
            count++;
            Node temp=head;
            for(int i=0; i<position-1; i++){
                temp = temp.next;
            }
            newNode.prev=temp;
            newNode.next=temp.next;
            temp.next.prev=newNode;
            temp.next=newNode;

        }

        public void displayForward(){
            if(head==null){
                System.out.println("Nothing to Display......");
                return;
            }
            Node temp=head;
            while (temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }

        public void displayBackword(){
            if(tail==null)
            {
                System.out.println("Nothing to Display......");
                return;
            }
            Node temp=tail;
            while (temp!= null){
                System.out.println(temp.data);
                temp=temp.prev;
            }
        }

        public void deleteAtEnd(){
            if(tail==null){
                System.out.println("Nothing to Delete.....");
                return;
            }
            tail=tail.prev;
            tail.next=null;
            count--;
        }

        public void deleteAtBeginning(){
            if(head==null){
                System.out.println("Nothing to delete.....");
                return;
            }
            head=head.next;
            head.prev=null;
            count--;
        }

        public void deleteAtPosition(int position){
            if (position == 0) {
                deleteAtBeginning();
                return;
            }
            if(position==count){
                deleteAtEnd();
                return;
            }
            if(position>count){
                System.out.println("Invalid Position to Delete......");
                return;
            }
            Node temp =head;
            for(int i=0;i<position-1;i++){
                temp=temp.next;
            }
            temp.next.prev=null;
            temp.next=temp.next.next;
            temp.next.prev=temp;
            count--;
        }
        public int size(){
            return count;
        }

    }
public class DoublyLinkedListTest {
    static void main(String[] args) {
        DoublyLinkedList doublyLinkedList=new DoublyLinkedList();

        doublyLinkedList.addAtEnd(90);
        doublyLinkedList.addAtEnd(80);
        doublyLinkedList.addAtFront(10);
        doublyLinkedList.displayForward();
        System.out.println("**********************");
        doublyLinkedList.deleteAtBeginning();
        doublyLinkedList.displayForward();
        System.out.println("**************");
        doublyLinkedList.displayBackword();
        System.out.println("***************");
        doublyLinkedList.addAtPosition(1,20);
        doublyLinkedList.displayForward();
        System.out.println("*******************"   );
        doublyLinkedList.addAtFront(1);
        doublyLinkedList.deleteAtEnd();
        doublyLinkedList.displayForward();
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&");
        doublyLinkedList.displayBackword();
        System.out.println(doublyLinkedList.size());
    }
}
