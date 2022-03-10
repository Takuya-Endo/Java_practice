package sample.confirmMethodArgument;

public class MethodClass {
	
	public void changeObject(ArgumentObject object) {
		
		System.out.println("---↓メソッド内↓---");
		System.out.println(object);
		System.out.println(object.stringField + ", " + object.intField);
		object.stringField = "TEST";
		object.intField = 5;
		System.out.println(object);
		System.out.println(object.stringField + ", " + object.intField);
		object = new ArgumentObject(); // or object = null;
		System.out.println(object);
		System.out.println("---↑メソッド内↑---");
	}
	
}
