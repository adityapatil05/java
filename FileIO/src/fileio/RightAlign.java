package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RightAlign {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter File name");
		String fname = br.readLine();
		
		FileReader fr =new FileReader(fname);
		BufferedReader file =new BufferedReader(fr);
		
		String lines[]=new String[100];
		int count=0;
		int max=0;
		
		String str;
		
		while((str=file.readLine())!=null)
		{
			lines[count]=str;
			
			if(str.length()>max) {
				max=str.length();
			}
			count++;
		}
		file.close();
		
		for(int i=0;i<count;i++) {
			int spaces = max-lines[i].length();
			
			for(int j=0;j<spaces;j++) {
				System.out.print("-");
			}
			System.out.println(lines[i]);
			
		}

	}

}
