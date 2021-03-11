package ro.ase.csie.cts.g1093.lab3.stage1;

public class Product {
	
	public static final int MAX_ACCOUNT_AGE = 10; 

	public float getFinalPrice(int producType, float initialPrice, int accountAgeInYears) {
		float finalPrice = 0;
		float fidelityDiscount = (accountAgeInYears > 10) ? (float) 15 / 100 : (float) accountAgeInYears / 100;
		if (producType == 1) {
			finalPrice = initialPrice;
		} else if (producType == 2) {
			finalPrice = (initialPrice - (0.1f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.1f * initialPrice));
		} else if (producType == 3) {
			finalPrice = (initialPrice - (0.25f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.25f * initialPrice));
		} else if (producType == 4) {
			finalPrice = (initialPrice - (0.35f * initialPrice))
					- fidelityDiscount * (initialPrice - (0.35f * initialPrice));
		}
		return finalPrice;
	}
}