package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Assign16 {

	public static void main(String[] args) {

		String s="coccacola";
		
		Map<Character,Integer>map=new HashMap<>();
		for(char ch:s.toCharArray()) {
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
		}
		
		
		for(Map.Entry<Character, Integer>entry:map.entrySet())
		System.out.println(entry.getKey()+"="+entry.getValue());
		
	}

}
