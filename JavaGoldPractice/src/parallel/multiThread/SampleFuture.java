package parallel.multiThread;

import java.util.concurrent.Callable;
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
	
	private int count = 0;
	public void doSomething02() {
		try {
			
//			Runnable task = () -> System.out.println("Runnable");
			//Runnable↑とCallable↓の書き換え
			Callable<Boolean> task = () -> {
				System.out.println("Runnable");
				return 7 == this.count++;
			};
			
			ExecutorService executorService = Executors.newSingleThreadExecutor();
			
			for (int i = 0; i < 10; i++) {
				
//				Future<Boolean> future = executorService.submit(task, i == 7);
				//Runnable↑とCallable↓の書き換え
				Future<Boolean> future = executorService.submit(task);
				
				if (future.get()) {
					System.out.println("finish：" + i);
					break;
				}
			}
		
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		}
	}
	
}
