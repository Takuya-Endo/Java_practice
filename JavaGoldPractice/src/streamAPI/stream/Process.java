package streamAPI.stream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

public class Process {
	
	public void doSomething01() {
		
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");
		list.stream().forEach(args -> System.out.print(args + " "));
		System.out.print("\n");
		
		BinaryOperator<String> accumulator = (str1, str2) -> str1 + ", " + str2;
		Optional<String> result = list.stream().reduce(accumulator);
		System.out.println(result.get());
		
		Collector<String, StringBuilder, String> collector = new /* CollectorImpl implements */ Collector<String, StringBuilder, String>() {
			@Override
			public Supplier<StringBuilder> supplier() {
				return () -> new StringBuilder();
			}
			@Override
			public BiConsumer<StringBuilder, String> accumulator() {
				return (stringBuilder, str) -> stringBuilder.append(str).append(", ");
			}
			@Override
			public BinaryOperator<StringBuilder> combiner() {
				return null;
			}
			@Override
			public Function<StringBuilder, String> finisher() {
				return stringBuilder -> stringBuilder.substring(0, stringBuilder.length() - 2);
			}
			@Override
			public Set<Characteristics> characteristics() {
				return new HashSet<Collector.Characteristics>();
			}
		};
		String collectorResult = list.stream().collect(collector);
		System.out.println(collectorResult);
		
	}

}
