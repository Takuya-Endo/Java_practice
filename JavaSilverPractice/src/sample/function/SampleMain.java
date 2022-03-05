package sample.function;

public class SampleMain {

	public static void main(String[] args) {
		
		String value = "";
		FunctionTypeInterface sampleClassPolymorphism;
		
		SampleClassImplementsA sampleClassA = new SampleClassImplementsA();
		value = sampleClassA.sampleFunction("TestString");
		System.out.println(value);
		
		sampleClassPolymorphism = new SampleClassImplementsA();
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
		SampleClassImplementsB sampleClassB = new SampleClassImplementsB();
		value = sampleClassB.sampleFunction("TestString");
		System.out.println(value);
		
		sampleClassPolymorphism = new SampleClassImplementsB();
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
		SampleMain sampleMain = new SampleMain();
		value = sampleMain.mainPrivateFunction("TestString");
		System.out.println(value);
		
//		sampleClassPolymorphism = sampleMain.mainPrivateFunction("TestString");
		sampleClassPolymorphism = sampleMain::mainPrivateFunction;
		sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
		value = SampleMain.mainStaticFunction("TestString");
		System.out.println(value);
		
		sampleClassPolymorphism = SampleMain::mainStaticFunction;
		sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
	}
	
	private String mainPrivateFunction(String argument) {
		return argument + "（Mainクラスのprivateメソッドを利用）";
	}
	
	public static String mainStaticFunction(String argument) {
		return argument + "（Mainクラスのstaticメソッドを利用）";
	}

}
