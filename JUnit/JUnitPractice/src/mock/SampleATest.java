package mock;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

class SampleATest {
	
	@Mock
	private SampleB sampleB = new SampleB();

	@InjectMocks
	private SampleA sampleA = new SampleA();

	@BeforeEach
	void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	void testMethodA() {
		
		int actual = 0;
		int expected = 0;
		
		actual = this.sampleA.methodA(2);
		expected = 2;
		assertEquals(expected, actual);
		
		actual = this.sampleB.methodB(2);
		expected = 0;
		assertEquals(expected, actual);
		
		when(this.sampleB.methodB(3)).thenReturn(6);
		
		actual = this.sampleB.methodB(3);
		expected = 6;
		assertEquals(expected, actual);
		
		int a = 3;
		when(this.sampleB.methodB(a)).thenReturn(a + a);
		
		actual = this.sampleA.methodA(a);
		expected = 9;
		assertEquals(expected, actual);
		
	}

}
