package office.staff;

import person.Person;
import utility.date.Date;

public class Emp extends Person{
	int empid;
	protected double salary;
	public Emp() {
		super();
	}


	public Emp(String name, Date bdate, int empid, double salary) {
		super(name, bdate);
		this.empid = empid;
		this.salary = salary;
	}
public void display() {
		super.display();
		System.out.println("Employee Id is "+empid +"\nSalary of Employee is "+salary);
		
	}


@Override
public String toString() {
	return super.toString()+ "\nEmpid = " + empid + " \nsalary= " + salary;
}
		
	public double calSalary() {
		return salary;
	}

	}

