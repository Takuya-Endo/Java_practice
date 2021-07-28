package practice;

public class Interface01_2 {
	
	public static void main(String[] args) {
		
		//In_MobilePhone_2のコンストラクタを使ってインスタンスmobilePhoneを生成
        In_MobilePhone_2 mobilePhone = new In_MobilePhone_2("000-1111-2222");

        System.out.println("電話番号は最大" + In_MobilePhone_2.MAX_NUMBER_DIGITS + "桁です。");
        //											↑
        //変数ではないためgetter等を使用の必要なく、インターフェースは直接参照可能	
        
        mobilePhone.call("99-8888-7777");
        
        Interface01_2.classTakePicture(mobilePhone);
    }//							↓
//								↓
    public static void classTakePicture(In_Camera_2 camera) {
        camera.takePicture();
    }

}
