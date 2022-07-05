package Prototype;

public class Sample {
	
	private String name;
	private String initializeCompletedFlag;
	
	public Sample(String name) {
		this.name = name;
	}
	
	//重い初期化処理
	public void runSlowInitializeMethod() {
		
		System.out.print("初期化中...");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.initializeCompletedFlag = "初期化完了済";
		System.out.println("初期化完了");
	}

	public String getName() {
		return this.name;
	}
	public String getInitializeCompletedFlag() {
		return this.initializeCompletedFlag;
	}
	
}
