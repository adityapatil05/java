package collection.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Asign5 {

	public static void main(String[] args) {
		List <Integer> list=Arrays.asList(11,21,22,33,44,37,89,76,54,30,19);
		System.out.println(list.stream().reduce(0,(a,b)->a+b));
		
	}

}
