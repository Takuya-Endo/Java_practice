package sample.samplePackage.package1;

import sample.sampleModule.main.package2.PublicClassC;

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
