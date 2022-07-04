package Singleton;

public class SingletonSample {
	
	private static String instanceName;
	
	private final static SingletonSample singletonSample = new SingletonSample();
	
	//privateで明示的にコンストラクタを用意しないと、newされてしまう
	private SingletonSample() {}
	
	public static SingletonSample getSingletonSampleInstance(String instanceName) {
		
		if (SingletonSample.instanceName == null) {
			SingletonSample.instanceName = instanceName;
		}
		return SingletonSample.singletonSample;
	}
	
	public String getInstanceName() {
		return SingletonSample.instanceName;
	}
	
}
