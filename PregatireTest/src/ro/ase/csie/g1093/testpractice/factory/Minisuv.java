package ro.ase.csie.g1093.testpractice.factory;

public class Minisuv extends AbstractCar {

	public Minisuv(String producer, String model, int productionYear) {
		super(producer, model, productionYear);
	}

	@Override
	public void construct() {
		System.out.println("A minisuv is being constructed");
	}

}
