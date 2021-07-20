//1から10までの偶数の個数と合計

public class Q_0102 {

	public static void main(String[] args) {
		
		int even_number_count = 0;
		int even_number_total = 0;
		
		for (int number = 1; number <= 10; number++) {
			if (number % 2 == 0) {
				
				even_number_count += 1;
				even_number_total += number;
				
			}
		}
		
		System.out.println("偶数の個数は " + even_number_count + " です");
		System.out.println("偶数の合計は " + even_number_total + " です");
		
	}
	
}
