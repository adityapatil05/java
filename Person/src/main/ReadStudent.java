package main;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import person.Student;

public class ReadStudent {

	public static void main(String[] args) throws Exception{
		FileInputStream fis =new FileInputStream("Student.txt");
		
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		Student s[]=(Student[] )ois.readObject();
		
		for (int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}
ois.close();
fis.close();
	}

}
