package parallel;

import parallel.ExecutorFramework.SampleExecutors;
import parallel.multiThread.SampleThread;

public class Main {

	public static void main(String[] args) {
		
		Runnable runnable = () -> { System.out.println("SubRunnable"); };
		
		new SampleThread().start();
		new Thread(runnable).start();
		
		System.out.println("Main");
		
		
		new SampleExecutors().doSomething();
		
	}
	
}
