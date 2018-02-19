package p;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8test {

	
	public static void main(String[] args) {
	
		
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(5);
		list.add(3);
		list.add(3);
		list.add(2);
		list.add(2);
		list.add(10);
		
		
		//list.stream().flatMapToInt(e -> IntStream.of(e)).forEach(System.out::print);
		
		Map<Integer,Long> map1 = list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map1);
		Map<IntStream, IntStream> map= list.stream().collect(Collectors.toMap(e -> IntStream.of(e),e -> IntStream.of(e)));
	
		map.entrySet().stream().forEach(e ->
		{
		int[] i= e.getValue().toArray();
		for(int k:i) {
			System.out.println(k);
		}
		});
		
		 String[][] data = new String[][]{{"a", "b"}, {"c", "d"}, {"e", "f"}};

		 Stream<String> stream = Arrays.stream(data).flatMap(e->Arrays.stream(e)).filter(e -> "a".equals(e));
		 stream.forEach(System.out::println);
		
	    
	}
}
