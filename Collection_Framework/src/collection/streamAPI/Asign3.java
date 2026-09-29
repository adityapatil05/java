package collection.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Asign3 {

	public static void main(String[] args) {
		 List <Integer> list=Arrays.asList(3,7,11,4,21,22,33,44,37,89,76,54,30,19);
		Optional <Integer>Int=list.stream().filter(s->s>5).findFirst();
		System.out.println("First Number Greater than 5 is: "+Int.get());
	}

}
