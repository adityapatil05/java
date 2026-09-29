package multiThreading.customThread;

public class PrintingJob implements Runnable{

	
	private Thread t;
	private Printer p;
	private String header,body,footer;
	
	
	public PrintingJob(Printer p, String header, String body, String footer) {
		super();
		this.p = p;
		this.header = header;
		this.body = body;
		this.footer = footer;
		this.t = new Thread(this);
	}


	public void run() {

		p.syncMethodprint(header,body,footer);
	}

	public Thread getT() {
		return t;
	}
}
