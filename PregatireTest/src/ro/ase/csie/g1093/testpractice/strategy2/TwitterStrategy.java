package ro.ase.csie.g1093.testpractice.strategy2;

public class TwitterStrategy implements ISocialMediaStrategy {

	@Override
	public void connectTo(String friendName) {
		System.out.println("Connecting with " + friendName + " through Twitter");
	}

}
