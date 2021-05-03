package miron.cristina.g1093.singleton;

public class User {

	DatabaseConnection dbConnection; 
	
	public User() { 
		dbConnection = DatabaseConnection.getInstance(); 
	}
	
	public void connect() { 
		if(dbConnection != null) { 
			System.out.println("User connected!");
		} else { 
			System.out.println("Something went wrong");
		}
	}
	
}
