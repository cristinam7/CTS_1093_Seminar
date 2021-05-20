package ro.ase.csie.g1093.testpractice;

import ro.ase.csie.g1093.testpractice.singleton.DatabaseConnection;

public class Main {

	public static void main(String[] args) {
		
		//only one connection will be created
		 DatabaseConnection connection = DatabaseConnection.getInstance();
		 DatabaseConnection connection2 = DatabaseConnection.getInstance();

		 
		 System.out.println("Name of connection 2 is " + connection2.getDbName());
		 
	}
	
}
