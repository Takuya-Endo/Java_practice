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
		
		Runnable task_1 = () -> {
			long id = Thread.currentThread().getId();
			System.out.print(id + " ");
		};
		
		//①新しいスレッドを一つ生成
//		ExecutorService executorService_1 = Executors.newSingleThreadExecutor();
//		for (int i = 0; i < 5; i++) {
//			executorService_1.submit(task_1);
//		}
		
		//②新しいスレッドを引数の数だけ生成（Fixed＝固定数）
//		ExecutorService executorService_2 = Executors.newFixedThreadPool(3);
//		for (int i = 0; i < 5; i++) {
//			executorService_2.submit(task_1);
//		}
		
		//③新しいスレッドを必要に応じて生成
//		ExecutorService executorService_3 = Executors.newCachedThreadPool();
//		
//		for (int i = 0; i < 5; i++) {
//			executorService_3.submit(task_1);
//		}
		
		
		//ScheduledExecutorServiceインターフェースのscheduleメソッドは、
		//第一引数のタスクを、第二引数の時間（単位は第三引数）経過後に、実行する。
		
		//①新しいスレッドを一つ生成 ※処理を1回だけ遅延実行
//		ScheduledExecutorService scheduledExecutorService_1 = Executors.newSingleThreadScheduledExecutor();
//		Runnable task_2 = () -> {
//			System.out.println("finish");
//			scheduledExecutorService_1.shutdown();
//		};
//		scheduledExecutorService_1.schedule(task_2, 3, TimeUnit.SECONDS);
//		int count = 0;
//		while (true) {
//			
//			try {
//			
//				Thread.sleep(100);
//				if (scheduledExecutorService_1.isShutdown()) {
//					break;
//				}
//				System.out.println((++count) * 100 + " ms");
//			
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//			
//		}
		
		//②新しいスレッドを一つ生成 ※終了するまで定期的に遅延実行
		ScheduledExecutorService scheduledExecutorService_2 = Executors.newSingleThreadScheduledExecutor();
		Runnable task_3 = () -> {
			System.out.println("interrupt");
		};
		//第二引数→初期遅延、第三引数→インターバル
		scheduledExecutorService_2.scheduleAtFixedRate(task_3, 1, 1, TimeUnit.SECONDS);
		int count = 0;
		while (true) {
			
			try {
			
				Thread.sleep(100);
				System.out.print(">");
				count++;
				if (count == 50) {
					scheduledExecutorService_2.shutdown();
					break;
				}
			
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}

}
