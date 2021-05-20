package ro.ase.csie.g1093.testpractice.factory;

public class LuxuryCar extends AbstractCar {

	public LuxuryCar(String producer, String model, int productionYear) {
		super(producer, model, productionYear);
	}

	@Override
	public void construct() {
		System.out.println("Luxurious car is being constructed");
	}

}
