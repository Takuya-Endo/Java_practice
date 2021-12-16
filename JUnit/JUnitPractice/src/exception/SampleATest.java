package exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleATest {
	
	private SampleA sampleA = new SampleA();

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMethodATry() {
		
		System.out.print("actual:   ");
		this.sampleA.methodA(1);
		System.out.print("expected: ");
		System.out.println("2");
		
	}
	
	@Test
	void testMethodACatch() {

		try {
			
			this.sampleA.methodA(10);
			
			fail("ArrayIndexOutOfBoundsExceptionを投げてください");
			
		} catch (ArrayIndexOutOfBoundsException expected) {
			
			System.out.println(expected.getMessage());
			
			assertEquals(expected.getMessage(), "Index 10 out of bounds for length 3");
			
		}
		
	}
	
//	@Test
//	void testMethodA() {
//
//		Assertions.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
//			
//			System.out.println("例外テスト成功");
//			
//		});
//		
//	}

}
