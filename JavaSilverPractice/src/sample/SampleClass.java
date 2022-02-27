package sample;

public class SampleClass {
	
//	int goto = 0; //「goto」は予約後のため使用不可
	
	int num = 0;
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
		System.out.println(str);
	}

}
