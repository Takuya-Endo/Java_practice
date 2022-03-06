package sample.module;

import sample.module.paclage1.PublicClassA;
import sample.module.paclage2.PublicClassC;

public class SampleMain {

	public static void main(String[] args) {
		
		PublicClassA classA = new PublicClassA();
		classA.methodA();
		
//		ProtectedClassB classB = new ProtectedClassB();
//		classB.methodB(); //protectedのため、Mainからはアクセス不可
		classA.methodB(); //Aクラスでpublicに書き換えてオーバーライド

//		ProtectedClassC classC = new ProtectedClassC();
//		classC.methodC(); //protectedのため、Mainからはアクセス不可
		classA.methodC_1(); //Bクラスでpublicの新しいメソッドを定義

		PublicClassC classC = new PublicClassC();
		classC.methodC(); //publicのため、Mainからでもアクセス可能
		classA.methodC_1(); //Bクラスでpublicの新しいメソッドを定義
		
	}
}
