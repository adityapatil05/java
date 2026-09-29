package asign;

import java.util.Arrays;

public class ReverseArray {

	public static void main(String[] args) {
		int[] arr = new int[] { 1, 3, 4, 6, 8 };

		System.out.println(Arrays.toString(arr));
		reverse(arr);
		System.out.println(Arrays.toString(arr));

	}

	public static void reverse(int[] array) {

		int i = 0, j = array.length - 1;
		while (i < j) {
			int temp = array[i];
			array[i] = array[j];
			array[j] = temp;

			i++;
			j--;

		}

	}
}
