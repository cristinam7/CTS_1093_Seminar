package ro.ase.csie.g1093.testpractice.factory;

public class CarFactory {

	public static AbstractCar buildCar(CarType model) { 
		AbstractCar car = null; 
		switch(model) { 
		case LUXURY: 
			car = new LuxuryCar("Mercedes", "G Class", 2021); 
			break; 
		case MINISUV: 
			car = new Minisuv("Honda", "SS10", 2016); 
			break;
		default:
			throw new UnsupportedOperationException();
		}
		
		return car;
	}
	
	
}
