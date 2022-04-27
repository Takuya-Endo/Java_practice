package nestedClass.sampleLocal;

public class SampleAnonymousClass {
	
	private SampleClass sampleClass;

	public void doSomething01() {
		
		//ローカルクラスを、どうせnewするだけという理由で匿名クラスに書き換えることはできない。
		//ローカルクラスが自作だった場合、名前がなくなるため、コンパイルエラーとなる。
		//そのためインターフェース実装や抽象クラスを継承したクラス等のみ匿名クラスとして使える。
		
//		SampleAbstractClass sampleExtends = new SampleAbstractClass();
		SampleAbstractClass sampleExtends = new /*AnonymousClassName  extends*/ SampleAbstractClass() {
			@Override
			public void abstractMethod() {
				System.out.println("継承してオーバーライド");
			}
		};
		
//		SampleInterface sampleImplements = new SampleInterface();
		SampleInterface sampleImplements = new /*AnonymousClassName  implements*/ SampleInterface() {
			@Override
			public void abstractMethod() {
				System.out.println("実装");
			}
		};
		
		sampleExtends.abstractMethod();
		sampleExtends.anotherMethod();
		sampleImplements.abstractMethod();
		sampleImplements.anotherMethod();
		
		
		SampleClass sample = new SampleClass("Field_A");
		System.out.println(sample.getField());
		SampleClass sampleSub = new /* SampleSubClass extends */ SampleClass("Field_B") {
			String field;
			{
				this.field = super.getField() + "\n" + "Field_C";
			}
			@Override
			public String getField() {
				return this.field;
			}
		};
		System.out.println(sampleSub.getField());
		
	}
	
}
