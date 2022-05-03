package annotation;

import annotation.annotationInterface.NotNull;
import annotation.annotationInterface.WordCount;

public class Item {

	private String id;
	@NotNull private String name;
	@WordCount(3) private String nameKana;
	private int price;
	
	public Item id(String id) {
		this.id = id;
		return this;
	}
	public Item name(String name) {
		this.name = name;
		return this;
	}
	public Item nameKana(String nameKana) {
		this.nameKana = nameKana;
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
	public String getNameKana() {
		return nameKana;
	}
	public int getPrice() {
		return price;
	}
	
	
	
}
