package sample.equals;

public class SampleMain {

	public static void main(String[] args) {
		
		SampleA sampleA = new SampleA("SampleA");
		SampleB sampleB = new SampleB("SampleB");
		
		System.out.println(sampleA.equals(sampleB));
		System.out.println(sampleB.equals(sampleA));
		
		
		SampleA sampleA_1 = new SampleA("SampleA_1");
		SampleA sampleA_2 = new SampleA("SampleA_2");
		SampleB sampleB_1 = new SampleB("SampleB_1");
		SampleB sampleB_2 = new SampleB("SampleB_2");
		
		System.out.println(sampleA_1.equals(sampleA_2));
		System.out.println(sampleB_1.equals(sampleB_2));

		sampleA_2.setStringA("SampleA_1");
		sampleB_2.setStringB("SampleB_1");
		
		System.out.println(sampleA_1.equals(sampleA_2));
		System.out.println(sampleB_1.equals(sampleB_2));
		
	}
	
}
