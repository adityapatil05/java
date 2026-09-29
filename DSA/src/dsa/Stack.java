package dsa;

public class Stack {
    private int maxSize;
    private int[] arr;
    private int top;

    public Stack(int size) {
        this.maxSize = size;
        arr = new int[maxSize];
        top = -1;
    }

    public void push(int data) {
        if (isFull()) {
            System.out.println("Stack is full...");
            return;
        }
        arr[++top] = data;

    }

    private boolean isFull() {
        return top == maxSize - 1;
    }

private boolean isEmpty(){
        return top==-1;
}

    public int pop(){
        if(isEmpty()){
            System.out.println("Stack is Already Empty");
            return -1;
        }
        int data=arr[top];
        top--;
        return data;
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is Emoty");
            return -1;
        }

        return arr[top];
    }
    public void display(){
        for(int ch:arr){
            System.out.println(ch);
        }

    }




    static void main(String[] args) {
        Stack stack=new Stack(3);
        stack.push(3);
        stack.push(5);
        stack.push(9);
        System.out.println("Pop: "+stack.pop());
        System.out.println("Pop: "+stack.pop());
        System.out.println("Peek: "+stack.peek());

        stack.display();
    }
}
