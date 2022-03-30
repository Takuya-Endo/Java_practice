package nestedClass.sampleLocal;

public class SampleAnonymousClass {
	
	public void sampleMethod() {
		
		//ローカルクラスを、どうせnewするだけという理由で匿名クラスに書き換えることはできない。
		//ローカルクラスが自作だった場合、名前がなくなるため、コンパイルエラーとなる。
		//そのためインターフェース実装や抽象クラスを継承したクラス等のみ匿名クラスとして使える。
		
//		SampleAbstractClass sampleExtends = new SampleAbstractClass();
		SampleAbstractClass sampleExtends = new SampleAbstractClass() {
			@Override
			public void abstractMethod() {
				System.out.println("継承してオーバーライド");
			}
		};
		
//		SampleInterface sampleImplements = new SampleInterface();
		SampleInterface sampleImplements = new SampleInterface() {
			@Override
			public void abstractMethod() {
				System.out.println("実装");
			}
		};
		
		sampleExtends.abstractMethod();
		sampleImplements.abstractMethod();
		
	}
	
}
