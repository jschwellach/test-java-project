package de.schwellach.examples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCodeGuru {

	@BeforeEach
	void setUp() throws Exception {
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
	}

}
