package ro.ase.csie.cts.g1093.mironcristina.assignment3.singleton;

public class Server implements ServerInterface {
	
	private static Server instance = null;
	
	private String ipAddress; 
	private int port;
	private int maxConnections;
	
	private boolean isRunning = false;
	
	private Server() {
		
	}
	
	private Server(String ipAddress, int port, int maxConnections) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
	}
	
	public static synchronized Server getInstance() { 
		
		//lazy instantiation
		if(instance == null) { 
			instance = new Server("192.158. 1.38", 5000, 5);
		}
		
		return instance;
	}
	
	public boolean checkConnection() { 
		return this.isRunning;
	}

	
	@Override
	public String getIpAddress() {
		return this.ipAddress;
	}
	@Override
	public int getPort() {
		return this.port; 
	}
	@Override
	public int getMaxConnections() {
		return this.maxConnections;
	}
	@Override
	public boolean connect() {
		System.out.println("The server is running");
		this.isRunning = true; 
		return true;
	}
	@Override
	public boolean disconnect() {
		System.out.println("The server stopped working");
		this.isRunning = false; 
		return true;
	}
	

}
