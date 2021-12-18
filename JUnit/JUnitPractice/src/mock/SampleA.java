package mock;

public class SampleA {
	
	private SampleB sampleB = new SampleB();
	
	public int methodA(int a) {
		
		return this.sampleB.methodB(a) + a;
		
	}

}
