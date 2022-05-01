package lambda;

import lambda.invisible.ItemInterface;
import lambda.invisible.Process;

public class Main {
	
	public static void main(String[] args) {
		
		Process process = new Process();
		
		ItemInterface item01 = ItemInterface.createNewItem();
		process.printInfomation(item01);
		
		ItemInterface item02 = ItemInterface.createItem(process.doAltConstructor());
		process.printInfomation(item02);
		
	}

}
