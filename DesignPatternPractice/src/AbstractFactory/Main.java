package AbstractFactory;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		FieldObject01 fieldObject01 = new FieldObject01("FieldObject01");
		FieldObject02 fieldObject02 = new FieldObject02("FieldObject02");
		FieldObject03 fieldObject03 = new FieldObject03("FieldObject03");
		
		List<FieldObject02> fieldObject02List = Arrays.asList(fieldObject02, fieldObject02, fieldObject02);
		
		Sample sample = new Sample()
								.name("Sample")
								.fieldObject01(fieldObject01)
								.fieldObject02List(fieldObject02List)
								.fieldObject03(fieldObject03);
		
		System.out.println(sample);
		
	}
	
}
