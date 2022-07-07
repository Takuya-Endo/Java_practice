package AbstractFactory;

import java.util.List;

public class Sample {
	
	private String name;
	private FieldObject01 fieldObject01;
	private List<FieldObject02> fieldObject02List;
	private FieldObject03 fieldObject03;
	
	@Override
	public String toString() {
		
		return
			this.name + "\n"
			+ "　" + this.fieldObject01.getName() + "\n"
			+ "　[" + this.fieldObject02List.stream().map(fieldObject02->fieldObject02.getName()).reduce((name1, name2)->name1+", "+name2).get() + "]\n"
			+ "　" + this.fieldObject03.getName();
		
	}
	
	public Sample name(String name) {
		this.name = name;
		return this;
	}
	public Sample fieldObject01(FieldObject01 fieldObject01) {
		this.fieldObject01 = fieldObject01;
		return this;
	}
	public Sample fieldObject02List(List<FieldObject02> fieldObject02List) {
		this.fieldObject02List = fieldObject02List;
		return this;
	}
	public Sample fieldObject03(FieldObject03 fieldObject03) {
		this.fieldObject03 = fieldObject03;
		return this;
	}
	
}
