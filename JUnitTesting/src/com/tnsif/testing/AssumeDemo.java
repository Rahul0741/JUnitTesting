package com.tnsif.testing;

import org.junit.jupiter.api.Assumptions;

import org.junit.jupiter.api.Test;

public class AssumeDemo {
	@Test
	public void testAssumption() {
		int a=5, s=25;
		Assumptions.assumeFalse(s==a*a);
		System.out.println("will this test pass");
	}
	
	@Test
	public void testAssuption() {
		int a=6,b=5;
		Assumptions.assumingThat(a!=b,()-> System.out.println("this test pass"));
	}
}
