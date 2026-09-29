package collection.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Asign12 {

	public static void main(String[] args) {
		List <Integer> list=Arrays.asList(11,21,22,33,44,37,89,76,54,30,19);
		Map<Boolean, List<Integer>>map=
		list.stream().collect(Collectors.partitioningBy(n->n%2==0));
		System.out.println(map);
		
	}

}
