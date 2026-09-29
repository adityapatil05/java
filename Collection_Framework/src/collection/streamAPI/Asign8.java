package collection.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Asign8 {

	public static void main(String[] args) {
		List <Integer> list=Arrays.asList(11,21,22,33,44,37,89,76,54,30,19);
		list.stream().sorted(Comparator.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
	}
}
