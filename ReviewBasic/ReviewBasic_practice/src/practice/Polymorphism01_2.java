package practice;

public class Polymorphism01_2 {
	
	public static void main(String[] args) {
		
		
        Po_Human_2 human1 = new Po_Student_2("佐藤", 17, 70);
        //Po_Human_2クラスを継承したPo_Student_2クラスのコンストラクタでhuman1インスタンスを生成
        //Po_Human_2クラスの変数にPo_Student_2クラスのインスタンスを代入＝アップキャスト
        
        System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human1.getProfile());
        //オーバライドしているため、Po_Student_2クラスのメソッドが実行される。
        //Po_Human_2クラスのgetProfile()だけでは、Po_Student_2クラスのgetProfile()を実行すべきか、
        //Po_Employee_2クラスのgetProfile()を実行すべきか分からない。
        //実行内容が異なる（this.scoreを表示するか、this.departmentを表示するか）ためどちらか分からないと困る。

        
        //上記と同様
        Po_Human_2 human2 = new Po_Employee_2("田中", 28, "システム部");
        System.out.println("Humanクラスのメソッド：プロフィールを紹介します。" + human2.getProfile());
    }

}
