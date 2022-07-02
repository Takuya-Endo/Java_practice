package FactoryMethod;

public abstract class Factory {
	
	private Super subInstance;
	
	protected Factory() {
		this.subInstance = this.createSubInstance();
	}
	
	protected abstract Super createSubInstance();
	
	public void doAll() {
		subInstance.callRoutine();
	}
}
