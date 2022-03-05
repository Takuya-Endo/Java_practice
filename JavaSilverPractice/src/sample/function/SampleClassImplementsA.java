package sample.function;

public class SampleClassImplementsA implements FunctionTypeInterface {
	
	@Override
	public String sampleFunction(String argument) {
		return argument + "（実装クラスAのメソッドを利用）";
	}
	
}
