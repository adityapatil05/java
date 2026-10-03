package dsa.recursion;

public class Fibonacci_using_Recursion {

    public static int fibonacci(int n){
        if( n==1) return 1;
        if(n==0)  return 0;

        return fibonacci(n-1)+fibonacci(n-2);
    }
    static void main(String[] args) {
        int n = 5;
        fibonacci(n);
        System.out.println("***************");
        System.out.println("Printing Fibonacci Series to "+n+"....");

        for (int i = 0; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    }

