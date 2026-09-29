package multiThreading.customThread;

public class SharedData {
	private int val;
	private boolean available =false;


	synchronized void produce(int val) {
		
		try {
			while(available) 
				wait();
			
			val++;
			available=true;
			System.out.println("Produced"+val);
			notify();
			
				
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	synchronized int consume() {
		int x=0;
		try {
			while(!available)
				wait();
			val++;
			available=false;
			System.out.println("Consumed:"+val);
			notify();
			
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		return val;
		
	}
}
