package dsa;

public class CountDuplicateOcc {
    static void main(String[] args) {
        int[] arr={0,1,2,2,2,2,2,9,12};
        int target=2;
        System.out.println(countDuplicateOccureance(arr,target));
    }
    public static int firstOccurance(int arr[], int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                for (int i = mid; i >= 0; i--) {
                    if (arr[i] != target) {
                        return i + 1;
                    }
                }
                right = mid - 1;
            }
            if (target > arr[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
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
    public  static int countDuplicateOccureance(int[] arr,int target){
        int first = firstOccurance(arr, target);
        int last = lastOccurrence(arr, target);

        if (first ==-1 || last ==-1) return 0;

        return last-first+1;
    }
}
