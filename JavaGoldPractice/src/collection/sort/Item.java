package collection.sort;

public class Item implements Comparable<Item> {
	
	private String name;
	private int price;
	
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public Item name(String name) {
		this.name = name;
		return this;
	}
	public Item price(int price) {
		this.price = price;
		return this;
	}
	
	@Override
	public int compareTo(Item otherItem) {
		
		return this.getName().length() - otherItem.getName().length();
		
	}

}
