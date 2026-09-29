package collection.streamAPI;

import java.util.List;

public class Asign2 {

	public static void main(String[] args) {

		List<String>list=List.of("Adi","Abhi","Sahil","Ram");
		list.stream().map(s->s.toUpperCase()).forEach(System.out::println);
		
	}

}
