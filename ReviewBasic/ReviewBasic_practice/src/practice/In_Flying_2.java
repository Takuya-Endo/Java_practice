package practice;

public interface In_Flying_2 {
	
	// メソッド（抽象メソッド）
    void fly();

    // defaultメソッド
    default void powerOff() {
        System.out.println("飛んでいる場合は落下します。");
    }

}
