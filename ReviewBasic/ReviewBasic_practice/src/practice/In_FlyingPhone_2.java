package practice;

public class In_FlyingPhone_2 implements In_Phone_2, In_Flying_2 {

	private int minutes;
	
	public In_FlyingPhone_2(int minutes) {
		this.minutes = minutes;
	}
	
	public void fly() {
		System.out.println(this.minutes + "分間、飛びます。");
	}
	
	public void call(String number) {
		System.out.println(number + "に電話します。通話できるのは飛んでいる間だけです。");
	}
	
	
	//同じ階層のインターフェースに、同じ名称のpowerOffメソッド（処理内容は異なる）があるため、
	//明示的にどちらのdefaultメソッドを使用するかを記述する必要がある。
	//→そこでsuperを使ってオーバーライドする。
	public void powerOff() {
		In_Flying_2.super.powerOff();
		return;
	}

}
