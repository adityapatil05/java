package fileio;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringIO {

	public static void main(String[] args) throws IOException{
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter lines of data, Enter 'quit' to stop");
	String line;
	String maxline="";
	int max =0;
	while (!((line=br.readLine()).equals("quit"))){
		
		if(max<line.length()) {
			max=line.length();
			maxline =line;
		}
	}
	
	System.out.println(maxline);
	br.close();
	}
	}

