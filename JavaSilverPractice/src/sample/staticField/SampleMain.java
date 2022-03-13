package sample.staticField;

public class SampleMain {
	
	private static int number;
	
//	public SampleMain(int number) {
//		this.number = number * 2;
//	}
	static {
		number = 10;
	}
	
	public static void main(String[] args) {
		
		System.out.println(number);
//		System.out.println(SampleMain.number); //OK
//		System.out.println(this.number); //NG

//		SampleMain main = new SampleMain(5); //コンストラクタにすると前後でstaticの出力値が変わる→static初期価値を使わないと記述準によって値が変わる。
		System.out.println(number);
		
	}

}
