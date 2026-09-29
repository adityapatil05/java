package fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberIO {

	public static void main(String[] args) {

BufferedReader br=null;
try {
	br =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 'quit'to quit");
	String s;
	while(!(s=br.readLine()).equals("quit")) {
		try {
		int n=Integer.parseInt(s);
		
		System.out.println(s);
			
			System.out.println();
	}catch(NumberFormatException e) {
		System.out.println("Not a Number");
	}
		}
	}

catch(IOException e) {
	e.printStackTrace();
}
finally {
	try {
		br.close();
	}catch (IOException e) {
		e.printStackTrace();
	}
}
	}

}
