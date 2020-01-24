package de.schwellach.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCodeGuru {
	
	protected String AWS_KEY_ID = "AKIA3D3NOP2WDC2APVOF";
	protected String AWS_SECRET_KEY = "RNs4elsEZKgRDTFOb7rVwSfugCHsJY+VE6lmrs2Z";
	
	protected ConcurrentHashMap<String, String> dummyHashMap;
	

	@BeforeEach
	void setUp() throws Exception {
		dummyHashMap = new ConcurrentHashMap<>();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		fail("Not yet implemented");
		
	}
	
	
	@Test
	void testArrayAndStringDeclaration() {
	    // Compiles, but sure doesn't do what the student expects.
	    int[] Count = new int[26];
	    Count['A'] = 0; // causes run-time error
	    assertTrue(true);
	}
	
	@Test
	void testPutToDummyHashMap() {
		dummyHashMap.put("dummy", "value");
		assertTrue(true);
	}

	
	@Test
	void testNotThreadSafe() {
		Counter c = new Counter();
		assertEquals(0, c.getCount());
		
	}
}
