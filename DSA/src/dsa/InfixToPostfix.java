package dsa;

import java.util.ArrayDeque;
import java.util.Deque;

public class InfixToPostfix {

    public static String infixToPostfix(String infix){
        StringBuilder postfix=new StringBuilder();
        Deque<Character> stack =new ArrayDeque<>();
        char[] input=infix.toCharArray();
        //'s'cope
        for(char c: input){
            //s'c'ope
            if(Character.isLetterOrDigit(c)){
                postfix.append(c);
            }
            //sco'p'e
            else if(c=='('){
                stack.push(c);
            } else if (c==')') {
                while(!stack.isEmpty() && stack.peek()!='('){
                    postfix.append(stack.pop());

                }
                stack.pop();

            }
        else{
            while(!stack.isEmpty() && stack.peek()!='('&& getPrecedence(stack.peek())>=getPrecedence(c)){
                postfix.append(stack.pop());
        }
            stack.push(c);
            }
        }
        while(!stack.isEmpty()){
             postfix.append(stack.pop());
        }
        return postfix.toString();
    }
    private static int getPrecedence(char c){
        int precendence= switch (c){
            case '^' -> 3;
            case '*','/' -> 2;
            case '+','-' -> 1;
            default -> 0;
        };
        return precendence;
    }
    public  static int PostFixEvaluation(String postfix) {
        Deque<Integer> stack = new ArrayDeque<>();
        char[] input = postfix.toCharArray();
        for (char c : input) {
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else if (!stack.isEmpty() && c == '+' || c == '-' || c == '*' || c == '/' || c == '^') {
                int operand2 = stack.pop();
                int operand1 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(operand1 + operand2);
                        break;
                    case '-':
                        stack.push(operand1 - operand2);
                        break;
                    case '*':
                        stack.push(operand1 * operand2);
                        break;
                    case '/':
                        stack.push(operand1 / operand2);
                        break;
                }
            }
        }
        return  stack.pop();
    }
    static void main() {
        System.out.println(infixToPostfix("2+4(4*5-9)"));
        String infix=infixToPostfix("2+4+(4*5-9)");
        System.out.println("Result: "+PostFixEvaluation(infix));
    }
}
