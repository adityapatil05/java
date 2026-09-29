package office.staff;

import utility.date.Date;

public class Admin extends Emp {
	private double bonus;
	double allowance;

	public Admin() {
		super();
	}

	public Admin(String name, Date bdate, int empid, double salary, double bonus) {
		super(name, bdate, empid, salary);
		this.bonus = bonus;
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		super.display();
	}

	@Override
	public String toString() {
		return super.toString()+"Bonus= " + bonus ;
	}

	@Override
	public double calSalary() {
		// TODO Auto-generated method stub
		
		return salary + allowance;
	}
	
	

}
