package collection.map;

public class Asign18 <T>{
	private T data;
	public void setData(T data)
	{
		this.data= data;
	}
	public T getData()
	{
		return data;
		
	}
}
	
	class ArrayOperations
	{
		public static <T> void printArray(T[]arr)
		{
			for(T x:arr)
				System.out.println(x);
		}
		
		public static <T> boolean searchInArray(T[]arr,T key) {
			for (T x:arr) {
				if(x.equals(key))return true;
			}
			return false;
		}
	}
	
	
	

