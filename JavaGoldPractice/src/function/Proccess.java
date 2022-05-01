package function;

import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class Proccess {
	
	public void doSomething01() {
		
		int even = 4;
		int odd = 5;
		int ten = 10;
		
		BiPredicate<Integer, Integer> biPredicate = (evenNumber, oddNumber) -> {
			return (evenNumber % 2 == 0) && (oddNumber % 2 != 0);
		};
		Predicate<Integer> predicate = tenNumber -> ten == 10;
		if (biPredicate.test(even, odd) && predicate.test(ten)) {
			System.out.println("TRUE");
		}
		
		
		Predicate<Integer> predicate1 = evenNumber -> evenNumber % 2 == 0;
		Predicate<Integer> predicate2 = oddNumber -> oddNumber % 2 != 0;
		Predicate<Integer> predicate3 = tenNumber -> ten == 10;
		
		if (predicate1.test(even) && predicate2.test(odd) && predicate3.test(ten)) {
			System.out.println("TRUE");
		}
		
		Predicate<Integer> predicateAnd = predicate1.and(predicate2).and(predicate3);
		if (predicateAnd.test(even)) {
			System.out.println("TRUE");
		} else {
			System.out.println("FALSE");
		}
		
	}
	
	public void doSomething02() {
		
		int number = 2;
		
		//↓同義：UnaryOperator<Integer>
		Function<Integer, Integer> function01 = num -> num + 1;
		Function<Integer, Integer> function02 = num -> num * 2;
		
		Function<Integer, Integer> functionAndThen = num -> function01.andThen(function02).apply(num);
		Function<Integer, Integer> functionCompose = num -> function01.compose(function02).apply(num);
		
		System.out.println(functionAndThen.apply(number));
		System.out.println(functionCompose.apply(number));
		
	}

}
