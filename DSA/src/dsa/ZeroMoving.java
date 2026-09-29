package dsa;

import java.util.Arrays;

public class ZeroMoving {


    static void main(String[] args) {

        int[] arr = {3, 0, 21, 0, 9, 12, 0};
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] == 0) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[j] != 0) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                        break;
                    }
                }
            }




        }
        System.out.println(Arrays.toString(arr));
    }
}
