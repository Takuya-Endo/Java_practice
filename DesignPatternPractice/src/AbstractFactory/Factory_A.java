package AbstractFactory;

import java.util.Arrays;
import java.util.List;

public class Factory_A extends AbstractFactory {

	@Override
	public String getName() {
		return "SampleA";
	}
	
	@Override
	public FieldObject01 getFieldObject01() {
		return new FieldObject01("FieldObject01_A");
	}

	@Override
	public List<FieldObject02> getFieldObject02List() {
		return Arrays.asList(new FieldObject02("FieldObject02_A")
								, new FieldObject02("FieldObject02_A")
								, new FieldObject02("FieldObject02_A"));
	}

	@Override
	public FieldObject03 getFieldObject03() {
		return new FieldObject03("FieldObject03_A");
	}
	
	public static Factory_A createFactory_A() {
		return new Factory_A();
	}

}
