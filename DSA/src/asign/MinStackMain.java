package asign;

public class MinStackMain {
    static void main(String[] args) {
            Get_Minimum_Stack minimumStack =new Get_Minimum_Stack();
            minimumStack.push(5);
            minimumStack.push(3);
            minimumStack.push(7);
            minimumStack.push(2);

            System.out.println("Minimum Stack Value: "+minimumStack.getMin());

            minimumStack.pop();
            minimumStack.pop();

            System.out.println("Minimum Stack Value: "+minimumStack.getMin());

        }

    }

