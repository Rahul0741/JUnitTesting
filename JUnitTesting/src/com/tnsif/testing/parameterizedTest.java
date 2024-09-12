package com.tnsif.testing;

import static org.junit.Assert.assertTrue;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class parameterizedTest {
	@ParameterizedTest
	@ValueSource(strings= {"luffy","sanji","zoro","nami"})
	void endswith(String str) {
		assertTrue(str.endsWith("i"));	
	}
}
