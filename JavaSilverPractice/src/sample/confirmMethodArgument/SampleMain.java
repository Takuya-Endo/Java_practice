package sample.confirmMethodArgument;

public class SampleMain {
	
	public static void main(String[] args) {
		
		MethodClass method = new MethodClass();
		ArgumentObject object = new ArgumentObject();
		
		System.out.println(object);
		System.out.println(object.stringField + ", " + object.intField);
		method.changeObject(object); //メソッドに渡しているのは、箱(変数)ではなく「参照」
		System.out.println(object);
		System.out.println(object.stringField + ", " + object.intField);
		
	}
}
