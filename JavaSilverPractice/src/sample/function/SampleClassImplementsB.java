package sample.function;

public class SampleClassImplementsB implements FunctionTypeInterface {
	
	@Override
	public String sampleFunction(String argument) {
		return argument + "（実装クラスBのメソッドを利用）";
	}
	
}
