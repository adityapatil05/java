package multiThreading.customThread;

public class CountDownMain {

	public static void main(String[] args) {

		CountDown j1=new CountDown("first",78);
		CountDown j2=new CountDown("second",87);
		CountDown j3=new CountDown("third",98);
		
		System.out.println("Counting down task begins....");
		
		j1.getT().start();
		j2.getT().start();
		j3.getT().start();
		
	
			
		
		try {
			j1.getT().join();
			j2.getT().join();
			j3.getT().join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Counting down task ends.....");
	}

}
