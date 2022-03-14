package sample.equals;

public class SampleB {

	private String stringB;
	
	public SampleB(String stringB) {
		this.stringB = stringB;
	}
	
	public String getStringB() {
		return this.stringB;
	}
	
	public void setStringB(String stringB) {
		this.stringB = stringB;
	}
	
	public boolean equals(Object object) {
		
		if (!(object instanceof SampleB)) {
			return false;
		}
		
		SampleB objectB = (SampleB) object;
		
		if (this.stringB == objectB.stringB) {
			return true;
		}
		
		return false;
		
	}
	
}
