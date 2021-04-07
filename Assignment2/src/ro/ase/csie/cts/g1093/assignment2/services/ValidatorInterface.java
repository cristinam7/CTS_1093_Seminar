package ro.ase.csie.cts.g1093.assignment2.services;

import ro.ase.csie.cts.g1093.assignment2.Account;
import ro.ase.csie.cts.g1093.assignment2.exceptions.InvalidLoanValueException;

public interface ValidatorInterface {

	public void validateLoanValue(double loanValue) throws InvalidLoanValueException; 
	
}
