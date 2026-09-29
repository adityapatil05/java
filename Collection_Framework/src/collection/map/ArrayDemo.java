package collection.map;

import java.util.Arrays;

public class ArrayDemo {

	public static void main(String[] args) {

		int arr[]= {50,82,33,44,55,67,8,99};
		
		System.out.println("Original Array:"+Arrays.toString(arr));
		
		int fillArr[]=new int[8];
		Arrays.fill(fillArr,5);
		
		System.out.println("After Arrays.fill(): "+Arrays.toString(fillArr));
		
		int partArr[]=new int [8];
		Arrays.fill(partArr, 2,6,10);
		System.out.println("Partial Fill: "+Arrays.toString(partArr));
		
		int cloneArr[] =arr.clone();
		
		System.out.println("Cloned Array: "+Arrays.toString(cloneArr))	;
		
		System.out.println("Arrays are Equal: "+Arrays.equals(arr, cloneArr));
		
		Arrays.sort(arr,1,6);
		
		System.out.println("After partial Sorting: "+Arrays.toString(arr));
	}

}
