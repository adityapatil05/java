package asign;

import java.util.Arrays;

public class Transpose {

	public static void main(String[] args) {

		int arr[][] = { 
				{ 1, 3, 5 },
				{ 9, 4, 7 },
				{ 6, 3, 8 }
				};
		transpose(arr);

		for (int[] row : arr)
			System.out.println(Arrays.toString(row));

	}

	public static void transpose(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

	}
}
