package person;


import java.io.Serializable;

import utility.date.Date;

public class Person implements Serializable{
	private String name;
	private Date bdate;
	public Person() {
		
	}

	public Person(String name, Date bdate) {
		super();
		this.name = name;
		this.bdate = bdate;
	}
	public Person(String name,int dd,int mm,int yy) {
		super();
		this.name = name;
		this.bdate= new Date(dd,mm,yy);
	}
	public void display() {
		System.out.println("Name of Person is "+name+"\nBirthdate : ");
		bdate.display();
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Name of Person is "+name+"\nDate of Birth is "+bdate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBdate() {
		return bdate;
	}
	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}
	

}
