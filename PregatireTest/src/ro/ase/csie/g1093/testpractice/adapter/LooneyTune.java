package ro.ase.csie.g1093.testpractice.adapter;

public class LooneyTune extends CaracterDisney {

	public LooneyTune(String denumire, float nivelEnergie) {
		super(denumire, nivelEnergie);
	}

	@Override
	public void interactioneaza(float energie) {
		System.out.println("Disney: " + denumire);
	}

	@Override
	public void resetareEnergie() {
		System.out.println("Reset nivel energie");
		this.nivelEnergie = 100;
	}

}
