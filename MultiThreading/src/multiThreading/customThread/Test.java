package multiThreading.customThread;

public class Test {

	public static void main(String[] args) {
		
		String file ="divisor.txt";
		
		DivisorWriter t1=new DivisorWriter(file, 82);
		DivisorWriter t2=new DivisorWriter(file, 29);
		DivisorWriter t3=new DivisorWriter(file, 35);
		
		t1.getT().start();
		t2.getT().start();
		t3.getT().start();

	}

}
