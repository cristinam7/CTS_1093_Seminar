package ro.ase.csie.cts.g1093.mironcristina.assignment3.factory;

public class FaxServer implements ServerInterface {

	private String ipAddress; 
	private int port;
	private int maxConnections;
	

	public FaxServer(String ipAddress, int port, int maxConnections) {
		super();
		this.ipAddress = ipAddress;
		this.port = port;
		this.maxConnections = maxConnections;
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
