package sample.sample;

public class SubSampleClass extends SampleClass {
	
	String str = "親クラスと重複しているフィールド";
	
	public void printStrSub() {
		System.out.println(this.str);
	}
	
}
