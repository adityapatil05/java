package dsa.linkedList;

public class CircularLinkedList {
    class Node {
        int data;
        Node next;  //Reference to the next node

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

        Node tail;
        int count;

        public void addAtEnd(int data){
            Node newNode=new Node(data);
            count++;
            if(tail==null){
                tail=newNode;
                tail.next=tail;
                return;
            }
            newNode.next=tail.next;
            tail.next=newNode;
            tail=newNode;
        }

        public void addAtFront(int data){
            Node newNode=new Node(data);
            count++;
            if(tail==null){
                tail=newNode;
                tail.next=tail;
                return;
            }
            newNode.next=tail.next;
            tail.next=newNode;

        }
        public void deleteAtEnd(){
            if(tail==null){
                System.out.println("Nothing to Delete......");
                return;
            }
            Node temp=tail.next;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=tail.next;
            tail=temp;
            count--;
        }

        public void deleteAtBeginning(){
            if(tail==null){
                System.out.println("Nothing to delete......" );
                return;
            }
            Node temp=tail;
            while(temp!=tail){
                temp=temp.next;
            }
            temp.next=tail.next.next;

            count--;
        }
        public void addAtPosition(int position, int data){
            if(position==0){
                addAtFront(data);
                return;
            }
            if(position< 0 || position > count){
                System.out.println("Invalid position .......");
                return;
            }
            if(position==count){
                addAtEnd(data);
                return;
            }
            Node newNode=new Node(data);
            count++;
            Node temp =tail;
            for(int i=0;i<position-1;i++){
                temp=temp.next;
            }
            newNode.next=temp.next;
            temp.next=newNode;
        }

        public void deleteAtPosition(int position){
            if(position==0){
                deleteAtBeginning();
                return;
            }
            if(position==count){
                deleteAtEnd();
                return;
            }
            if(position< 0 || position > count){
                System.out.println("Invalid Position.....");
                return;
            }
            Node temp=tail.next;
            for(int i=0;i<position-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            count--;
        }
        public void deleteAtValue(int value){
            Node temp=tail;
            while(temp.next.data!= value){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            count--;
        }
        public void display(){
            Node temp=tail.next;
            do{
                System.out.println(temp.data);
                temp=temp.next;
            }
            while (temp!=tail.next);

        }
        public void size(){
            System.out.println("Size: "+count);
        }

    static void main(String[] args) {
        CircularLinkedList list =new CircularLinkedList();

        list.addAtEnd(100);
        list.addAtFront(10);
        list.display();
        System.out.println("*********");
        list.addAtPosition(1,20);
        list.addAtFront(5);
        list.addAtEnd(6);
        list.display();
        System.out.println("******************" );
        list.deleteAtBeginning();
        list.deleteAtEnd();
        list.display();
        System.out.println("********************"  );
        list.deleteAtPosition(1);
        list.display();
        System.out.println("**************" );
        list.size();

//        list.deleteAtValue();
    }


}

