package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Assign11 {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> list =new ArrayList<String>();
	System.out.println("Enter 5 String: ");
	
	for(int i=0;i<5;i++)
		list.add(sc.nextLine());
	
	
	Collections.sort(list,(s1,s2)-> {
		if(s1.length()!=s2.length())
			return s1.length()-s2.length();
		else
			return s1.compareTo(s2);
	});
	
	System.out.println("Strings in increasing order of length: ");
	
	
	for(String s:list)
		System.out.println(s);

		
}
	
}
