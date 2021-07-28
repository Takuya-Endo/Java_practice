package practice;

//										インターフェース名
public class In_MobilePhone_2 implements In_Phone_2, In_Camera_2 {
//										抽象メソッドが定義されたインターフェース
//										In_Phone_2, In_Camera_2をそれぞれIn_MobilePhone_2に実装する
	
	private String number;

	//コンストラクタ
    public In_MobilePhone_2(String number) {
        this.number = number;
    }
    
    //In_Camera_2の抽象メソッドtakePicture()を継承して、In_MobilePhone_2で新たにメソッドを実装
    public void takePicture() {
        System.out.println("写真をとります。");
    }
    
    //In_Phone_2の抽象メソッドcall()を継承して、In_MobilePhone_2で新たにメソッドを実装
    public void call(String number) {
        System.out.println(this.number + " から " + number + " に電話をかけます。");
    }

}
