package nestedClass.sampleConcealment;

public class SamePackageMain {

	public static void main(String[] args) {
		
		SampleImplements sampleImplementsA = new SampleImplements();
		sampleImplementsA.conceal();
		sampleImplementsA.publish();
		//↑
		//1. インターフェースとファクトリーを使うことで情報隠蔽されている。
		//   が、同パッケージだと上の書き方でもアクセスできてしまう。
		//↓
//		SampleImplements sampleImplementsB = SampleFactory.create();
		SampleInterface sampleImplementsB = SampleFactory.create();
//		sampleImplementsB.conceal();
		sampleImplementsB.publish();
	
		
//		SampleInnerImplements sampleInnerImplementsA = new SampleInnerImplements();
//		sampleInnerImplementsA.conceal();
//		sampleInnerImplementsA.publish();
		//↑
		//2. インターフェースとファクトリーを使うことで情報隠蔽されている。
		//   さらにインナークラスを使うことで強化。同パッケージでもcreateメソッドでないと生成不可。
		//   concealメソッドの呼び出しもできなくなる。
		//↓		
		SampleInterface sampleInnerImplementsB = ImplementsAndFactory.create();
//		sampleInnerImplementsB.conceal();
		sampleInnerImplementsB.publish();
		
	}

}
