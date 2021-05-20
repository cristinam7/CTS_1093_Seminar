package ro.ase.csie.g1093.testpractice.singleton;

public class DatabaseConnection {

	
	//PRIVATE!! neaparat
	private static DatabaseConnection instance = null;
	
	String dbName; 
	String password;
	
	
	private DatabaseConnection() { 
		
	}
	
	private DatabaseConnection(String dbName, String password) {
		super();
		this.dbName = dbName;
		this.password = password;
		System.out.println("Connection created");
	} 
	
	public static synchronized DatabaseConnection getInstance() { 
		if(instance == null) { 
			instance = new DatabaseConnection("ProductsDB", "adminpass1234");
		}
		
		return instance;
	}

	public String getDbName() {
		return dbName;
	}

	public String getPassword() {
		return password;
	}
	
	
	
	
	
}
