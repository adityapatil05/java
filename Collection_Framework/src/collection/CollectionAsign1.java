package collection;

import java.util.ArrayList;
import java.util.*;

public class CollectionAsign1 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		ArrayList<String> list=new ArrayList<>();
		
		System.out.println("Enter number of String");
		int n=sc.nextInt();
		sc.nextLine();
		
		for(int i =0;i<n;i++) {
			System.out.println("Enter String");
			String str =sc.nextLine();
			list.add(str);
			
		}
		
		System.out.println("\nNumber of elements: "+list.size());
		
		System.out.println("\nAdvanced For loop: ");
		for(String str:list)
			System.out.println(str);
		
		System.out.println("\nUsing Iterator");
		Iterator<String>itr = list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("\nfrom last to first: ");
		ListIterator<String>litr =list.listIterator(list.size());
		
		while(litr.hasPrevious())
			System.out.println(litr.previous());
		
		
		System.out.println("\nUsing forEach: ");
		list.forEach(str->System.out.println(str));
		
		Collections.sort(list);
		
		System.out.println("\nsorted List:: ");
		System.out.println(list);
		
		Collections.reverse(list);
		
		System.out.println("\nReversed List:: ");
		System.out.println(list);
		
		
		System.out.println("\nEnter String to search");
		String search=sc.nextLine();
		
		int index=list.indexOf(search);
		
		if(index!=-1)
			System.out.println("String is Present at index: "+index);
		else
			System.out.println("String is not Present");
		
		sc.close();
		
		
		
		
		
		
		
		/*System.out.println("\nElement in collection: ");
		System.out.println(list);
		
		System.out.println("\nEnter index to remove");
		int index = sc.nextInt();
		
		if(index>=0&& index<list.size()) {
			list.remove(index);
			System.out.println("\nCollection after removal: ");
			System.out.println(list);
		}
		else {
			System.out.println("Invalid index");
			
		}
		sc.close();
		*/
	}

}
