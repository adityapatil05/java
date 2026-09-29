package collection;

public class RegisteredCustomer extends Customer{
	int regno;
	
	

	public RegisteredCustomer(String name, String emailId, String contactno, int regno) {
		super();
	}



	public RegisteredCustomer(int regno) {
		super();
		this.regno = regno;
	}



	@Override
	public String toString() {
		return "RegisteredCustomer [regno=" + regno + "]";
	}
	

}
