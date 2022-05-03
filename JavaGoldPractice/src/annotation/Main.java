package annotation;

import java.util.List;

import annotation.validator.Validator;

public class Main {
	
	public static void main(String[] args) {
		
		Item item = new Item()
				.id("ABCDE")
				.name(null)
				.nameKana("商品名半角カナ")
				.price(0);
		
		List<String> errorMessages = Validator.validate(item);
		if (errorMessages.size() != 0) {
			errorMessages.stream().forEach(System.out::println);
			return;
		}
		
		System.out.println("finish");
		
	}
	
}
