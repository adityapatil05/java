package dsa.arrays;


public class PairsInAnArray {
    static void main() {
        int[] arr={2,4,6,8,10};
        printPairs(arr);
    }
    public static void printPairs(int[] arr){
         for(int i=0;i< arr.length;i++){
             int curr=arr[i];
             for (int j = i+1; j < arr.length; j++) {
                 IO.print("("+curr+","+arr[j]+") ");
             }
             IO.println();
         }
    }
}
