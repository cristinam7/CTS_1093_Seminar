package ro.ase.csie.cts.g1093.dp.facade;

public class UserAPIFacade {

	//the facade method
	public static String getUserProfile(String user, String pass) { 
		//1. Create a game server instance and connect 
		
		GameServer server = new GameServer(); 
		server.connect();
				
		//2. Create a Login 
		Login login = new Login("PLAYER1", "pass");
		login.login();
				
				
		//3. Create and get the profile 
		UserProfile userProfile = login.getUserProfile(); 
		String profile = userProfile.getProfile(); 
				
		return profile; 
	}
	
}
