package lambda.invisible;

import lambda.invisible.Item.ItemBuilder;

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
	
	public Item createItemUsingBuilder() {
		
		Item item = new ItemBuilder()
				.id(1)
				.name("sample")
				.price(1000)
				.category("sample")
				.build();
		
		return item;
	}

}
