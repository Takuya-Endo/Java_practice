package exception;

public class Main {
	
	public static void main(String[] args) {
		
		//try句を抜けたタイミングでcose()メソッドが呼ばれ、その後catch→finally。
		try (SampleConnection SampleConnection = new SampleConnection();) {
			
			System.out.println("try");
			throw new SampleException();
			
		} catch (SampleException e) {
			System.out.println("catch");
			e.printStackTrace();
		} finally {
			System.out.println("finally");
		}
		
	}

}
