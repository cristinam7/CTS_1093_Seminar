package ro.ase.csie.g1093.testpractice.builder;

public class User {

	//the class should have a lot of attributes
	//all attributes should be final or at least private
	private final String firstName;
	private final String lastName;
	private final int age; 
	private final String phoneNo; 
	private final String homeAddress; 
	private final String email;
	
	
	//if you don't make a constructor with ALL of them, there will be an error 
//	private User(String firstName, String lastName, int age, String phoneNo, String homeAddress, String email) {
//		super();
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.age = age;
//		this.phoneNo = phoneNo;
//		this.homeAddress = homeAddress;
//		this.email = email;
//	}
	
	private User(UserBuilder builder) { 
		this.firstName = builder.firstName; 
		this.lastName = builder.lastName; 
		this.age = builder.age; 
		this.email = builder.email; 
		this.homeAddress = builder.homeAddress; 
		this.phoneNo = builder.phoneNo;	
	}


	//generate ONLY GETTERS
	public String getFirstName() {
		return firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public int getAge() {
		return age;
	}


	public String getPhoneNo() {
		return phoneNo;
	}


	public String getHomeAddress() {
		return homeAddress;
	}


	public String getEmail() {
		return email;
	}


	@Override
	public String toString() {
		  return "User: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phoneNo+", "+this.homeAddress+ "," + this.email;
	}
	
	//facem o clasa statica in interiorul clasei normale 
	public static class UserBuilder { 
		
		//we copy all the fields
		private final String firstName;
		private final String lastName;
		private int age; 
		private String phoneNo; 
		private String homeAddress; 
		private String email;
		
		//but only first and last name are REQUIRED, 
		//the rest are optional 
		//so we only keep those 2 final and the rest of them are only private
		
		//we generate a ctor with those 2
		public UserBuilder(String firstName, String lastName) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
	
		//now generate userbuilder methods for all fields 
		public UserBuilder age(int age) { 
			this.age = age; 
			return this; 
		}
		
		public UserBuilder email(String email) { 
			this.email = email; 
			return this; 
		}
		
		public UserBuilder phoneNo(String phoneNo) { 
			this.phoneNo = phoneNo; 
			return this; 
		}
		
		public UserBuilder address(String address) { 
			this.homeAddress = address; 
			return this; 
		}
		
		public User build() { 
//			User user = new User(this.firstName, this.lastName, this.age, 
//					this.phoneNo,this.homeAddress, this.email); 
			User user = new User(this);
			return user;
		}
		
		
		//we can also have this method here to perform validations, if required 
		 private void validateUserObject(User user) {
	            //Do some basic validations to check 
	            //if user object does not break any assumption of system
	        }
		
	}
	
	
	
	
}
