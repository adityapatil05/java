package dsa.linkedList;

public class QueueUsing_LinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }


    }
    Node next;
    Node front;
    Node rear;
    int count;

    public void enqueue(int data){
        Node newNode =new Node(data);
        count++;
        if(front==null){
            front=rear=newNode;
            return;
        }
        rear.next=newNode;
        rear=rear.next;
    }
    public void dequeue(){
        if(front==null){
            System.out.println("Empty Queue.......Nothing to Dequeue");
            return;
        }
        System.out.println(front.data);
        front=front.next;
        count--;

    }
    public void peek(){
        System.out.println(front.data);
    }

    public void display(){
        Node temp=front;
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }

    public void size(){
        System.out.println(count);
    }

    static void main(String[] args) {
        QueueUsing_LinkedList queue = new QueueUsing_LinkedList();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.display();
        System.out.println("**************" );
        queue.peek();
        System.out.println("**************" );
        System.out.println("*************************");
        queue.dequeue();
        queue.dequeue();
        System.out.println("************");
        queue.display();
        System.out.println("**************" );

        queue.peek();
        System.out.println("*********************");
        queue.display();
        System.out.println("*************************");
        queue.size();
    }

}
