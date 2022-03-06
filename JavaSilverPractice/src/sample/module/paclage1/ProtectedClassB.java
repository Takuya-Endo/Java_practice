package sample.module.paclage1;

import sample.module.paclage2.PublicClassC;

public class ProtectedClassB {
	
	protected void methodB() {
		System.out.println("ProtectedClassB");
	}
	
	public void methodC_1() {
		ProtectedClassC classC = new ProtectedClassC();
		classC.methodC(); //protectedのため、Mainからはアクセス不可
	}
	
	public void methodC_2() {
		PublicClassC classC = new PublicClassC();
		classC.methodC(); //protectedだとアクセス不可のためpublicにしている
	}
	
}
