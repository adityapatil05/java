package collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
public class Empp {

	int id;
	String name;
	double salary;
	
	
	

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}



	public Empp(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}


}
