package ro.ase.csie.cts.g1093.assignment2;

public enum TypeOfAccount {

	STANDARD, 
	BUDGET,
	PREMIUM, 
	SUPER_PREMIUM; 
	
	public double computeInterestPrincipal(double loanValue, int daysActive, double rate) {
		if (this == PREMIUM || this == SUPER_PREMIUM) {
			return loanValue * Math.pow(rate, (daysActive / Account.DAYS_PER_YEAR)) - loanValue;
		}
		else {
			return 0;
		}
	}
	
}
