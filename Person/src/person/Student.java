package person;

import person.student.Course;
import utility.date.Date;

public class Student extends Person{
Course course;
String PRN;
transient int age;
public Student(String name,Date dob,Course course, String pRN, int age) {
	super(name,dob);
	this.course = course;
	PRN = pRN;
	this.age = age;
}
@Override
public String toString() {
	return super.toString()+",PRN: "+PRN+",Age: "+age+","+course;
}


}
