package ro.ase.csie.cts.g1093.mironcristina.assignment3.prototype;

public class Server implements ServerInterface {


	 String ipAddress; 
	 int port;
	 int maxConnections;
	
	private Server() { 
		
	}
	
	public Server(String ipAddress, int port, int maxConnections) {
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
	}


	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		Server serverCopy = new Server();
		serverCopy.ipAddress = this.ipAddress; 
		serverCopy.port = this.port; 
		serverCopy.maxConnections = this.maxConnections;
		return serverCopy;
		
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
		return true;
	}
	@Override
	public boolean disconnect() {
		System.out.println("The server stopped working");
		return true;
	}
	
	
}
