package Bridge;

public class Sample {
	
	private SampleImpl sampleImpl;
	
	public Sample(SampleImpl sampleImpl) {
		this.sampleImpl = sampleImpl;
	}
	
	public void methodA() {
		this.sampleImpl.methodA();
	}

}
