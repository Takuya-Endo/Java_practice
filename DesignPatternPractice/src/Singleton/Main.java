package Singleton;

public class Main {
	
	public static void main(String[] args) {
		
//		SingletonSample singletonSample = new SingletonSample();
		
		SingletonSample singletonSample01 = SingletonSample.getSingletonSampleInstance("Instance01");
		SingletonSample singletonSample02 = SingletonSample.getSingletonSampleInstance("Instance02");
		
		System.out.println(singletonSample01);
		System.out.println(singletonSample02);
		
		System.out.println(singletonSample01.getInstanceName());
		System.out.println(singletonSample02.getInstanceName());
		
	}

}
