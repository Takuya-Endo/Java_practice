package Singleton;

public class Main {
	
	public static void main(String[] args) {
		
//		SingletonSample singletonSample = new SingletonSample();
		
		SingletonSample singletonSample01 = SingletonSample.getSingletonSampleInstance();
		SingletonSample singletonSample02 = SingletonSample.getSingletonSampleInstance();
		
		System.out.println(singletonSample01);
		System.out.println(singletonSample02);
		
	}

}
