package ro.ase.csie.g1093.testpractice.factory;

public class TestFactory {

	public static void main(String[] args) {
		
		AbstractCar car1 = CarFactory.buildCar(CarType.MINISUV); 
		car1.construct();
		
		car1 = CarFactory.buildCar(CarType.LUXURY); 
		car1.construct();
		
	}

}
