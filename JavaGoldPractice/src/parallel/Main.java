package parallel;

import parallel.multiThread.SampleThread;

public class Main {

	public static void main(String[] args) {
		
		Runnable runnable = () -> { System.out.println("SubRunnable"); };
		
		new SampleThread().start();
		new Thread(runnable).start();
		
		System.out.println("Main");
		
	}
	
}
