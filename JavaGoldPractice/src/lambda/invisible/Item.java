package lambda.invisible;

class Item implements ItemInterface {
	
	private int id;
	private String name;
	private int price;
	private String category;
	
	public Item id(int id) {
		this.id = id;
		return this;
	}
	public Item name(String name) {
		this.name = name;
		return this;
	}
	public Item price(int price) {
		this.id = price;
		return this;
	}
	public Item category(String category) {
		this.category = category;
		return this;
	}
	
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}
	
}
