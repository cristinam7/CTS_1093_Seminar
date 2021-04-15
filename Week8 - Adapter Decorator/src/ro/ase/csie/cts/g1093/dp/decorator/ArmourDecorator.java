package ro.ase.csie.cts.g1093.dp.decorator;

import ro.ase.csie.cts.g1093.dp.adapter.ACMECharacter;

public class ArmourDecorator extends ACMEAbstractDecorator {

	int armourLevel;
	
	public ArmourDecorator(ACMECharacter hero, int armourLevel) {
		super(hero);
		this.armourLevel = armourLevel; 
	}

	@Override
	public void takeAHit(int points) {
		int lostPoints = points - armourLevel;
		if(lostPoints > 0) { 
			this.character.takeAHit(lostPoints);
		}
	}

	
	
	
}
