package parallel.ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SampleExecutors {
	
	//Executorsクラスは
	//ExecutorServiceインターフェースやScheduledExecutorServiceインターフェースを
	//実現するためのFactoryクラス。create用のstaticメソッドがいくつか用意されている。
	
	public void doSomething() {
		
		//ExecutorServiceインターフェースのsubmitメソッドは、
		//引数のタスクを実行する。
		//引数はRunnnable（＝Threadクラスのrunメソッド）
		
		Runnable task = () -> {
			long id = Thread.currentThread().getId();
			System.out.print(id + " ");
		};
		
		//①新しいスレッドを一つ生成
//		ExecutorService executorService_1 = Executors.newSingleThreadExecutor();
//		for (int i = 0; i < 5; i++) {
//			executorService_1.submit(task);
//		}
		
		//②新しいスレッドを引数の数だけ生成（Fixed＝固定数）
//		ExecutorService executorService_2 = Executors.newFixedThreadPool(3);
//		for (int i = 0; i < 5; i++) {
//			executorService_2.submit(task);
//		}
		
		//③新しいスレッドを必要に応じて生成
//		ExecutorService executorService_3 = Executors.newCachedThreadPool();
//		
//		for (int i = 0; i < 5; i++) {
//			executorService_3.submit(task);
//		}
		
		//ScheduledExecutorServiceインターフェースのscheduleメソッドは、
		//第一引数のタスクを、第二引数の時間（単位は第三引数）経過後に、実行する。
		
		//①新しいスレッドを一つ生成
		ScheduledExecutorService scheduledExecutorService_1 = Executors.newSingleThreadScheduledExecutor();
		for (int i = 0; i < 5; i++) {
			scheduledExecutorService_1.schedule(task, 3, TimeUnit.SECONDS);
		}
		
	}

}
