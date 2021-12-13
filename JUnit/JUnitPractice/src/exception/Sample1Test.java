package exception;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Sample1Test {

//	@Test
//	void testMain1() {
//		
//		try {
//			
//			String[] strs = {""};
//			Sample1.main(strs);
//			
//			fail("NullPointerExceptionを投げてください");
//			
//		} catch (NullPointerException expected) {
//			
//			assertEquals(expected.getMessage(), "java.lang.NullPointerException");
//			
//		}
//		
//	}
	
	@Test
	void testMain2() throws Exception {
	    Assertions.assertThrows(NullPointerException.class, () -> {
	    	
			String[] strs = {""};
			Sample1.main(strs);
	    	
	    });
	}

}
