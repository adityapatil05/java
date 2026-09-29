package multiThreading;

public class MyTask extends Thread {

	public void run() {
		try {
		for(int i=1;i<=5;i++) {
			System.out.println(i);
			Thread.sleep(500);
		}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
