package dsa.queue;

public class LinearQueue {
    int maxSize;
    int[] queue;
    int front ;
    int rear;


    public LinearQueue(int size){
        this.maxSize=size;
        queue=new int[maxSize];
        front=0;
        rear=-1;

    }
    private boolean isEmpty(){
        return front>rear;
    }
    private boolean isFull(){
        return rear == maxSize-1;


    }

    public void enqueue(int data) {
        if(isFull()) {
            System.out.println("Queue is Full...");
           return;
        }
       else {
           queue[++rear] = data;

            return;
        }
    }

    public int dequeue(){
        if(isEmpty()) {
            System.out.println("Queue is Empty...");
            return -1;
        }
            else {
            int data = queue[front];
            front++;
            return data;
            }

    }
    public  int peek(){
        if(isEmpty())
            System.out.println("Nothing in Queue...");
        else
        return queue[front];

        return -1;
    }

    static void main(String[] args) {
        LinearQueue linearQueue = new LinearQueue(5);
        linearQueue.enqueue(2);
        linearQueue.enqueue(4);
        linearQueue.enqueue(6);
        linearQueue.enqueue(8);
        linearQueue.enqueue(10);
        System.out.println(linearQueue.dequeue());
        linearQueue.enqueue(12);
        System.out.println(linearQueue.dequeue());
        System.out.println(linearQueue.dequeue());
        System.out.println(linearQueue.dequeue());
        System.out.println(linearQueue.dequeue());
        System.out.println(linearQueue.dequeue());
        linearQueue.peek();
        linearQueue.enqueue(14);

    }

}
