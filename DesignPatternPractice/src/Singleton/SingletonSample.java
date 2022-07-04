package Singleton;

public class SingletonSample {
	
	private static SingletonSample singletonSample = new SingletonSample();
	
	//privateで明示的にコンストラクタを用意しないと、newされてしまう
	private SingletonSample() {}
	
	public static SingletonSample getSingletonSampleInstance() {
		return SingletonSample.singletonSample;
	}
	
}
