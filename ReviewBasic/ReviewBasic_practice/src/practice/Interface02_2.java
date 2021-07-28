package practice;

public class Interface02_2 {
	
	public static void main(String[] args) {
        
		In_MobilePhone_2 mobilePhone = new In_MobilePhone_2("000-1111-2222");
        
        mobilePhone.powerOff();
        //階層が一番近いインターフェースであるIn_Phone_2のdefaultメソッドが呼び出される
        
    }

}
