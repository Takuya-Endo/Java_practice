package nestedClass.sampleLocal;

public class SampleLocalClass {
	
	String sampleString = "Hello";
	
	public void sampleMethod() {
		
//		Sample sampleClass = new Sample();
		String localString = " ";
		
		//クラス自体にアクセス修飾子は不可（ローカル変数と同じ扱いだから）
		class Sample {
			//クラスの中身は通常通りにアクセス修飾子を付けられる
			private String field; //フィールド
			//コンストラクタ
			public Sample(String field) {
				this.field = field;
			}
			//エンクロージングクラスのフィールドにも、ローカル変数にも、全てアクセス可能。
			public String concatLocalString() {
				return sampleString + localString + this.field;
			}
		}
		
		Sample sampleClass = new Sample("World");
		System.out.println(sampleClass.concatLocalString());
		
	}
	
}
