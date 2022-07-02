package FactoryMethod;

public class Factory01 extends Factory {

	@Override
	protected Super createSubInstance() {
		return new Sub01();
	}

}
