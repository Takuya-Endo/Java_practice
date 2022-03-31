package parallel.ExecutorFramework;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleExecutors {
	
	public void doSomething() {
		
		//ExecutorServiceインターフェースのsubmitメソッドは、
		//引数のタスクを実行する。
		//引数はRunnnable（＝Threadクラスのrunメソッド）
		
		Runnable task = () -> {
			long id = Thread.currentThread().getId();
			System.out.print(id + " ");
		};
		
		//ExecutorServiceインターフェースを実現するためのFactoryクラス
		//create用のstaticメソッドがいくつか用意されている
		
		//①新しいスレッドを一つ生成
		ExecutorService executorService_1 = Executors.newSingleThreadExecutor();
		for (int i = 0; i < 5; i++) {
			executorService_1.submit(task);
		}
		System.out.println();
		
	}

}
