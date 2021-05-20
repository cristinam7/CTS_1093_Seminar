package ro.ase.csie.g1093.testpractice.state2;

public class Shipped implements PackageState {

	//singleton
	private static Shipped instance = new Shipped(); 
	
	private Shipped() { } 
	
	public static Shipped getInstance() { 
		return instance;
	}
	
	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is shipped!");
		ctx.setCurrentState(InTransition.getInstance());
	}

}
