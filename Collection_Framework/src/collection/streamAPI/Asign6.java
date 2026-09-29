package collection.streamAPI;

import java.util.Arrays;
import java.util.List;

public class Asign6 {

	public static void main(String[] args) {

		List<String>list=List.of("Adi","Abhi","Sahil","Ram");
		System.out.println("Name Strat with A: "+
list.stream().filter(n->n.startsWith("A")).count());
	}

}
