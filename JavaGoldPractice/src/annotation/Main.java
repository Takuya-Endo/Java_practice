package annotation;

import java.util.List;

import annotation.validator.Validator;

public class Main {
	
	public static void main(String[] args) {
		
		Item item = new Item()
				.id("")
				.name(null)
				.nameKana("名前半角カナ")
				.price(0);
		
		List<String> errorMessages = Validator.validate(item);
		if (errorMessages.size() != 0) {
			errorMessages.stream().forEach(System.out::println);
			return;
		}
		
		System.out.println("finish");
		
	}
	
}
