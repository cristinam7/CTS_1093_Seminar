package ro.ase.csie.g1093.testpractice.strategy2;

public class GooglePlusStrategy implements ISocialMediaStrategy {

	@Override
	public void connectTo(String friendName) {
		System.out.println("Connecting with " + friendName + " through Google Plus");
	}

}
