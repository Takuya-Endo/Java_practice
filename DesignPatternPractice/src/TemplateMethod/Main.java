package TemplateMethod;

public class Main {
	
	public static void main(String[] args) {
		
		Super sub01 = new Sub01();
		Super sub02 = new Sub02();
		
		sub01.callRoutine();
		sub02.callRoutine();
		
	}
	
}
