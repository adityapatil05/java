package collection.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Sorted4 {

	public static void main(String[] args) {

		List <Integer> list=Arrays.asList(11,6,21,22,33,44,37,89,76,54,30,19);
		list.stream().sorted().distinct().forEach(System.out::println);
	}

}
