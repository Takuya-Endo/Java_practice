package practice;

public class ClassMethod03_2 {
	
	public static void main(String[] args) {
        
		Human03_2 yamada = new Human03_2();
        //コンストラクタHuman03_2を使って、インスタンスyamadaを生成
		//メソッド⊃コンストラクタ
		//コンストラクタ→メンバ変数の初期化など、クラスをインスタンス化したときの定型処理を、
		//クラスの機能として実行してくれる特別なメソッド
		//インスタンス化したときに一度だけ実行される
		//コンストラクタ（constructor：建設者）

        System.out.println("私の名前は、" + yamada.name + "です。");
        String profile = yamada.getProfile();
        System.out.println(profile + "です。");

        yamada.greet("田辺");
        yamada.greet(null);
    }

}
