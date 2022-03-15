package sample.equals;

public class SampleMain {

	public static void main(String[] args) {
		
		SampleA sampleA = new SampleA("SampleA");
		SampleB sampleB = new SampleB("SampleB");
		
		System.out.println(sampleA.equals(sampleB));
		System.out.println(sampleB.equals(sampleA));
		
	}
	
}
