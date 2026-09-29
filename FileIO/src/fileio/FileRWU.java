package fileio;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileRWU {

	public static void main(String[] args) throws IOException{
		
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter the file path");
	String path = br.readLine();
	FileWriter fw =new FileWriter(path,true);
	System.out.println("Enter data ,'quit'to stop");
	String line;
	while(!((line = br.readLine()).equals("quit")))
		fw.write(line+"\n");
	System.out.println("File writing completed");
	if(br!=null)
		br.close();
	if(fw!=null)
		fw.close();
	FileReader fr =new FileReader(path);
	int i;
	

	char [] arr=new char[10];
	while ((i = fr.read(arr))!=-1) {
		System.out.println(new String (arr,0,i));
		

		
		
	}
	System.out.println("File reading completed");
fr.close();
	}

}
