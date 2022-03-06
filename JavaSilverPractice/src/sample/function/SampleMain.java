package sample.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

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

		//↑実装クラスを用意して、そのインスタンスを格納することで呼び出すしかなかった
		//↓実装クラスがなくても「::」を利用した書き方で関数自体を格納し、多態性で呼び出すことが可能
		
		SampleMain sampleMain = new SampleMain();
		value = sampleMain.mainPrivateFunction("TestString");
		System.out.println(value);
		
//		sampleClassPolymorphism = sampleMain.mainPrivateFunction("TestString");
		sampleClassPolymorphism = sampleMain::mainPrivateFunction; //通常は「インスタンス名::メソッド名」
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
		value = SampleMain.mainStaticFunction("TestString");
		System.out.println(value);
		
		sampleClassPolymorphism = SampleMain::mainStaticFunction; //staticメソッドの場合は「クラス名::メソッド名」
		value = sampleClassPolymorphism.sampleFunction("TestString");
		System.out.println(value);
		
		sampleClassPolymorphism = /* sampleFunction */ (String argument) -> { //ラムダ式を活用することでさらに便利に
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
		
		//用意された関数型インターフェースは下記の名前で抽象メソッドが定義されている
		Function<String, String> sampleFuncion = null; //→ R apply(T t);
		Predicate<String> samplePredicate = null; //→ boolean test(T t);
		Consumer<String> sampleConsumer = null; //→ void accept(T t);
		Supplier<String> sampleSupplier = null; //→ T get();
		
	}
	
	private String mainPrivateFunction(String argument) {
		return argument + "（Mainクラスのprivateメソッドを利用）";
	}
	
	public static String mainStaticFunction(String argument) {
		return argument + "（Mainクラスのstaticメソッドを利用）";
	}

}
