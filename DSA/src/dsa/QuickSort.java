package dsa;

import java.util.Arrays;

public class QuickSort {
	public static void main(String[] args) {

		int[] arr = { 2, 5, 7, 2, 8, 10, 78 };
		int n = arr.length - 1;
		quickSort(arr, 0, n);
		System.out.println(Arrays.toString(arr));
	}

	private static void quickSort(int[] arr, int low, int high) {

		if (low < high) {
			int partationingIndex = partitioning(arr, low, high);
			quickSort(arr, low, partationingIndex - 1);
			quickSort(arr, partationingIndex + 1, high);
		}
	}

	public static int partitioning(int[] arr, int low, int high) {

		int pivot = high;
		int fence = low - 1;
		for (int i = low; i < high; i++) {
			if (arr[i] < pivot) {
				fence = fence + 1;
				swap(arr, fence, i);
			}

		}

		swap(arr, fence + 1, high);

		return fence + 1;
	}

	private static void swap(int[] arr, int fence, int i) {
		int temp = arr[i];
		arr[i] = arr[fence];
		arr[fence] = temp;
	}
}
