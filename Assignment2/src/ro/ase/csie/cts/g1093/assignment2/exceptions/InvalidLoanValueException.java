package ro.ase.csie.cts.g1093.assignment2.exceptions;

public class InvalidLoanValueException extends Exception {
	
	public String message;

	public InvalidLoanValueException(String errorMessage) { 
		this.message = errorMessage;
	}
	
}
