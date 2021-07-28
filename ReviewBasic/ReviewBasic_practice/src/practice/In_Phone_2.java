package practice;

public interface In_Phone_2 {
	
	int MAX_NUMBER_DIGITS = 11;

    public void call(String number);
    //インターフェースに宣言できるのは抽象メソッドのみ

    //Interface02_2で実行されるdefaultメソッド
    default void powerOff() {
    	System.out.println("電源を切ります。");
    }

}
