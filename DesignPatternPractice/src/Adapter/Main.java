package Adapter;

public class Main {

	public static void main(String[] args) {
		
		Sample sample02 = new Sample();
		sample02.doSomething02();
		
//		SampleInterface sample01 = new Sample();
		SampleInterface sample01 = new SampleAdapter();
		sample01.doSomething01();
		Sample sample01_2 = (Sample)sample01;
		sample01_2.doSomething02();
		
	}
	
}
