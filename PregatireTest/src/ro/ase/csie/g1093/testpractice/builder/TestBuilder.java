package ro.ase.csie.g1093.testpractice.builder;

public class TestBuilder {

	public static void main(String[] args) {
		
		//INFO
		//different immutable objects using same object building process.
		//Separate the construction of a complex object from its representation 
		//so that the same construction process can create different representations.”
		
		
		User user1 = new User.UserBuilder("Cristina", "Miron")
				.age(21)
				.address("Str Primaverii")
				.email("cmironn@gmail.com")
				.phoneNo("0763898363")
				.build();
		
		System.out.println(user1.toString());
		
		User user2 = new User.UserBuilder("Joana", "Thomson")
				.age(15)
				.email("jo@gmail.com")
				.build();
		
		System.out.println(user2.toString());
		
		User user3 = new User.UserBuilder("Super", "Man")
				.build();
		
		System.out.println(user3.toString());
		
		
		//Please note that above created user object does not have any setter method,
		//so it’s state can not be changed once it has been built. 
		//This provides the desired immutability
		
	}

}
