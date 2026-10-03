package dsa.recursion;

public class Factorial_using_Recursion {
    public static int factorial(int n){
        if(n==0)return 1;
        return n * factorial(n-1);
    }

    static void main(String[] args) {
        int n=5;
        System.out.println(factorial(n));
    }
}
