package Bridge;

public class ExtraSample extends Sample {

	private ExtraSampleImpl extraSampleImpl;
	
	public ExtraSample(SampleImpl sampleImpl) {
		super(sampleImpl);
		this.extraSampleImpl = new ExtraSampleSub01();
	}
	
	public void methodB() {
		this.extraSampleImpl.methodB();
	}

}
