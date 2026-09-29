package multiThreading;

public class PrimeNo {

	public static void main(String[] args) {

		Thread t =new Thread(()->{
			for(int i=2;i<=100;i++) {
				boolean isprime= true;
				for(int j=2;j<=i/j;j++) {
					if(i % j==0) {
						isprime=false;
						break;
					}
				}
				if(isprime) {
					System.out.println(i);
				}
			}
		});
	
	
		
		t.start();
	}

}
