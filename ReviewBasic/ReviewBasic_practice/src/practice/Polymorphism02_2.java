package practice;

public class Polymorphism02_2 {
	
	public static void main(String[] args) {
        
        Po_Human_2 human = new Po_Student_2("佐藤", 17, 70);
        //Po_Human_2クラスを継承したPo_Student_2クラスのコンストラクタでhumanインスタンスを生成
        //Po_Human_2クラスの変数にPo_Student_2クラスのインスタンスを代入＝アップキャスト
        
        
        // Polymorphism02インスタンスを生成
        Polymorphism02_2 polymorphism = new Polymorphism02_2();

        // printNameメソッド（引数なし）の呼び出し
        polymorphism.printName();
        // printNameメソッド（引数がStringクラス）の呼び出し
        polymorphism.printName("松本");
        // printNameメソッド（引数がStringクラスとStringクラス）の呼び出し
        polymorphism.printName("松本", "清水");
        // printNameメソッド（引数がHumanクラス）の呼び出し
        polymorphism.printName(human);
    }
	
	//	↑
	//引数の型or数or並び順の異なるメソッドを複数定義することが可能 ＝ オーバーロード
	//	↑
	    public void printName() {
	        System.out.println("中川です。");
	    }
	    public void printName(String name) {
	        System.out.println(name + "です。");
	    }
	    //引数の型は同じでも数が異なる
	    public void printName(String name1, String name2) {
	        System.out.println(name1 + "と" + name2 + "です。");
	    }
	    //引数の数は同じでも型が異なる
	    public void printName(Po_Human_2 human) {
	        System.out.println(human.getName() + "です。");
	    }

}
