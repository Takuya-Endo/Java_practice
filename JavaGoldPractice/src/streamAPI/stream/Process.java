package streamAPI.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.IntSupplier;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
	
	public void doSomething04() {
		
		Random random = new Random();
		int randomNumber = 0;
		List<Integer> list = null;
		
		list = new ArrayList<Integer>();
		while (true) {
			
			randomNumber = random.nextInt(10);
			if (list.contains(randomNumber)) {
				continue;
			}
			list.add(randomNumber);
			if (list.size() >= 10) {
				break;
			}
		}
		list.stream().forEach(element -> System.out.print(element + " "));
		
		System.out.print("\n");
		
		IntSupplier intSupplier = () -> new Random().nextInt(10);
		IntStream intStream = IntStream.generate(intSupplier).distinct().limit(10);
		intStream.forEach(element -> System.out.print(element + " "));
		
		System.out.print("\n");
		
		IntStream.generate(() -> new Random().nextInt(10)).distinct().limit(10).forEach(element -> System.out.print(element + " "));
		
		System.out.print("\n");
		
		IntStream.generate(() -> new Random().nextInt(10))
				.distinct().limit(10)
				.forEach(element -> System.out.print(element + " "));
		
	}
	
	public void doSomething05() {
		
		double result = 0;
		
		IntStream intStream = IntStream.generate(() -> new Random().nextInt(10)).distinct().limit(10);
		result = intStream.average().getAsDouble();
		System.out.println(result);
		
		List<Integer> list = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
//		list.stream().average(); //通常のストリームにaverageメソッドは用意されていない
		ToDoubleFunction<Integer> toDoubleFunction = number -> number;
		Collector<Integer, ?, Double> collector = Collectors.averagingDouble(toDoubleFunction);
		result = list.stream().collect(collector);
		System.out.println(result);
		
	}
	
	public void doSomething06() {
		
		IntStream intStream = IntStream.iterate(3, num -> num + 2).limit(5);
		intStream.forEach(element -> System.out.print(element + " "));
		
	}
	
	public void doSomething07() {
		
		IntStream intStream = IntStream.iterate(9, num -> --num).limit(10);
//		intStream.reduce((int num1, int num2) -> num1 + ", " + num2); //ちなみに引数にint型を明示できる（出来ないのは関数型インターフェースのジェネリクス省略したと時）
		//↓reduceの引数はBinaryOperatorのため、連結して文字列として返せない→根本の原因はIntStream型で処理しているから→そこで変換
		IntFunction<String> intFunction = (int num) -> String.valueOf(num);
		Stream<String> stream = intStream.mapToObj(intFunction);
		String result = stream.reduce((str1, str2) -> str1 + ", " + str2).get();
		System.out.println(result);
		
	}
	
	public void doSomething08() {
		
		//Stream<Integer>とIntStreamの違い
		
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
		int[] nums = {1, 2, 3, 4, 5};
		
		Stream<Integer> listStream = list.stream();
		IntStream numsStream = Arrays.stream(nums);
		
		listStream.forEach((Integer arg) -> { System.out.print(arg + " "); });
		numsStream.forEach((int arg) -> { System.out.print(arg + " "); });
		
	}
	
	public void doSomething09() {
		
		List<String> list = List.of("B", "A", "D", "E", "C");
		
		list.stream().forEach(str -> System.out.print(str + " "));
		System.out.print("\n");
		list.parallelStream().forEach(str -> System.out.print(str + " "));
		System.out.print("\n");
		list.parallelStream().forEachOrdered(str -> System.out.print(str + " "));
		
	}

}
