package collection.map;

public class GenericDemo {

	public static void main(String[] args) {
		
				Asign18<Integer>m1=new Asign18<Integer>();
				m1.setData(100);
				System.out.println("Integer: "+m1.getData());
				
				Asign18<String> m2=new Asign18<String>();
				m2.setData("Hello");
				System.out.println("String: "+m2.getData());
				
				Asign18<Double>m3=new Asign18<Double>();
				m3.setData(25.5);
				System.out.println("Double:"+m3.getData());
				
				Integer[]a= {12,45,39,34,54};
				
				System.out.println("\nInteger Array: ");
				ArrayOperations.printArray(a);
				
				System.out.println("Search 30:"+ArrayOperations.searchInArray(a,30));
				
				String[]s= {"java","cpp","Python"};
				
				System.out.println("\nStirng Array:");
				ArrayOperations.printArray(s);
				
				System.out.println("Search  java:"+ArrayOperations.searchInArray(s,"java"));
			}
		

	}



