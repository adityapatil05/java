package asign;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {

		boolean swapped;
		int arr[] = { 2, 3, 1, 9, 6, 5, 4 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			swapped = false;
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapped = true;
				}
			}
			if (!swapped)
				break;
		}
		System.out.println(Arrays.toString(arr));
	}
}
