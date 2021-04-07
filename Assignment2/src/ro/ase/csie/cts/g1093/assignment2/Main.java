package ro.ase.csie.cts.g1093.assignment2;

import ro.ase.csie.cts.g1093.assignment2.exceptions.InvalidLoanValueException;
import ro.ase.csie.cts.g1093.assignment2.services.ValidatorService;

public class Main {

	public static void main(String[] args) {
		
		ValidatorService validatorService = new ValidatorService();

		try { 
		Account account = new Account(1523, 150, TypeOfAccount.PREMIUM, 365, validatorService);
		Account account1 = new Account(3500, 200, TypeOfAccount.STANDARD, 340, validatorService);
		Account account2 = new Account(8888, 150, TypeOfAccount.SUPER_PREMIUM, 360, validatorService);
		Account account3 = new Account(2400, 150, TypeOfAccount.PREMIUM, 355, validatorService);

		
		System.out.println("Loan value for account 1: " + account.getLoanValue());
		System.out.println("Rate value for account 1: " + account.computeRate());
		System.out.println(account.toString());

		System.out.println("----------------");
		
		Account[] accountsArray = new Account[4];
		accountsArray[0] = account;
		accountsArray[1] = account1;
		accountsArray[2] = account2;
		accountsArray[3] = account3;

		System.out.println("Total fee for the accounts array : " + Account.calculateTotalFee(accountsArray));

		}
		catch(InvalidLoanValueException ex)  { 
			ex.printStackTrace();
		}
	}

}
