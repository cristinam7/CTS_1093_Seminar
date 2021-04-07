package ro.ase.csie.cts.g1093.assignment2.services;

import ro.ase.csie.cts.g1093.assignment2.Account;
import ro.ase.csie.cts.g1093.assignment2.TypeOfAccount;
import ro.ase.csie.cts.g1093.assignment2.exceptions.InvalidLoanValueException;

public class ValidatorService implements ValidatorInterface {

	@Override
	public void validateLoanValue(double loanValue) throws InvalidLoanValueException {
		if(loanValue < 0) { 
			throw new InvalidLoanValueException("Loan value cannot be < than 0");
		}
		
	}


}
