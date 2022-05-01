package lambda.invisible;

public interface ItemInterface {

	//Factoryクラス不要
	//本来はFactoryクラスのstaticメソッドでFactory.create()とするのが分かりやすい。
	public static Item createNewItem() {
		return new Item();
	}
	
	//上記のようなFactoryでなく、別にFactoryクラスを用意して、下記のような生成も可能。
	
	public static Item createItem(Factory factory) {
		//Factoryを関数型インターフェースにしておく。	
		return factory.createItem(new Item());
		
	}
	
}
