package FactoryMethod;

public class Factory02 extends Factory {

	@Override
	protected Super createSubInstance() {
		return new Sub02();
	}

}
