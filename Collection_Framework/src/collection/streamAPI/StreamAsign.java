package collection.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class StreamAsign {

	public static void main(String[] args) {

		List <Integer> list=Arrays.asList(11,21,22,33,44,37,89,76,54,30,19);
		//Predicate<Integer>isEven=n->n% 2 ==0;
		//Consumer<Integer>printer=n->System.out.println(n);
		list.stream().filter(n-> n%2==0).forEach(n-> System.out.println(n));
		
	}

}
