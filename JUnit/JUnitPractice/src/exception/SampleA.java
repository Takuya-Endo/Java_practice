package exception;

public class SampleA {
	
	private int[] array = new int[3];
	
	public SampleA() {
		this.array[0] = 1;
		this.array[1] = 2;
		this.array[2] = 3;
	}
	
	public void methodA(int number) throws ArrayIndexOutOfBoundsException {
		
		try {
			
			System.out.println(this.array[number]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
//			e.printStackTrace();
			throw e;
			
		}
		
	}

}
