package sample.function;

public class SampleMain {

	public static void main(String[] args) {
		
		String value = "";
		
		SampleClassImplementsA sampleClassA = new SampleClassImplementsA();
		value = sampleClassA.sampleFunction("TestString");
		System.out.println(value);
		
		FunctionTypeInterface sampleClassPolymorphismA = new SampleClassImplementsA();
		value = sampleClassPolymorphismA.sampleFunction("TestString");
		System.out.println(value);
		
		SampleClassImplementsB sampleClassB = new SampleClassImplementsB();
		value = sampleClassB.sampleFunction("TestString");
		System.out.println(value);
		
		FunctionTypeInterface sampleClassPolymorphismB = new SampleClassImplementsB();
		value = sampleClassPolymorphismB.sampleFunction("TestString");
		System.out.println(value);
		
	}

}
