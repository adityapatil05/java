package collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Emp {
	int id;
	String name;
	private double salary;
	
	
	

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + getSalary() + "]";
	}



	public Emp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.setSalary(salary);
	}


public double getSalary() {
		return salary;
	}



	public void setSalary(double salary) {
		this.salary = salary;
	}


public class empTreeSet{
	

	public static void main(String[] args) {
		Set<Emp>ts =new TreeSet<>((e1,e2)->Double.compare(e1.getSalary(), e2.getSalary()));
		
		ts.add(new Emp(101,"Adi",45000));
		ts.add(new Emp(102,"Abhi",50000));
		ts.add(new Emp(103,"Sahil",61000));
		ts.add(new Emp(104,"Ayush",76000));
		ts.add(new Emp(105,"Parth",65000));

		System.out.println("Employee in increasing order:");
		for(Emp e:ts) {
			System.out.println(e);
		}

		
	}

}



}
