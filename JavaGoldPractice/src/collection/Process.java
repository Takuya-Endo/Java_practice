package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import collection.sort.Item;

public class Process {
	
	public void doSomething01() {

		List<Item> items = new ArrayList<Item>();
		items.add(new Item()
				.name("ItemAA")
				.price(300));
		items.add(new Item()
				.name("ItemBBB")
				.price(200));
		items.add(new Item()
				.name("ItemC")
				.price(100));
		
		//Itemのような自作クラスは、ComparableのcompareToを実現しておかないと、sortの引数に入れた時コンパイルエラー
		//ちなみにComparableのジェネリクスで型を指定しておかないと、compareToの引数がObject型になる（指定する方は実装するクラスと同じ）
		Collections.sort(items);
		String result1 = items.stream().map(item -> item.getName()).reduce((name1, name2) -> name1 + ", " + name2).get();
		System.out.println(result1);
		
		//Comparatorは個別に用意して使う。Itemクラスに手を入れず、必要になったときにラムダ式で設定した順でsortできる
		//だから、引数が二つ（compareToは時クラスに書くからthisとotherで引数一つでよかったけど）。
		//実装するほうがableで、ator。Serializ"able"と同じ。
		Comparator<Item> comparator = new Comparator<Item>() {
			//関数型インターフェースだから、sortの第二引数にラムダ式直接渡すことも可能
			@Override
			public int compare(Item item1, Item item2) {
				return item1.getPrice() - item2.getPrice();
			}
		};
		Collections.sort(items, comparator);
		String result2 = items.stream().map(item -> item.getName()).reduce((name1, name2) -> name1 + ", " + name2).get();
		System.out.println(result2);
		
		
		Collections.sort(items, (item1, item2) -> item2.getPrice() - item1.getPrice());
		String result3 = items.stream().map(item -> item.getName()).reduce((name1, name2) -> name1 + ", " + name2).get();
		System.out.println(result3);
		
	}

}
