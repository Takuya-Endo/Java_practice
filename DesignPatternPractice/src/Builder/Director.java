package Builder;

public class Director {
	
	private Builder builder;
	
	public Director(Builder builder) {
		this.builder = builder;
	}
	
	public void constract() {
		this.builder.setPersonalInfo(1, "sampleA", 20, "Department");
	}

}
