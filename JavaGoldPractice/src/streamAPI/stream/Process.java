package streamAPI.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;

public class Process {
	
	public void doSomething01() {
		
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		list.stream().forEach(args -> System.out.print(args + " "));
		System.out.print("\n");
		
		BinaryOperator<String> accumulator = (str1, str2) -> str1 + ", " + str2;
		Optional<String> result = list.stream().reduce(accumulator);
		System.out.println(result.get());
		
	}

}
