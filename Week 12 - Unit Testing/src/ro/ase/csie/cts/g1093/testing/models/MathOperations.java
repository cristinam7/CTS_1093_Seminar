package ro.ase.csie.cts.g1093.testing.models;

import ro.ase.csie.cts.g1093.testing.exceptions.DivizionByZeroException;

public class MathOperations {

	public static int add(int a, int b) { 
		return a + b;
	}
	
	public static double divide(int a, int b) throws DivizionByZeroException { 
		if(b == 0) { 
			throw new DivizionByZeroException(); 
		}
		return a / b;
	}
	
}
