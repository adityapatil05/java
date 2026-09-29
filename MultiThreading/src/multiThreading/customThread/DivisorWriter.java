package multiThreading.customThread;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class DivisorWriter implements Runnable{

	private Thread t;
	private String path;
	private int num;
	
	public DivisorWriter(String path,int num) {
		super();
		this.path = path;
		this.num=num;
		this.t=new Thread(this);
	}
	public synchronized void write(){
	
		try {
			FileWriter fw =new FileWriter(path,true);
			BufferedWriter bw =new BufferedWriter(fw);
			bw.write("Divisor of "+num+" are: ");
			
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					bw.write(i+" ");
				}
			}
			bw.newLine();
			bw.close();
			System.out.println("Thread "+Thread.currentThread().getName()+"Completed.");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	/**
	 * @return the t
	 */
	public Thread getT() {
		return t;
	}
	@Override
	public void run() {
	write();
	}

}
