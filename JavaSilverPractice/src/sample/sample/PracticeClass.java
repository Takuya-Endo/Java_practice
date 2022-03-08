package sample.sample;

public class PracticeClass {
	
	public static void practice() {
		
		String indexOf = "a_ _   _　_z";
		System.out.println(indexOf.indexOf("z")); //半角・全角スペースもすべて数える
		System.out.println(indexOf.indexOf("_z")); //二文字指定したら一文字目でカウント
		System.out.println(indexOf.indexOf("_a")); //二文字指定したら組み合わせがなければ「-1」
		System.out.println(indexOf.indexOf("b")); //存在しなければ「-1」
		
	}

}
