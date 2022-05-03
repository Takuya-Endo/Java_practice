package annotation;

import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		
		Item item = new Item()
				.id("")
				.name(null)
				.price(0);
		
		List<String> errorMessages = Validator.validate(item);
		errorMessages.stream().forEach(System.out::println);
		
	}
	
}
