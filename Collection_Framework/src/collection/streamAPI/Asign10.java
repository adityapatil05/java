package collection.streamAPI;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Asign10 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2,4, 3, 2, 4, 5, 1, 6, 2);

        Set<Integer> seen = new HashSet<>();
        List<Integer> duplicates = numbers.stream()
                .filter(n -> !seen.add(n)) 
                .distinct()              
                .collect(Collectors.toList());

        System.out.println("Duplicate elements: " + duplicates);
	}

}
