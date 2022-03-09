package sample.sample;

public class SampleClass {
	
//	int goto = 0; //「goto」は予約後のため使用不可
	
	int num = 0;
//	int numA = 1 + num;
//	int numA = 1 += num; //上の書き方でないとコンパイルエラー
	int numA = num += 1; //左右のオペランドの評価が終わっていれば実行可能
	
	String str = "文字列";
	
	//初期化子：全てのコンストラクタの前に処理される。{}だけ書くと、共通のコンストラクタのような物。
	{ System.out.println("初期化子"); }
	
	SampleClass() { System.out.println("デフォルトコンストラクタ"); }
	
	//コンストラクタでthis()等を使う場合は一番上でないとコンパイルエラー。
//	SampleClass(String str) {
//		System.out.println(str);
//		this();
//	}
	SampleClass(String str) {
		this();
		this.str = str;
		System.out.println(str);
	}
	
	public void printStr() {
		System.out.println(this.str);
	}
	
	public void overrideMethod() {
		System.out.println("Super");
	}

	public void callPrivate() {
		this.printPrivate();
	}
	
	public void callPrivateOverride() {
		this.printPrivate();
	}
	
	private void printPrivate() {
		System.out.println("PrivateSuper");
	}
	
}
