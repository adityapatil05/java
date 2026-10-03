package dsa.recursion;

public class BinarySearch_usingRecursion {
    public static int binarySearch(int [] arr, int target,int left ,int right){

        int mid=left+(right - left)/2;
        if (arr[mid] == target)
                return mid;

        if(left> right)return -1;

        if (target< arr[mid])
           return binarySearch(arr,target,left,mid-1);

        else return binarySearch(arr,target,mid+1,right);
        
    }

    static void main(String[] args) {
        int[] arr={1,3,5,7,9,12,13};
        int target=12;
        int right=arr.length-1;
        int left=0;

        System.out.println(binarySearch(arr,target,left,right));
    }
}
