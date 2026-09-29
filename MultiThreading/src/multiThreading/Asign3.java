package multiThreading;

public class Asign3 implements Runnable{
	private Thread t;
	
	public Asign3() {
		t=new  Thread(this);
	}
	
	
	public Thread getT() {
		return t;
	}


	public void setT(Thread t) {
		this.t = t;
	}


	@Override
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println("Child Thread: "+i);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
