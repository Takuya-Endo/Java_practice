package conditions;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SampleATest {

	private SampleA sampleA = new SampleA();

//	@Test
//	void testMethod() {
//		
//		String actual = sampleA.method("");
//		String expected = "strは空文字です";
//		assertEquals(expected, actual);
//		
//		actual = sampleA.method("aaa");
//		expected = "strは空文字ではありません";
//		assertEquals(expected, actual);
//		
//		actual = sampleA.method(null);
//		expected = "strは空文字です";
//		assertEquals(expected, actual);
//		
//	}
	
	@Test
	void testMethod1() throws Exception {
		
		String actual = sampleA.method("");
		String expected = "strは空文字です";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testMethod2() throws Exception {
		
		String actual = sampleA.method("aaa");
		String expected = "strは空文字ではありません";
		assertEquals(expected, actual);
		
	}
	
	@Test
	void testMethod() {
		
		try {
			
			sampleA.method(null);
			fail("テスト失敗");
			
		} catch (Exception e) {
			
			String actual = e.getMessage();
			String expected = "nullpo";
			assertEquals(expected, actual);
			
		}
		
	}
	
}
