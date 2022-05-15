package streamAPI.optional;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

public class Process {

	//Optionalインスタンス生成
	public void doSomething01() {
		
		//①nullを許容しない
		Optional<String> optionalString01 = Optional.of("optionalString01");
		System.out.println(optionalString01);
		System.out.println(optionalString01.get());
		
		//NullPointerException
//		Optional<String> optionalStringNull = Optional.of(null);
		
		
		//②nullを許容する
		Optional<String> optionalString02 = Optional.ofNullable("optionalString02");
		System.out.println(optionalString02.get());
		Optional<String> optionalStringNull = Optional.ofNullable(null); // = Optional<String> optionalStringNull = Optional.empty();
		System.out.println(optionalStringNull); //Optional.empty
//		System.out.println(optionalStringNull.get()); //java.util.NoSuchElementException
		
	}
	
	//Optionalインスタンスがnullか否か判定してから処理
	public void doSomething02() {
		
//		Optional<String> optionalStringNull = Optional.ofNullable(null);
		Optional<String> empty = Optional.empty();
		
		if (!empty.isPresent()) {
			System.out.println(empty);
//			System.out.println(empty.get()); //NoSuchElementException
			System.out.println(empty.orElseGet(() -> "empty"));
		}
		
		Consumer<String> consumer = str -> System.out.println(str);
		Runnable runnable = () -> System.out.println("isEmpty");
		empty.ifPresentOrElse(consumer, runnable);
		
		Optional<String> test = Optional.of("test");
		test.ifPresent(consumer);
		
	}
	
	public void doSomething03() {
		
		var list = List.of("A", "B", "C", "D", "E");
		
		Optional<String> result = list.stream()
				.filter(str -> str.contains("Z"))
				.reduce((arg1, arg2) -> arg1 + ", " + arg2);
		
		System.out.println(result);
		result.ifPresent(System.out::println); //出力なし
		System.out.println(result.isPresent());
		
	}

}
