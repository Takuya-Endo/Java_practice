package practice;

public class Human01_2 {

	public String name; //メンバ変数（=クラスの直下に書かれた変数、クラス内のメソッドから自由にアクセス可能）
    public int age;  //メンバ変数

    //引数なしのコンストラクタ
    //コンストラクタ名はクラス名と同じにする		≠メソッド
    //コンストラクタは値を返さない（=returnは×）	≠メソッド
    public Human01_2() {
        name = "山田";
        age = 20;
    }
    
    //引数2つのコンストラクタ
    public Human01_2(String name, int age) {
        this.name = name;
        this.age = age;
    //this→自分自身のインスタンスを指す変数を扱う
    //this→自分自身のインスタンスのフィールドやメソッドであることを明示的にする
    }
    
}
