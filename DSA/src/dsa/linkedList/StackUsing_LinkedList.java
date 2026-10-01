package dsa.linkedList;

public class StackUsing_LinkedList {
    class Node{
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }

    }
    Node top;
    int count;
    public void push(int data){
        Node newNode=new Node(data);
        count++;
        if(top==null){
            top=newNode;
            return;
        }
        newNode.next=top;
        top=newNode;
    }

    public void pop(){
        if(top==null){
            System.out.println("Stack is Empty.......");
            return;
        }
        top=top.next;
        count--;

    }
    public void peek(){
        System.out.println(top.data);

    }

    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }

    }
    public void size(){
        System.out.println(count);

    }

    static void main(String[] args) {
        StackUsing_LinkedList stack = new StackUsing_LinkedList();
        stack.push(90);
        stack.push(80);
        stack.push(70);
        stack.push(60);
        stack.peek();
        System.out.println("****************");
        stack.display();
        System.out.println("********************");
        stack.size();
        stack.pop();
        stack.pop();
        System.out.println("************************");
        stack.peek();
        System.out.println("**********************************");
        stack.display();
    }
}
