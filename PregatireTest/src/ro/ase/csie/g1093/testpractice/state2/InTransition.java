package ro.ase.csie.g1093.testpractice.state2;

public class InTransition implements PackageState {

	//singleton
	private static InTransition instance = new InTransition(); 
	
	private InTransition() { } 
	
	public static InTransition getInstance() { 
		return instance;
	}
	
	@Override
	public void updateState(DeliveryContext ctx) {
		System.out.println("Package is in trasition -> will be delivered ASAP");
	}

}
