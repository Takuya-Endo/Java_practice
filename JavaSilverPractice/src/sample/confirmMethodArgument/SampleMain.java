package sample.confirmMethodArgument;

public class SampleMain {
	
	public static void main(String[] args) {
		
		MethodClass method = new MethodClass();
		ArgumentObject object = new ArgumentObject();
		
		System.out.println(object);
		method.changeObject(object);
		System.out.println(object);
		
	}
}
