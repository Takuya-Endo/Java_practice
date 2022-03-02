package sample;

public class SampleMain {

	public static void main(String[] args) {
		
		String ___ = "アンダースコアのみ識別子（変数名）";
		System.out.println(___);
		
		SampleMain sampleMain = new SampleMain();
		SampleClass sampleClass = new SampleClass("コンストラクタ");

		System.out.println(sampleClass.num);
		System.out.println(sampleClass.str);
		sampleMain.setInt(sampleClass.num); //プリミティブ型は引数に渡しても、コピーが渡って処理されるだけ→元のフィールドは書き換わらない。
		sampleMain.setStr(sampleClass.str); //String型もプリミティブ型を同じ扱い（↓immutableなオブジェクトのため）
		System.out.println(sampleClass.num);
		System.out.println(sampleClass.str);
		sampleMain.setClass(sampleClass); //オブジェクトが渡されると、参照がコピーされてわたるので、元のフィールドも書き換わる→Object objA = objBの挙動に近い？
		System.out.println(sampleClass.num);
		System.out.println(sampleClass.str);
		
		String strA = "TestA, TestB";
		sampleMain.replaceStringA_1(strA); //Stringはimmutableオブジェクトのため置き換わらない。↑の例も参照
		System.out.println(strA);
		System.out.println(sampleMain.replaceStringA_2(strA)); //戻り値であれば、別のオブジェクトとしてclone？が作られる。（replaceAllメソッド）
		
		float valueA = 3.14f;
		String valueB = "true";
		System.out.println(valueA + " " + valueB);
		System.out.println(10 + 20 + "30" + 40);
		String valueC = "10";
		System.out.println(valueC += 20);
		System.out.println(valueC += "30");
		int valueD = 10;
//		System.out.println(valueD += "20"); //これだけコンパイルエラー
		System.out.println(valueD += 30);
		
		String valueE = null;
//		valueE.equals("null"); //←ここではNullPointerException
		System.out.println(valueE);
		String valueF = "null";
		System.out.println(valueF);
		String valueG = valueE + valueF;
		System.out.println(valueG);
		
		StringBuilder stringBuilderA = new StringBuilder();
		System.out.println(stringBuilderA.capacity()); //16
		StringBuilder stringBuilderB = new StringBuilder("ABCDE");
		System.out.println(stringBuilderB.capacity()); //21
		stringBuilderA.append("A").append("B").append("C").append("D").append("E");
		System.out.println(stringBuilderA.capacity()); //16
		stringBuilderA.append("ABCDE");
		System.out.println(stringBuilderA.capacity()); //16
		stringBuilderB.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ"); //26文字
		System.out.println(stringBuilderB.capacity()); //44
		StringBuilder stringBuilderC = new StringBuilder();
		stringBuilderC.append("ABCDEFGHIJKLMNOP"); //16文字
		System.out.println(stringBuilderC.capacity()); //16
		StringBuilder stringBuilderD = new StringBuilder();
		stringBuilderD.append("ABCDEFGHIJKLMNOPQ"); //17文字
		System.out.println(stringBuilderD.capacity()); //34
		
		//拡張for文の中で生成されるのは一時変数であるため、そこに値を代入しても、元の配列の要素は書き換わらない。
		SampleClass[] samples = {new SampleClass("A"), new SampleClass("B"), new SampleClass("C")};
		for (SampleClass sample : samples) {
			sample = new SampleClass("D");
			System.out.println(sample.str);
		}
		for (SampleClass sample : samples) {
			System.out.println(sample.str);
		}
		
	}
	
	private void setInt(int num) {
		num += 10;
	}
	private void setStr(String str) {
		str += "を書き換えました";
	}
	private void setClass(SampleClass sampleClass) {
		sampleClass.num += 10;
		sampleClass.str += "を書き換えました";
	}
	
	private void replaceStringA_1(String str) {
		str.replaceAll("TestA", "TestB");
	}
	private String replaceStringA_2(String str) {
		return str.replaceAll("TestA", "TestB");
	}

}
