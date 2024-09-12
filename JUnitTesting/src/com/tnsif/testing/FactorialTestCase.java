package com.tnsif.testing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

public class FactorialTestCase {
		@Test
		@DisplayName("check factorial equals")
		public void factTest() {
			int exp = 720;
			int che = Factorial.getFact(6);
			assertEquals(exp,che);
		}
		
		@Test
		@DisplayName("check factorial notequals")
		public void factTest2() {
			int exp = 720;
			int che = Factorial.getFact(5);
			assertNotEquals(exp,che);
		}
		
		@Test
		@DisplayName("Positive test")
		public void facttrue() {
			int check = Factorial.getFact(3);
			assertTrue(check>0);
		}
}
