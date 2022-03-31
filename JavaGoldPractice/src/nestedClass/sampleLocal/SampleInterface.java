package nestedClass.sampleLocal;

public interface SampleInterface {
	
	public abstract void abstractMethod();
	default public void anotherMethod() {
		System.out.println("デフォルトメソッド");
	}
}
