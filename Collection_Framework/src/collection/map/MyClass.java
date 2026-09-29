package collection.map;

import java.util.Arrays;

public class MyClass <T>{
	private T data;
	public void setData(T data) {
		this.data=data;
		
	}
	public T getData() {
		return data;
		
	}

}
class ArrayOperations1
{
	public static <T>void printArray(T[] arr){
		for(T x:arr) {
			System.out.println(x +"");
		}
		System.out.println();
	}
	
	public static <T>boolean searchArray(T[] arr,T key){
		for(T x: arr)
			if(x.equals(key)) return true;
		System.out.println();
		return false;
	}
	
	public static <T extends Comparable<T>>void sort(T[] arr)
	{
		Arrays.sort(arr);
	}
	
}


