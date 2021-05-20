package ro.ase.csie.g1093.testpractice.state2;

public class DeliveryContext {

	private PackageState currentState; 
	private String packageId;
	
	
	public DeliveryContext(String packageId) {
		super();
		this.packageId = packageId;
		
		if(this.currentState == null) {
			//starea mereu trb sa porneaza de la o stare initiala, nu ar trb setata prin constructor
			this.currentState = Aknowledged.getInstance(); //daca vin
		}
	}


	public PackageState getCurrentState() {
		return currentState;
	}


	public void setCurrentState(PackageState currentState) {
		this.currentState = currentState;
	}


	public String getPackageId() {
		return packageId;
	}


	public void setPackageId(String packageId) {
		this.packageId = packageId;
	} 
	
	//pt a reaspecta abordarea de la seminar ar trb sa schimbam starea in niste metode din clasa asta, de genul 
	public void initiateOrder() { 
		this.setCurrentState(Aknowledged.getInstance());
		currentState.updateState(this);
	}
	
	
	public void update()  { 	
		currentState.updateState(this);	
	}

}
