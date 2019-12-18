package de.schwellach.examples;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.ConcurrentHashMap;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCodeGuru {
	
	protected String AWS_KEY_ID = "12345678";
	protected String AWS_SECRET_KEY = "12345678";
	
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
