package miron.cristina.g1093.singleton;

public class DatabaseConnection {

	public static DatabaseConnection instance = null; 
	
	private DatabaseConnection() { 
		System.out.println("Connection established!");
	}
	
	public static synchronized DatabaseConnection getInstance() { 
		if(instance == null ) { 
			instance = new DatabaseConnection(); 			
		}
		
		return instance; 
	}
}
