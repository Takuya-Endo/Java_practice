//10から1まで数え、偶数のみを表示する

public class Q_0101 {
	
	public static void main(String[] args) {
		
		for (int number = 10; number >= 1; number--) {
			if (number % 2 == 0) {
				System.out.println(number);
			}
		}
	}

}
