package streamAPI.stream;

import java.util.Arrays;
import java.util.List;

public class Process {
	
	public void doSomething01() {
		
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		list.stream().forEach(args -> System.out.print(args + " "));
		
	}

}
