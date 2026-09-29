package collection.map;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Email17 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BufferedReader file=new BufferedReader(new FileReader("src/collection/map/emails.txt"));
		
		Map<String, Integer>map = new HashMap<String, Integer>();
		String email;
		while((email =file.readLine())!=null)
		{
			email=email.trim();
			if(email.length()>0)
			{
				String domain=email.substring(email.indexOf('@')+1);
				
				if (map.containsKey(domain))
				map.put(domain,map.get(domain)+1 );
				else
					map.put(domain, 1);
			}
		}
		file.close();
		System.out.println("Domain Count: ");
		
		for(Map.Entry<String, Integer>entry:map.entrySet())
			System.out.println(entry.getKey()+" "+entry.getValue());
		
	}

}
