//1から10までをカンマ区切りで表示（10の後には付けない）

public class Q_0103 {
	
	public static void main(String[] args) {
		
		for (int number = 1; number <= 10; number++) {
			
			if (number == 10) {
				System.out.print(number);
			} else {
				System.out.print(number + ", ");
			}
			
		}
		
	}

}
