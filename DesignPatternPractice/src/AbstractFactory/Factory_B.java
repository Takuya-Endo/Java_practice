package AbstractFactory;

import java.util.Arrays;
import java.util.List;

public class Factory_B extends AbstractFactory {

	@Override
	public String getName() {
		return "SampleB";
	}
	
	@Override
	public FieldObject01 getFieldObject01() {
		return new FieldObject01("FieldObject01_B");
	}

	@Override
	public List<FieldObject02> getFieldObject02List() {
		return Arrays.asList(new FieldObject02("FieldObject02_B")
								, new FieldObject02("FieldObject02_B")
								, new FieldObject02("FieldObject02_B"));
	}

	@Override
	public FieldObject03 getFieldObject03() {
		return new FieldObject03("FieldObject03_B");
	}
	
	public static Factory_B createFactory_B() {
		return new Factory_B();
	}

}
