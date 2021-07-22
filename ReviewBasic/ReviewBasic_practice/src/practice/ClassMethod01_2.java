package practice;

public class ClassMethod01_2 {
	
	public static void main(String[] args) {
		
		// Human01_2クラス（=データ＋メソッド,例：=犬＋お手）のインスタンス（=クラスをもとに生成するオブジェクト）を生成
		//=Human01_2クラスをインスタンス化（=クラスをもとにオブジェクトを生成）する
        
		Human01_2 yamada = new Human01_2();
        //	↑					↑
        //	↑					コンストラクタ（=クラスのインスタンスを作成するときに実行される処理）呼出し
        //Human01_2クラスのインスタンスyamadaを作成
        
        //デフォルトコンストラクタ（=引数なしのコンストラクタ）Human01_2()を使って、
        //Human01_2クラスのインスタンスyamadaを作成すると、Human01_2クラスの変数に、「山田,20を代入する」が実行される。
        
        System.out.println("名前は" + yamada.name + "で、年齢は" + yamada.age + "です。");
        //「yamada.name」→ 値を代入するときはインスタンス名.変数名を指定する
        
        
        
        Human01_2 sato = new Human01_2("佐藤", 25);
        System.out.println("名前は" + sato.name + "で、年齢は" + sato.age + "です。");
        //Human01_2クラスのインスタンスsatoを作成
        //引数ありのコンストラクタHuman01_2("佐藤", 25)を使う
        //Human01_2クラスのメンバ変数nameとage（thisで明示されている）に引数を代入するコンストラクタが用意されている
        //コンストラクタの引数を代入して実行
    }

}
