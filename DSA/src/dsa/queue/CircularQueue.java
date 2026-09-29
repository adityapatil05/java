package dsa.queue;

 public class CircularQueue {
    private int[] queue;
    private int maxSize;
    private int front;
    private int rear;
    private int count;

    public CircularQueue(int size){
        this.maxSize=size;
        queue=new int[maxSize];
        front=0;
        rear=-1;
        count=0;
    }

    public void enqueue(int data){
        if(count==maxSize){
            System.out.println("Queue is full..."   );
            return;
        }
        rear=(rear+1)%maxSize;
        queue[rear]=data;
        count++;
    }

    public int dequeue(){
        if(count ==0){
            System.out.println("Queue is Empty..."  );
            return -1;
        }
        int data=queue[front];
        front=(front+1)%maxSize;
        count--;
        return data;

    }
    public int peek(){
        if(count==0)
        {
            System.out.println("Queue is Empty...."     );
            return -1;
        }
        int data=queue[front];
        return data;
    }
    public void display(){
        int index= front;
        System.out.print("Element in Queue: ");
        for(int i=0;i<count;i++){
            System.out.print(queue[index]+" ");
            index=(index+1)%maxSize;
        }
    }


    static void main(String[] args) {
        CircularQueue circularQueue=new CircularQueue(5);
        circularQueue.enqueue(10);
        circularQueue.enqueue(20);
        circularQueue.enqueue(30);
        circularQueue.peek();
        circularQueue.enqueue(40);
        System.out.println("Proccesed "+circularQueue.dequeue());
        System.out.println("Proccesed "+circularQueue.dequeue());
        System.out.println("Next Processing Element "+circularQueue.peek());
        circularQueue.display();
    }
    }

