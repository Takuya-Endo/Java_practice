
//①要素数20の配列
//②0から5ずつ増加する要素
//③［0］～［10］の奇数と、［11］～［19］の偶数


public class Q_0104 {
	
	public static void main(String[] args) {
		
		int[] array = new int[20];
		array[0] = 0;
		
		for (int i = 1; i <= 19; i++) {
			array[i] = array[i-1] + 5;
		}
		
		for (int j = 0; j <= 10; j++) {
			if (j % 2 != 0) {
				if (array[j] == 5) {
					System.out.print("奇数：" + array[j] + ", ");
				} else if (array[j] == 45) {
					System.out.println(array[j]);
				} else {
					System.out.print(array[j] + ", ");
				}
			}
		}
		
		for (int k = 11; k <= 19; k++) {
			if (k % 2 == 0) {
				if (array[k] == 60) {
					System.out.print("偶数：" + array[k] + ", ");
				} else if (array[k] == 90) {
					System.out.print(array[k]);
				} else {
					System.out.print(array[k] + ", ");
				}
			}
		}
		
	}

}
