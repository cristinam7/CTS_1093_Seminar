package ro.ase.csie.g1093.testpractice.strategy2;

public class TestStrategy2 {

	public static void main(String[] args) {
		
		
		//INFO 
		//we choose a specific implementation of an algorithm at run-time 
		//we choose out of multiple implementations for same task 		
		//important! --> these implementations are interchangeable 
		//based on the requirement an implementation may be picked without disturbing the application workflow 	
		//Strategy pattern involves removing an algorithm from its host class and putting it in separate class
		//so that in the same programming context there might be different algorithms (strategies), which can be selected in runtime.
		
		//PROBLEM
		//I want to design a social media application which allows me to connect to my friends on all 3 social platforms 
		//i.e. Facebook, Google Plus, Twitter. 
		//Now I want that client should be able to tell the name of friend and desired platform – then my application should connect to him transparently.
		//More importantly, if I want to add more social platforms into application then application code should accommodate it without breaking the design.
		
		//creating social media conxtext
		//folosim ctor default
		SocialMediaContext context = new SocialMediaContext(); 
		
		context.setStrategy(new FacebookStrategy());
		context.connect("Judy");
		
		System.out.println(" ========================== ");
		
		context.setStrategy(new TwitterStrategy());
		context.connect("Alina");
		
		System.out.println(" ========================== ");
		
		context.setStrategy(new GooglePlusStrategy());
		context.connect("Alex");
		
		System.out.println(" ========================== ");
		
		
		//the inline approach
		context.setStrategy(new ISocialMediaStrategy() {
			
			@Override
			public void connectTo(String friendName) {
				System.out.println("Connecting to " + friendName + " through Instagram ");
			}
		});
		context.connect("Jeremy");
		
		
	}

}
