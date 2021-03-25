package ro.ase.csie.cts.g1093.dp.singleton;

public class TestGame {

	public static void main(String[] args) {
	
		UIModule uiModule = new UIModule(); 
		PlayerModule playerModule = new PlayerModule();
		
	//	RESTBackend backend = new RESTBackend("acs.ase.ro/cts", "get some data");
		RESTBackend backend = RESTBackend.getRESTBackend(); 
		
	
		
	}

}
