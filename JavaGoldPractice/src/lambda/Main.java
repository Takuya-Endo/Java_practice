package lambda;

import java.util.Iterator;
import java.util.ServiceLoader;

import lambda.invisible.ItemInterface;
import lambda.invisible.Process;

public class Main {
	
	public static void main(String[] args) {
		
		Process process = new Process();
		
		ItemInterface item01 = ItemInterface.createNewItem();
		process.printInfomation(item01);
		
		ItemInterface item02 = ItemInterface.createItem(process.doAltConstructor());
		process.printInfomation(item02);
		
		ItemInterface item03 = process.createItemUsingBuilder();
		process.printInfomation(item03);
		
		
		
		ServiceLoader<ItemInterface> serviceLoader = ServiceLoader.load(ItemInterface.class);
		Iterator<ItemInterface> iterator = serviceLoader.iterator();
		
		while (iterator.hasNext()) {
			ItemInterface item04 = iterator.next();
//			ItemInterface item04 = itemInterface.createItem(process.doAltConstructor());
			process.printInfomation(item04);
		}
		
		
	}

}
