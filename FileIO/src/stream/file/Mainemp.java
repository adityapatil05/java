package stream.file;

import java.nio.file.Files;
import java.nio.file.Paths;
  
public class Mainemp {

	public static void main(String[] args) throws Exception {
		
		/*Files.lines(Paths.get("C:\\Users\\prati\\OneDrive\\Desktop"))
		.map(line->{
			String [] substrs =line.split(",");
			return new Emp(Integer.parseInt(substrs[0],substrs[1],substrs[2],Float.parseFloat(substrs[3])))
				.forEach(System.out::println);
		});*/
	
		Files.lines(Paths.get("C:\\Users\\prati\\OneDrive\\Desktop\\empcsvdata.txt"))
		.map(line->{
			String [] substrs =line.split(",");
			return new Emp(Integer.parseInt(substrs[0]),substrs[1],substrs[2],Float.parseFloat(substrs[3]),substrs[4]);
			
			
			
		}).forEach(System.out::println);
		
	}

}
