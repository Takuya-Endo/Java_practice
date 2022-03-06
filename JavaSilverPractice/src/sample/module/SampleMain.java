package sample.module;

import sample.module.paclage1.PublicClassA;

public class SampleMain {

	public static void main(String[] args) {
		
		PublicClassA classA = new PublicClassA();
		classA.methodA();
		
//		ProtectedClassB classB = new ProtectedClassB();
//		classB.methodB(); //protectedのため、Mainからはアクセス不可
		classA.methodB(); //Aクラスでpublicに書き換えてオーバーライド

	}
}
