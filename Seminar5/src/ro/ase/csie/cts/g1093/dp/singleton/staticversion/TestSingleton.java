package ro.ase.csie.cts.g1093.dp.singleton.staticversion;

public class TestSingleton {

	public static void main(String[] args) {
		
		RESTBackend backend = RESTBackend.theBackend; 
		
		
		//this possibilty must be removed, otherwise it is not a singleton
		//RESTBackend backend2 = new RESTBackend();
		

	}

}
