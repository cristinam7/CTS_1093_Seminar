package ro.ase.csie.g1093.testpractice.factory;

public abstract class AbstractCar {

	String producer; 
	String model; 
	int productionYear;

	public AbstractCar(String producer, String model, int productionYear) {
		super();
		this.producer = producer;
		this.model = model;
		this.productionYear = productionYear;
	}

	public abstract void construct();
	

}
