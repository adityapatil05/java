package multiThreading.customThread;

public class DisplayFileApp {

	public static void main(String[] args) {

		DisplayFileData j1 = new DisplayFileData("C:\\Users\\prati\\OneDrive\\Desktop\\DisplayFileData.java");
		DisplayFileData j2 = new DisplayFileData("A:\\Java Cdac\\Eclips\\bin\\MultiThreading\\src\\multiThreading\\customThread\\CountDown.java");
		DisplayFileData j3 = new DisplayFileData("A:\\Java Cdac\\Eclips\\bin\\MultiThreading\\src\\multiThreading\\customThread\\PrintingJob.java");
		
		System.out.println("File display begin.......");
		
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
		System.out.println("File display will end......");
		
	}

}
