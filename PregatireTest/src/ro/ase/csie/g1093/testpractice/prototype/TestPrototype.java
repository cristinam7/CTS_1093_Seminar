package ro.ase.csie.g1093.testpractice.prototype;

public class TestPrototype {

	public static void main(String[] args) {
		
		//INFO
		// Prototype design pattern is used in scenarios where application needs to create a number of instances of a class,
		//which has almost same state or differs very little
		//In this design pattern, an instance of actual object (i.e. prototype) is created on starting,
		//and thereafter whenever a new instance is required, this prototype is cloned to have another instance. 
		//The main advantage of this pattern is to have minimal instance creation process which is much costly than cloning process.
		
		//PROBLEM
		//I am creating an entertainment application that will require instances of Movie, Album and Show classes very frequently.
		//I do not want to create their instances everytime as it is costly.
		//So, I will create their prototype instances, and everytime when i will need a new instance, I will just clone the prototype.
		
		try {
			String moviePrototype = PrototypeFactory.getInstance(ModelType.MOVIE).toString();
			System.out.println(moviePrototype);
			
			String showPrototype = PrototypeFactory.getInstance(ModelType.SHOW).toString();
			System.out.println(showPrototype);
			
			Movie movie = new Movie("SomeMovie"); 
			Movie movieClone = movie.clone();
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		} 
		
		
	}

}
