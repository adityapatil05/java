package collection.streamAPI;

import java.util.Comparator;
import java.util.List;

public class Asign7 {

	public static void main(String[] args) {

		List<String>list=List.of("Adi","Abhi","Sahil","Ram");
		list.stream().sorted(Comparator.reverseOrder())
		.forEach(System.out::println);
	}

}
