package ro.ase.csie.g1093.testpractice.strategy;

import java.util.Random;

public class StrategieRandom implements InterfataCalculPuncteBonus {

	@Override
	public int getPuncteBonus() {
		Random random = new Random(); 
		return random.nextInt(1000);
	}

}
