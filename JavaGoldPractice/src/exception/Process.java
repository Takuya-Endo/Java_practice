package exception;

public class Process {
	
	public void doSomething01() {
		
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
	
	public void doSomething02() {
		
		try {
			
			throw new SampleException();
			
		//継承関係にある例外はマルチキャッチ不可（下の場合、Exceptionだけで子のSampleExceptionもcatchできる）
//		} catch (SampleException | Exception e) {
			
		} catch (SampleException | RuntimeException e) {
			
		}
		
	}

}
