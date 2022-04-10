package parallel.multiThread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class SampleFuture {

	public void doSomething01() {
		try {
			
			Thread.sleep(2000);		
			System.out.println("AAA");
			
			Runnable task = () -> {
				try {
					
					Thread.sleep(1000);
					System.out.println("BBB");
					Thread.sleep(1000);
					System.out.println("DDD");
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			};
			
			ExecutorService executorService = Executors.newSingleThreadExecutor();
			Future<String> future = executorService.submit(task, "run()メソッドが完了したらこれを返す");
			
			Thread.sleep(2000);
			if ("run()メソッドが完了したらこれを返す".equals(future.get())) {
				System.out.println("CCC");
			}
			System.out.println("EEE"); //↑のif文を消すと、タイミングによってCDEが入れ替わる
		
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		} catch (ExecutionException e2) {
			e2.printStackTrace();
		}
	}
	
}
