package Bridge;

public class Main {
	
	public static void main(String[] args) {
		
		Sample sampleA_01 = new Sample(new SampleImplSub01());
		Sample sampleA_02 = new Sample(new SampleImplSub02());
		
		sampleA_01.methodA();
		sampleA_02.methodA();
		
		ExtraSample sampleB_01 = new ExtraSample(new SampleImplSub01());
		sampleB_01.methodA();
		sampleB_01.methodB();
		
	}

}
