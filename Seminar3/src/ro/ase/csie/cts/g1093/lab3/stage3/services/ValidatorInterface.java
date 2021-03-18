package ro.ase.csie.cts.g1093.lab3.stage3.services;

import ro.ase.csie.cts.g1093.lab3.exceptions.InvalidAccountAgeException;
import ro.ase.csie.cts.g1093.lab3.exceptions.InvalidPriceException;

public interface ValidatorInterface {

	public void validatePrice(float price) throws InvalidPriceException;
	
	public void validateAccountAge(int accountAgeInYears) throws InvalidAccountAgeException;
	
}
