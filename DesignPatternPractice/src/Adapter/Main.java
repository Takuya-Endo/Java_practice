package Adapter;

public class Main {

	public static void main(String[] args) {
		
		Sample sample01 = new Sample();
		sample01.doSomething01();
		
//		SampleInterface sample02 = new Sample();
		SampleInterface sample02 = new SampleAdapter_01_02();
		sample02.doSomething02();
		Sample sample_02 = (Sample)sample02;
		sample_02.doSomething01();
		
//		SampleSuper sample03 = new Sample();
		SampleSuper sample03 = new SampleAdapter_01_03();
		sample03.doSomething03();
		SampleAdapter_01_03 sample_03 = (SampleAdapter_01_03)sample03;
		sample_03.doSomething_01();
		
	}
	
}
