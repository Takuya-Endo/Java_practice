package AbstractFactory;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		FieldObject01 fieldObject01 = new FieldObject01("FieldObject01");
		FieldObject02 fieldObject02 = new FieldObject02("FieldObject02");
		FieldObject03 fieldObject03 = new FieldObject03("FieldObject03");
		
		List<FieldObject02> fieldObject02List = Arrays.asList(fieldObject02, fieldObject02, fieldObject02);
		
		Sample sample01 = new Sample()
								.name("Sample")
								.fieldObject01(fieldObject01)
								.fieldObject02List(fieldObject02List)
								.fieldObject03(fieldObject03);
		
		System.out.println(sample01);
		
		
		AbstractFactory factoryA = Factory_A.createFactory_A();
		AbstractFactory factoryB = Factory_B.createFactory_B();
		
		Sample sample02 = new Sample()
				.name(factoryA.getName())
				.fieldObject01(factoryA.getFieldObject01())
				.fieldObject02List(factoryA.getFieldObject02List())
				.fieldObject03(factoryA.getFieldObject03());
		
		Sample sample03 = new Sample()
				.name(factoryB.getName())
				.fieldObject01(factoryB.getFieldObject01())
				.fieldObject02List(factoryB.getFieldObject02List())
				.fieldObject03(factoryB.getFieldObject03());
		
		System.out.println(sample02);
		System.out.println(sample03);
		
	}
	
}
