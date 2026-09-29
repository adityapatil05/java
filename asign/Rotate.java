package asign;

public class Rotate {

	public static void main(String[] args) {

		int arr[][] = { { 1, 3, 5 }, { 9, 4, 7 }, { 6, 3, 8 } };

	}

	public static void rotate(int[][] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = arr[i][j];
				arr[i][j] = arr[j][i];
				arr[j][i] = temp;
			}
		}

		for (int i = 0; i < n; i++) {
			int l = 0, r = n - 1;
			while (l < r) {
				int temp = arr[i][l];
				arr[i][l] = arr[i][r];

			}
		}
	}

}
