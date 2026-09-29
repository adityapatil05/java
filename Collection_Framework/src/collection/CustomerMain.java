package collection;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CustomerMain {

	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		
		FileWriter fw=new FileWriter("Customer.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		for (int i=0;i<5;i++){
			System.out.println("\nEnter Customer"+(i+1));
	
		
		System.out.println("Enter Name: ");
		String name =sc.nextLine();
		
		System.out.println("\nEnter Email ID: ");
		String emailId=sc.nextLine();
		
		System.out.println("\nEnter Mobile No: ");
		String contactno=sc.nextLine();
		System.out.println("\nEnter Registeration No: ");
		int regno =sc.nextInt();
		sc.nextLine();
		
		RegisteredCustomer obj=new RegisteredCustomer(name,emailId,contactno,regno);
		
		bw.write(obj.toString());
		bw.newLine();
		
		}
		bw.close();
System.out.println("\nCustomer Information saved to file");
	sc.close();
	}

}
