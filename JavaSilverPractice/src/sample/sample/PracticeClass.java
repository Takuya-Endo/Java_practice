package sample.sample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PracticeClass {
	
//	private final String FINAL_FIELD = "FINAL_FIELD";
	private final String FINAL_FIELD;
	
	public PracticeClass() {
		this.FINAL_FIELD = "FINAL_FIELD";
	}
	
	public static void practice() {
		
		String indexOf = "a_ _   _　_z";
		System.out.println(indexOf.indexOf("z")); //半角・全角スペースもすべて数える
		System.out.println(indexOf.indexOf("_z")); //二文字指定したら一文字目でカウント
		System.out.println(indexOf.indexOf("_a")); //二文字指定したら組み合わせがなければ「-1」
		System.out.println(indexOf.indexOf("b")); //存在しなければ「-1」
		
		String stringSwitch = "switch";
		switch (stringSwitch) {
		case "switchA":
			System.out.print("switchA ");
		case "switchB":
			System.out.print("switchB ");
		default:
			System.out.print("default ");
		case "switchC":
			System.out.print("switchC ");
		case "switchD":
			System.out.print("switchD ");
		//default switchC switchD 
		}
		System.out.print("\n");
		stringSwitch = "switchA";
		switch (stringSwitch) {
		case "switchA":
			System.out.print("switchA ");
		case "switchB":
			System.out.print("switchB ");
		default:
			System.out.print("default ");
		case "switchC":
			System.out.print("switchC ");
		case "switchD":
			System.out.print("switchD ");
		//switchA switchB default switchC switchD 
		}
		System.out.print("\n");
		stringSwitch = "switchD";
		switch (stringSwitch) {
		case "switchA":
			System.out.print("switchA ");
		case "switchB":
			System.out.print("switchB ");
		default:
			System.out.print("default ");
		case "switchC":
			System.out.print("switchC ");
		case "switchD":
			System.out.print("switchD ");
		//switchD 
		}
		
		System.out.print("\n");
		int intA = 0;
		System.out.println(intA++ + 1 + intA); //2
		intA = 0;
		System.out.println(++intA + 1 + intA); //3
		
		int intB = 10;
		int intC = intA + intB;
		
		intA = intB = intC = intB++;
		System.out.println(intA); //10
		
//		int intLocal; //ローカル変数は初期化が必要
//		System.out.println(intC); //使用しなければ定義だけならコンパイルエラーにはならない
		
		List<String> mutableList = new ArrayList<String>();
		mutableList.add("A");
		System.out.println(mutableList.get(0));
		List<String> immutableListA = Arrays.asList("A", "B", "C");
//		immutableListA.add("D"); //java.lang.UnsupportedOperationException
		System.out.println(immutableListA.get(0));
		List<String> immutableListB = List.of("A", "B", "C");
//		immutableListB.add("D"); //java.lang.UnsupportedOperationException
		System.out.println(immutableListB.get(0));		
		
	}

}
