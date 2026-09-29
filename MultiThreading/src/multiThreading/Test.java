package multiThreading;

public class Test {

	public static void main(String[] args) {

		//Runnable r=new Asign3();
		Asign3 a=new Asign3();
		a.getT().start();
		//r.run();
		
		for(int i=1;i<=5;i++) {
			
			
			System.out.println("My Thread: "+i);
			try {
				Thread.sleep(900);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
