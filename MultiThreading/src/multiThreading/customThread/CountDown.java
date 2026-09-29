package multiThreading.customThread;

public class CountDown implements Runnable {

	private Thread t;
	private String name;
	private int num;
	public CountDown(String name, int num) {
		super();
		this.name = name;
		this.num = num;
		this.t=new Thread(this);
	}
	/**
	 * @return the t
	 */
	
	public void run() {
		while(num>0) {
			System.out.println(name+"Thread prints : "+num);
			num--;
			
		}
		
	}
	public Thread getT() {
		return t;
	}
}
