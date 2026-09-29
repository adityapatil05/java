package collection.streamAPI;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Asign9 {

	public static void main(String[] args) {

		List<String>list=List.of("Adi","Abhi","","Adiii","Sahil","Ram");
		Optional <String>longest=list.stream().max(Comparator.comparing(String::length));
		longest.ifPresent(l->System.out.println("Longest String :"+l));
	}

}
