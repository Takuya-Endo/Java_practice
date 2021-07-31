package practice;

public class Chapter13_2 {
	
	public static void main(String[] args) {
        
        In_MobilePhone_2 mobilePhone = new In_MobilePhone_2("000-1111-2222");
        mobilePhone.takePicture();
        Chapter13_2.staticCall(mobilePhone, "99-8888-7777");
        mobilePhone.powerOff();

        In_FlyingPhone_2 flyingPhone = new In_FlyingPhone_2(5);
        flyingPhone.fly();
        Chapter13_2.staticCall(flyingPhone, "000-1111-2222");
        flyingPhone.powerOff();
    }

    public static void staticCall(In_Phone_2 phone, String number) {
        phone.call(number);
    }

}
