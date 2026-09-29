package multiThreading.customThread;

public class Printer {
	
	public void print(String header,String body,String footer) {
		try {
			System.out.println(header);
			Thread.sleep(500);
			System.out.println(body);
			Thread.sleep(500);
			System.out.println(footer);
			System.out.println();
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void syncPrint(String header,String body,String footer) {
		synchronized (this) {
			try {
			System.out.print(header);
			Thread.sleep(500);
			System.out.print(body);
			Thread.sleep(500);
			System.out.print(footer);
			System.out.println();
			}
			catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
		
		public synchronized void syncMethodprint(String header,String body,String footer) {
			try {
				System.out.print(header);
				Thread.sleep(500);
				System.out.print(body);
				Thread.sleep(500);
				System.out.print(footer);
				System.out.println();
				}
				catch(InterruptedException e) {
					e.printStackTrace();
				}
			
		
	}
}
