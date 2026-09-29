package main;

import office.staff.Admin;
import office.staff.Emp;
import office.staff.Programmer;
import office.staff.SalesManager;
import utility.date.Date;

public class Main {

	public static void main(String[] args) {
		
		/*Emp[]emp=new Emp[3];
		emp[0]=new SalesManager("Aditya",new Date(5,5,2000),1001,109000,120000,1009);
		emp[1]=new  Programmer("Abhi",new Date(13,4,2004),1002,1029900,23,879);
		emp[2]=new Admin("Ram",new Date(6,4,2004),1003,192000,28970);
		double totalSalary=0;
		
		for(int i=0;i<emp.length;i++) {
			double salary =emp[i].calSalary();
			System.out.println(emp[i].getName()+"\nSalary= "+salary);
			totalSalary=totalSalary+salary;
		}
		System.out.println("\nTotal Salary= "+totalSalary);*/
	
	Emp e=new Emp("Aditya",new Date(5,5,2004),1001,10000);
	Emp e2=new Emp("Ram",new Date(6,4,2004),1002,102900);
	Emp e3 =new Emp("Abhi",new Date(13,4,2004),1003,102000);
	Emp e4 = new Programmer("Sahil",new Date(11,1,2002),1005,10900,23,1000);
	e.display();
	e2.display();
	e3.display();
	e4.display();

}
}