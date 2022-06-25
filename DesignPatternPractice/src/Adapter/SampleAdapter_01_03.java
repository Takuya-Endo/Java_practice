package Adapter;

public class SampleAdapter_01_03 extends SampleSuper {

	@Override
	public void doSomething03() {
		System.out.println("Method03");
	}

	public void doSomething_01() {
		new Sample().doSomething01();
	}
	
}
