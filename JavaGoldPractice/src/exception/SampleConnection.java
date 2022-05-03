package exception;

public class SampleConnection implements AutoCloseable {

	@Override
	public void close() throws SampleException {
		System.out.println("close");
	}

}
