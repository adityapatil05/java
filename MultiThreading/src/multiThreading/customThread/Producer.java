package multiThreading.customThread;

public class Producer extends Thread{
	SharedData data;
	
	public Producer(SharedData data) {
		super();
		this.data = data;
	}
	
	@Override
	public void run() {
		for(int i=1;i<=10;i++) {
			data.produce(i);
		}
		
	}
	

}
