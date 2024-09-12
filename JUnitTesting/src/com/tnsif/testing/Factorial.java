package com.tnsif.testing;

public class Factorial {

	public static int getFact(int n) {
		if (n==0) {
			return 1;
		}
		
		else {
			int fact=1;
			for(int i=1;i<=n;i++) {
				fact=fact*i;
			}
			return fact;
			
		}
	}
}
