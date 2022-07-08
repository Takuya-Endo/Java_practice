package AbstractFactory;

import java.util.List;

public abstract class AbstractFactory {
	
	public abstract String getName();
	public abstract FieldObject01 getFieldObject01();
	public abstract List<FieldObject02> getFieldObject02List();
	public abstract FieldObject03 getFieldObject03();

}
