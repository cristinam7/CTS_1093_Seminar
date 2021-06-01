package ro.ase.csie.cts.g1093.mironcristina.assignment3.factory;

public class StreamingServer implements  ServerInterface{

	private String streamingPlatform; 
	private String ipAddress; 
	private int port;
	private int maxConnections;	
	
	public StreamingServer(String streamingPlatform, String ipAddress, int port, int maxConnections) {
		super();
		this.streamingPlatform = streamingPlatform;
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
		System.out.println("The server is running on platform " + this.streamingPlatform);
		return true;
	}
	@Override
	public boolean disconnect() {
		System.out.println("The server stopped");
		return true;
	}

}
