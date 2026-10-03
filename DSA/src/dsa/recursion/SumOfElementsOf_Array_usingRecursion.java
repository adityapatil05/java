package dsa.recursion;

public class SumOfElementsOf_Array_usingRecursion {
    public static int sum(int [] arr,int index){
        if(index== arr.length)return 0;
        return arr[index]+sum(arr, index+1);
    }

    static void main(String[] args) {
        int[] arr={1,3,4,5,6};
        System.out.println(sum(arr,0));
    }
}
