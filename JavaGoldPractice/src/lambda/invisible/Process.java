package lambda.invisible;

public class Process {
	
	public void printInfomation(ItemInterface item) {
		System.out.println(item.toString());
	}
	
	public Factory doAltConstructor() {
		
		Factory factory = item -> item
				.id(1)
				.name("sample")
				.price(1000)
				.category("sample"); 
		
		return factory;
		
	}

}
