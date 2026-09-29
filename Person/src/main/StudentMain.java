package main;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import person.Student;
import person.student.Course;
import utility.date.Date;

public class StudentMain {

	public static void main(String[] args) throws Exception{
Course c1=new Course(101, "java", 25000);
Course c2 = new Course(102, "CPP", 22999);
Course c3 = new Course(103, "C", 10000);

Student s[] = new Student[3];

s[0] =new Student("Aditya", new Date(10,10,2004), c1, "PRN101", 22);
s[1] = new Student("Sahil", new Date(2,2,2004), c2, "PRN102", 22);
s[2]= new Student("Abhi", new Date(13,4,2004), c3, "PRN103", 22);
	
FileOutputStream fos = new FileOutputStream("Student.txt");

ObjectOutputStream oos =new ObjectOutputStream(fos);

oos.writeObject(s);

oos.close();
fos.close();

System.out.println("Student serialized successfully");

}
}