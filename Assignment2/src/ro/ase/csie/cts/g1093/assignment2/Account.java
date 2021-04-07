package ro.ase.csie.cts.g1093.assignment2;

import ro.ase.csie.cts.g1093.assignment2.exceptions.InvalidLoanValueException;
import ro.ase.csie.cts.g1093.assignment2.services.ValidatorInterface;

public class Account {
	
	public static final double BROKER_FEE = .0125;
	public static final int DAYS_PER_YEAR = 365;
	
	private double	loanValue;
	private double	monthlyRate;	
	private int	daysActive;
	private TypeOfAccount accountType;
	
	public ValidatorInterface validatorService = null; 
	
	
	public Account(double loanValue, double monthlyRate, TypeOfAccount accountType, int daysActive, 
						ValidatorInterface validatorService) throws InvalidLoanValueException {
		
		if(validatorService == null) { 
			throw new NullPointerException(); 
		}
		else { 		
			this.validatorService = validatorService;	
			validatorService.validateLoanValue(loanValue);	
			
			this.loanValue = loanValue;
			this.monthlyRate = monthlyRate;
			this.accountType = accountType;
			this.daysActive = daysActive;
		}
		
	}
	
	public double getLoanValue() {
		return this.loanValue;
	}
	
	
	public double getRate() {
		return this.monthlyRate;
	}
	
	public TypeOfAccount getTypeOfAccount() { 
		return this.accountType;
	}
	
	public int getDaysActive() { 
		return this.daysActive; 
	}
	
	
	public double computeRate() {
		return loanValue*monthlyRate;
	}
	
	
	
	public void setLoanValue(double value) throws InvalidLoanValueException {
		validatorService.validateLoanValue(value);
		loanValue = value;	
	}
	
	
	@Override
	public String toString() {
		return "Loan: "+this.loanValue+"; rate: "+this.monthlyRate +"; days active:"+daysActive+"; Type: "+accountType+";";
	}

	
	public static double calculateTotalFee(Account[] accounts)
	{
		double totalFee=0.0;
		for	(int i = 0 ; i < accounts.length ; i++)	{				
				totalFee += BROKER_FEE * accounts[i].getTypeOfAccount().
						computeInterestPrincipal(accounts[i].getLoanValue(), accounts[i].getDaysActive(), accounts[i].getRate());
		}
			return	totalFee;
	}

}
