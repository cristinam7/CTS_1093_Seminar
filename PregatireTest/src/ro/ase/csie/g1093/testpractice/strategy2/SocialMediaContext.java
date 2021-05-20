package ro.ase.csie.g1093.testpractice.strategy2;

public class SocialMediaContext {

	ISocialMediaStrategy strategy;
	
	//ctor prin care sa primim strategia
//	public SocialMediaContext(ISocialMediaStrategy strategy) {
//		super();
//		this.strategy = strategy;
//	} 
//	

	//asta e folosit si daca nu avem ctor
	public void setStrategy(ISocialMediaStrategy strategy) {
		this.strategy = strategy;
	}

	
	public void connect(String name) { 
		strategy.connectTo(name);
	}

	
	
}
