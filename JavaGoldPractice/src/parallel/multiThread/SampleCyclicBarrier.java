package parallel.multiThread;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SampleCyclicBarrier {
	
	private int count = 0;
	public void doSomething01() {

		ExecutorService executorService = Executors.newFixedThreadPool(3);
		
		Runnable barrierAction = () -> System.out.println("3Thread");
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, barrierAction);
		
		Runnable task = () -> {
			try {
				
				synchronized (this) { //このsynchronizedの有無で、countが順に加算されていくか、並列処理で実行ごとに変わるか、制御できる。
					System.out.println("ID:" + Thread.currentThread().getId() + " COUNT:" + ++this.count);
				}
				
				cyclicBarrier.await();
			
			} catch (InterruptedException | BrokenBarrierException e) {
				e.printStackTrace();
			}
		};
		
		for (int i = 0; i < 12; i++) {
			executorService.submit(task);
		}
		executorService.shutdown();

	}
	
}
