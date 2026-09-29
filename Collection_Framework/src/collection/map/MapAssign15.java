package collection.map;

import java.util.*;
import java.util.Map.Entry;

public class MapAssign15 {

	public static void main(String[] args) {
	Map<Integer,String> map=new HashMap<>();
	map.put(1, "Aditya");
	map.put(2, "Adi");
	map.put(3, "Sahil");
	map.put(4, "Parth");
	map.put(5, "Ayush");
	map.put(6, "Abhi");
	
	Set<Entry<Integer,String>> set=map.entrySet();
	for(Entry<Integer,String>entry:set)
		System.out.println(entry.getKey()+" "+entry.getValue());
	
	
	}

}
