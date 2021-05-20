package ro.ase.csie.g1093.testpractice.state2;

public class Aknowledged implements PackageState {

	//singleton
	private static Aknowledged instance = new Aknowledged(); 
	
	private Aknowledged() { }
	
	//cant use this in a static fct
	public static Aknowledged getInstance() { 
		return instance;
	}
	
	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is aknowledged");
		ctx.setCurrentState(Shipped.getInstance());
	}

}
