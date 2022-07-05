package Prototype;

//Sampleクラスをプロトタイプとして用意したい場合、
//継承等を利用する必要はなく、単にcloneメソッドを追加するだけでよい
public class PrototypeSample implements Cloneable {
	
	private String name;
	private String initializeCompletedFlag;
	
	public PrototypeSample(String name) {
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
	
	public PrototypeSample clone(String name) {
		PrototypeSample newSample = new PrototypeSample(name);
		newSample.initializeCompletedFlag = this.initializeCompletedFlag;
		return newSample;
	}
	
}
