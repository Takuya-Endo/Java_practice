package TemplateMethod;

public abstract class Super {
	
	public abstract void doSomething01();
	public abstract void doSomething02();
	public abstract void doSomething03();

	public void callRoutine() {
		
		this.doSomething01();
		this.doSomething02();
		this.doSomething03();
		
	}
	
}
