package collection.streamAPI;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Asign11 {

	public static void main(String[] args) {
		List<String>list=List.of("adi","abhi","adiii","sahil","Ram");

		list.stream().map(
				s->{
					StringBuilder sb=new StringBuilder(s);
					sb.replace(0, 1,Character.toString(s.charAt(0)).toUpperCase() );
					return new String(sb);
		}).forEach(System.out::println);
	}

}
