package stream.file;

public class Emp {
	int empId;
	String name;
	String dept;
	String city;
	float salary;
	
	public Emp() {
		super();
	}

	public Emp(int empId, String name, String dept, float salary, String city) {
		super();
		this.empId = empId;
		this.name = name;
		this.dept = dept;
		this.city = city;
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Emp [empId=" + empId + ", name=" + name + ", dept=" + dept + ", city=" + city + ", salary=" + salary
				+ "]";
	}
	

	
}
