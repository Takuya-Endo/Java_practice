package parallel;

import parallel.multiThread.SampleMultiThread;

public class Main {

	public static void main(String[] args) {
		
//		Runnable runnable = () -> { System.out.println("SubRunnable"); };
//		
//		new SampleThread().start();
//		new Thread(runnable).start();
//		
//		System.out.println("Main");
//		
//		
//		new SampleExecutors().doSomething();
		
//		new SampleFuture().doSomething01();
//		new SampleFuture().doSomething02();
//		new SampleCyclicBarrier().doSomething01();
//		new SampleAtomic().doSomething01();
		
		new SampleMultiThread().doSomething01();
		
	}
	
}
