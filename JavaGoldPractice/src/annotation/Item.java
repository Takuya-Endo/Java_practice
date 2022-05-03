package annotation;

public class Item {

	private String id;
	@NotNull private String name;
	private int price;
	
	public Item id(String id) {
		this.id = id;
		return this;
	}
	public Item name(String name) {
		this.name = name;
		return this;
	}
	public Item price(int price) {
		this.price = price;
		return this;
	}
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	
	
	
}
