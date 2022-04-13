package parallel.multiThread;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class SampleAtomic {

	private AtomicInteger atomicInteger;
	private AtomicBoolean atomicBoolean;
	private AtomicReference<String> atomicReferenceString;
	
//	private int count = 0;
	public void doSomething01() {
//
//		ExecutorService executorService = Executors.newFixedThreadPool(3);
//		
//		Runnable barrierAction = () -> System.out.println("3Thread");
//		CyclicBarrier cyclicBarrier = new CyclicBarrier(3, barrierAction);
//		
//		Runnable task = () -> {
//			try {
//				
//				System.out.println("ID:" + Thread.currentThread().getId() + " COUNT:" + ++this.count);
//				cyclicBarrier.await();
//			
//			} catch (InterruptedException | BrokenBarrierException e) {
//				e.printStackTrace();
//			}
//		};
//		
//		for (int i = 0; i < 12; i++) {
//			executorService.submit(task);
//		}
//		executorService.shutdown();

	}
	
}
