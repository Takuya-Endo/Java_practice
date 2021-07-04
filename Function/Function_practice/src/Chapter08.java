
public class Chapter08 {
	
	public static void main(String[] args) {
		
		int number = 1;
		int array[] = { 1, 2, 3, 4 };
		
		while (number < 5) {
			System.out.println(number * number);
			number++;
		}
		 
		for (int aryNum = 0; aryNum < array.length; aryNum++) {
			System.out.println(array[aryNum]);
		}
		
		for (int aryElement : array) {
			if (aryElement % 2 == 0) {
				continue;
			}
			System.out.println(aryElement);
		}
	}

}
