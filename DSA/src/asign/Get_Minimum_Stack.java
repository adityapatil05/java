package asign;

import java.util.ArrayDeque;
import java.util.Deque;

public  class Get_Minimum_Stack {
    private Deque<Integer> mainstack;
    private Deque<Integer> minStack;

    public Get_Minimum_Stack(){
        mainstack=new ArrayDeque<>();
        minStack =new ArrayDeque<>();
    }
    public void push(int data){
        mainstack.push(data);

        if(minStack.isEmpty()|| data<= minStack.peek()){
            minStack.push(data);
        }
        else
            minStack.push(minStack.peek());

    }
    public void pop(){
        if(!mainstack.isEmpty()){
            mainstack.pop();
            minStack.pop();
        }
    }

    public int top(){
        return mainstack.peek();
    }

    public int getMin(){
        return minStack.peek();
    }
}

