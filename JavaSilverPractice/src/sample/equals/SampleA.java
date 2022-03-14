package sample.equals;

public class SampleA {
	
	private String stringA;
	
	public SampleA(String stringA) {
		this.stringA = stringA;
	}
	
	public String getStringA() {
		return this.stringA;
	}
	
	public void setStringA(String stringA) {
		this.stringA = stringA;
	}
	
	public boolean equals(SampleA sampleA) {
		
		if (this.stringA == sampleA.stringA) {
			return true;
		}
		
		return false;
		
	}
	
}
