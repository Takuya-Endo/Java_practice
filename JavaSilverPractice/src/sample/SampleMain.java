package sample;

public class SampleMain {

	public static void main(String[] args) {
		
		String ___ = "アンダースコアのみ識別子（変数名）";
		System.out.println(___);
		
		float valueA = 3.14f;
		String valueB = "true";
		System.out.println(valueA + " " + valueB);
		System.out.println(10 + 20 + "30" + 40);
		
		SampleMain sampleMain = new SampleMain();
		SampleClass sampleClass = new SampleClass("コンストラクタ");

		System.out.println(sampleClass.num);
		System.out.println(sampleClass.str);
		sampleMain.setInt(sampleClass.num); //プリミティブ型は引数に渡しても、コピーが渡って処理されるだけ→元のフィールドは書き換わらない。
		sampleMain.setStr(sampleClass.str); //String型もプリミティブ型を同じ扱い
		System.out.println(sampleClass.num);
		System.out.println(sampleClass.str);
		sampleMain.setClass(sampleClass); //オブジェクトが渡されると、参照がコピーされてわたるので、元のフィールドも書き換わる→Object objA = objBの挙動に近い？
		System.out.println(sampleClass.num);
		System.out.println(sampleClass.str);
		
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

}
