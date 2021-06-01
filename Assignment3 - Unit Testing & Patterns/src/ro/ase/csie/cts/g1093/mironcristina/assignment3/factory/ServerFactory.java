package ro.ase.csie.cts.g1093.mironcristina.assignment3.factory;

public class ServerFactory {
	
	public static ServerInterface getServer(ServerType serverType,String ip, int port, int maxCon) { 
		
		ServerInterface server = null;
		
		switch(serverType) { 
		case FAX: 
			server = new FaxServer(ip, port, maxCon); 
			break; 
		case STREAMING	: 
			server = new StreamingServer("Twitch",ip, port, maxCon); 
			break; 
		default:
			throw new UnsupportedOperationException();
		}
		
		return server;
	}

}
