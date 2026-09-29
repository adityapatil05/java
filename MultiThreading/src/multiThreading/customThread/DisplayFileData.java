package multiThreading.customThread;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class DisplayFileData implements Runnable{

	private Thread t;
	private String path;
	public DisplayFileData(String path) {
		super();
		this.path = path;
		this.t=new Thread(this);
	}
	@Override
	public void run() {
		File file =new File(path);
		synchronized (System.out) {
			System.out.println("File Path: "+file.getAbsolutePath());
			System.out.println("Size: "+file.length());
			System.out.println("Readable: "+file.canRead());
			FileReader fr =null;
			try {
				if(file.canRead()){
					fr =new FileReader(file);
					int i;
					while((i=fr.read())!=-1)
						System.out.print((char)i);
					System.out.println("***************************");
					
				}
		}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				try {
					fr.close();
				}
				catch(IOException e) {
					e.printStackTrace();
				}
			}
	}
	
	
		
	
	}
	/**
	 * @return the t
	 */
	public Thread getT() {
		return t;
	}
}
