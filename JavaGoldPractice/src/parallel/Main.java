package parallel;

import parallel.multiThread.SampleThread;

public class Main {

	public static void main(String[] args) {
		
		new SampleThread().start();
		
		System.out.println("main");
		
	}
	
}
