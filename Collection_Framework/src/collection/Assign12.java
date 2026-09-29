package collection;

import java.util.TreeSet;

public class Assign12 {

	public static void main(String[] args) {
		TreeSet<String> ts= new TreeSet<String>((s1,s2)->{
			int v1=countVowels(s1);
			int v2=countVowels(s2);
			if(v1!=v2)
				return v2-v1;
			else
				return s1.compareTo(s2);
			
		});
		
		ts.add("Sahil");
		ts.add("Abhiya");
		ts.add("Aditya");
		ts.add("Ayush");
		ts.add("Parth");
		
		System.out.println("String in orederd form:");
		
		for(String s:ts)
			System.out.println(s);
	}

	static int countVowels(String s) {
		int count =0;
		
		for(int i=0;i<s.length();i++) {
			char ch=Character.toLowerCase(s.charAt(i));
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				count++;
		}
		return count;
	}

}
