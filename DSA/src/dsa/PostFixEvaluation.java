package dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class PostFixEvaluation {

    public  static int PostFixEvaluation(String postfix){
        Deque<Integer> stack= new ArrayDeque<>();
        char[] input =postfix.toCharArray();
        for(char c: input){
        if(Character.isDigit(c)){
            stack.push(c - '0');
        } else if (!stack.isEmpty()&&c=='+'|| c=='-'||c=='*'|| c=='/'||c=='^') {
            int operand2=stack.pop();
            int operand1 = stack.pop();

            switch (c) {
                case '+': stack.push(operand1 + operand2); break;
                case '-': stack.push(operand1 - operand2); break;
                case '*': stack.push(operand1 * operand2); break;
                case '/': stack.push(operand1 / operand2); break;
            }
        }
        }

        return  stack.pop();
    }
    static void main(String[] args) {
    String infix = "295*+47+-";
        System.out.println("Result: "+PostFixEvaluation(infix));
    }


}
