package sample.sample;

public class SubSampleClass extends SampleClass {
	
	String str = "親クラスと重複しているフィールド";
	
	public void printStrSub() {
		System.out.println(this.str);
	}
	
	public void overrideMethod() {
		System.out.println("Sub");
	}
	
	public void callPrivateOverride() {
		this.printPrivate();
	}
	
	private void printPrivate() {
		System.out.println("PrivateSub");
	}
	
}
