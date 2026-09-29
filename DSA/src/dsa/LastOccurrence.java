package dsa;

public class LastOccurrence {
    static void main (String args[]) {

        int target=2;
        int[] arr ={1,2,2,2,2,3,4,5,9};
        System.out.println(lastOccurrence(arr,target));

    }
    public static int lastOccurrence(int[] arr, int target){

        int left=0;
        int right= arr.length-1;
        while(left<=right){
            int mid=left+(right-left)/2;
            if(arr[mid]==target){
                for (int i=mid;i<=right;i++){
                    if(arr[i]!=target){
                        return i-1;
                    }
                }
            }
             if(arr[mid]<target){
                left=mid+1;

            }else
                right=mid-1;
            }
        return -1;
    }

}

