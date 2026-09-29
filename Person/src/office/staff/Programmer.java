package office.staff;

import utility.date.Date;

public class Programmer extends Emp implements ITraveller{
 private double extraHours;
 private double chargesPerHour;
 public Programmer() {
	super();
 }
 public Programmer(String name, Date bdate, int empid, double salary, double extraHours, double chargesPerHour) {
	super(name, bdate, empid, salary);
	this.extraHours = extraHours;
	this.chargesPerHour = chargesPerHour;
 }
 @Override
 public void display() {
	// TODO Auto-generated method stub
	super.display();
	System.out.println("Extra Hours : "+extraHours+"\nCharges Per Hour : "+chargesPerHour);
	
	
 }
 @Override
 public String toString() {
	return super.toString()+"\nExtraHours= " + extraHours + ", Charges Per Hour= " + chargesPerHour ;
 }
 @Override
 public double calSalary() {
	// TODO Auto-generated method stub
double extraPay= extraHours*chargesPerHour;
	return salary+extraPay;
 }
 @Override
 public String getPassportDetail() {
	// TODO Auto-generated method stub
	return null;
 }
 @Override
 public int getTravelHours() {
	// TODO Auto-generated method stub
	return 0;
 }

 
}
