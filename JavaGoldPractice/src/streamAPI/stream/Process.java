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
	
	public void doSomething02() {
		
		Function<String, String> strFunction = (String str) -> str + str;
		System.out.println(strFunction.apply("Test"));
		
		//ジェネリクスを利用するときにボクシングは使えない。
//		Function<Integer, Integer> intFunction = (int num) -> num + num;
		Function<Integer, Integer> intFunction = (Integer num) -> num + num;
		System.out.println(intFunction.apply(5));
		
	}
	
	public void doSomething03() {
		
		//引数有の関数型インターフェースのジェネリクス無しは不可
//		Function strFunction = (String str) -> str + str;
//		Function strFunction = (str) -> str + str;
		Function<String, String> strFunction = (String str) -> str + str;
		System.out.println(strFunction.apply("Test"));
		
		//引数無しの関数型インターフェースはジェネリクス無しでもコンパイルエラーにならない
		Supplier strSupplier = () -> "Test";
		System.out.println(strSupplier.get());
		
	}

}
