package dsa.arrays;

public class PrintSubarray {
    static void main() {
        int[] arr={1,2,3,4,5,6,7,8};
        printSubarray(arr);
    }
    public static void printSubarray(int[] arr){
        int tp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int k = i; k <= j; k++) {
                    IO.print(arr[k]+" ");
                }
                tp++;
                IO.println();
            }
            IO.println();
        }
        IO.println("Total Array "+tp);
    }
}
