package sample.sampleModule.main;

import sample.sampleModule.main.package1.PublicClassA;
import sample.sampleModule.main.package2.PublicClassC;

public class SampleMain {

	public static void main(String[] args) {
		
		PublicClassA classA = new PublicClassA();
		classA.methodA();
		
//		ProtectedClassB classB = new ProtectedClassB();
//		classB.methodB(); //protected -> Main -> AccessNG
		classA.methodB(); //A -> public (Override)

//		ProtectedClassC classC = new ProtectedClassC();
//		classC.methodC(); //protected -> Main -> AccessNG
		classA.methodC_1(); //B -> public (NewMethod)

		PublicClassC classC = new PublicClassC();
		classC.methodC(); //public -> Main -> AccessOK
		classA.methodC_1(); //B -> public (NewMethod)
		
	}
}
