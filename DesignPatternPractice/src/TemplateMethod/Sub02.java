package TemplateMethod;

public class Sub02 extends Super {
	
	@Override
	public void doSomething01() {
		System.out.println("Method_A");
	}

	@Override
	public void doSomething02() {
		System.out.println("Method_B");
	}

	@Override
	public void doSomething03() {
		System.out.println("Method_C");
	}
}
