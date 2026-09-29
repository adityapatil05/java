package dsa;

import java.util.Arrays;

public class InsertionSort {
    static void main(String[] args) {
        int[] arr = {5, 3, 2, 8, 7, 6};
        insertionSort(arr);

    }


        public static void insertionSort ( int[] arr){
            int position = 0;
            int n = arr.length;
            for (int i = 1; i < n; i++) {
                int cardPlace = arr[i];
                position=i-1;
                while (position >= 0 && arr[position] > cardPlace) {
                    arr[position + 1] = arr[position];
                    position--;
                }
                arr[position + 1] = cardPlace;
            }
            System.out.println(Arrays.toString(arr));
        }
    }
