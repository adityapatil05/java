package fileio;

import java.io.*;

public class FileIO {
	public static void main(String args[]) {
		
		BufferedReader br =null;
		try {
			br= new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter 'q' to Quit");
			int i;
			while((i=br.read())!= 'q')
				System.out.println((char)i);
			
				
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				br.close();
			}
			catch(IOException e) {
				e.printStackTrace();
			}
		}
	}
}
