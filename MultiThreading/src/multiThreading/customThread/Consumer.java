package multiThreading.customThread;

public class Consumer extends Thread {
	SharedData data;

	public Consumer(SharedData data) {
		super();
		this.data = data;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 10; i++) {
			data.consume();
		}

	}

}
