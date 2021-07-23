package practice;

public class Human03_2 {
	
	public String name;
    public int age;
    public String profession;

    public Human03_2() {
        this.name = "山田";
        this.age = 20;
        this.profession = "プログラマー";
    }
    //コンストラクタ
    //public			コンストラクタ名()
    //メソッド⊃コンストラクタ
  	//コンストラクタ→メンバ変数の初期化など、クラスをインスタンス化したときの定型処理を、
  	//クラスの機能として実行してくれる特別なメソッド
  	//インスタンス化したときに一度だけ実行される
  	//コンストラクタ（constructor：建設者）

    
    public String getProfile() {
        return "年齢は" + this.age + "、職業は" + this.profession;
    }
    //メソッド
    //public 戻り値の型 メソッド名(ある場合は引数)
    //return 戻り値;
    

    //戻り値を返さない、String型の引数を1つとるメソッドを定義
    public void greet(String friend) {
        if (friend == null) { //String型の値はnullの可能性があるのでチェック
            System.out.println("挨拶する友達がわかりません！");
            return;
            //return文が実行された時点でメソッドを終了し呼び出し元へ処理が帰る
            //return文が実行されるとそれ以降にメソッド内に書かれた処理は実行されない
        }
        System.out.println(friend + "さん、こんにちは！");
    }

}
