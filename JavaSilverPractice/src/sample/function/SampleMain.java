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
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
		value = SampleMain.mainStaticFunction("TestString");
		System.out.println(value);
		
		sampleClassPolymorphism = SampleMain::mainStaticFunction;
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
		sampleClassPolymorphism = /* sampleFunction */ (String argument) -> {
			return argument + "（ラムダ式書式1のメソッドを利用）";
		};
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);

		sampleClassPolymorphism = /* sampleFunction */ argument -> {
			return argument + "（ラムダ式書式2のメソッドを利用）";
		};
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);

		sampleClassPolymorphism = /* sampleFunction */ argument -> argument + "（ラムダ式書式3のメソッドを利用）";
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
	}
	
	private String mainPrivateFunction(String argument) {
		return argument + "（Mainクラスのprivateメソッドを利用）";
	}
	
	public static String mainStaticFunction(String argument) {
		return argument + "（Mainクラスのstaticメソッドを利用）";
	}

}
