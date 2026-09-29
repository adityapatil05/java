package multiThreading.customThread;

public class ConsumerProducerApp {

	public static void main(String[] args) {

		SharedData data = new SharedData();

		Producer p = new Producer(data);
		Consumer c = new Consumer(data);

		p.start();
		c.start();

	}

}
