package parallel.multiThread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class SampleAtomic {

	private AtomicInteger atomicInteger;
	private AtomicBoolean atomicBoolean;
	private AtomicReference<String> atomicReferenceString;
	private AtomicIntegerArray atomicIntegerArray;
	private AtomicReferenceArray<String> atomicReferenceArray;
	
	private int count = 0;
	public void doSomething01() {

		ExecutorService executorService = Executors.newCachedThreadPool();
		
		Runnable task = () -> {
			System.out.println("ID:" + Thread.currentThread().getId() + " COUNT:" + ++this.count);
			if (this.count % 3 == 0) {
				System.out.println("3Thread");
			}
		};
		
		for (int i = 0; i < 12; i++) {
			executorService.submit(task);
		}
		
		while (true) {
			if (this.count >= 12) {
				executorService.shutdown();
				break;
			}
		}

	}
	
}
