package dsa;

import java.util.Arrays;

public class Selection_Sort {
    static void main(String[] args) {


        int[] arr = { 34, 56, 2,1,99};
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]< arr[minIndex]){
                    minIndex =j;
                }
            }
            if(i!=minIndex){
                    int temp=arr[i];
                    arr[i]=arr[minIndex];
                    arr[minIndex]=temp;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
