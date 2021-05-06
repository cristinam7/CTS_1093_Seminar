package ro.ase.csie.g1093.dp.strategy;

public class TestStrategy {
	
	public static void main(String[] args) {
	
	Player player = new Player("John", 10,100); 
	
	player.setBonusCampaign(new NoCampaign()); 
	player.getExperiencePoint(150);
	
	System.out.println("Points  : " + player.experiencePoints);
	
	player.setBonusCampaign(new EasterCampaign());
	player.getExperiencePoint(150);
	
	System.out.println("Points : " + player.experiencePoints);
	
	player.setBonusCampaign(new SummerCampaign());
	player.getExperiencePoint(150);
	
	System.out.println("Points : " + player.experiencePoints);
	}
	

}
