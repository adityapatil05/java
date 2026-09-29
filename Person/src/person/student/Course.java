package person.student;

import java.io.Serializable;

public class Course implements Serializable{
	int courseId;
	String coursename;
	double fees;
	public Course(int courseId, String coursename, double fees) {
		super();
		this.courseId = courseId;
		this.coursename = coursename;
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "Course ID: "+courseId+",Course Name: "+coursename+",Fees: "+fees;
		
	}
	
	
	

}
