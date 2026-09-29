package collection;

public class Customer {
	String name,emailId;
	String contactno;
	public Customer() {
		super();
	}
	public Customer(String name, String emailId, String contactno) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.contactno = contactno;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", emailId=" + emailId + ", contactno=" + contactno + "]";
	}
	
	
	

}
