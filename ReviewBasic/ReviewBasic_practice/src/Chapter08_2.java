
public class Chapter08_2 {
	
	public static void main(String[] args) {
		
		int while_number = 1;
		while (while_number < 5) {
			System.out.println(while_number * while_number);
			++while_number;
		}
		
		
		int[] array = {10, 15, 20, 25};
		for (int element_number = 0; element_number < array.length; element_number++) {
			System.out.println(array[element_number]);
		}
		
		
		for (int element_value : array) {
			if (element_value % 2 == 0) {
				continue;
			} else if (element_value % 2 != 0) {
				System.out.println(element_value);
			}
			
		}
		
	}

}