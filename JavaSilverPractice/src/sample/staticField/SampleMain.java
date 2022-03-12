package sample.staticField;

public class SampleMain {
	
	private static int number;
	
	public static void main(String[] args) {
		
		System.out.println(number);
//		System.out.println(SampleMain.number); //OK
//		System.out.println(this.number); //NG
		
		
	}

}
