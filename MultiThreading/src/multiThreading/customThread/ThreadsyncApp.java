package multiThreading.customThread;

public class ThreadsyncApp {

	public static void main(String[] args) {

		Printer p =new Printer();
		
		
		PrintingJob j1=new PrintingJob(p, "(", "Welcome to java", ")");
		PrintingJob j2=new PrintingJob(p, "{", "Learing multithreading", "}");
		PrintingJob j3=new PrintingJob(p, "[", "Thread synchronization", "]");
		
		System.out.println("Printing job begins....");
		
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
			System.out.println("Printing job ends......");	
	}

}
