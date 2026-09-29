package collection.map;

public class GenericDemo21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass<Integer>m1=new MyClass<Integer>();
		m1.setData(100);
		System.out.println("Integer: "+m1.getData());
		
		MyClass<String>m2=new  MyClass<String>();
		m2.setData("Java");
		System.out.println("String :"+m2.getData());
		
		Integer a[] = {55,32,43,89,20};
		
		System.out.println("\nInteger Array: ");
		ArrayOperations1.printArray(a);
		
		System.out.println("Search 40: "+ArrayOperations1.searchArray(a, 43));
		
		ArrayOperations1.sort(a);
		
		System.out.println("Sorted Integer Array: ");
		ArrayOperations1.printArray(a);
		
		String s[] = {"Orange","Apple","Mango","Papaya"};
		
		System.out.println("\nString Array: ");
		ArrayOperations1.printArray(s);
		
		System.out.println("Search Mango: "+ArrayOperations1.searchArray(s, "Mango"));
		
		ArrayOperations1.sort(s);
		
		System.out.println("Sorted String Array: ");
		ArrayOperations1.printArray(s);
	}

}
