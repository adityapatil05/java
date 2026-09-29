package asign;

public class Binary_Search {

	public static void main(String[] args) {

		int arr[] = { 12, 13, 15, 25, 34, 36, 45, 56, 67, 78, 89, 90, 98 };
		int target = 89;
		System.out.println(binary_Search(arr, target));
	}

	public static int binary_Search(int arr[], int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (arr[mid] == target)
				return mid;
			if (target < arr[mid]) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;

	}

}
