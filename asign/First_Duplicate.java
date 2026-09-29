package asign;

public class First_Duplicate {

	public static void main(String[] args) {

		int target = 9;
		int arr[] = { 1, 2, 3, 4, 7, 9, 9, 9, 10 };
		System.out.println(firstOccurance(arr, target));
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

}
