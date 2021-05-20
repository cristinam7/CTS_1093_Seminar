package ro.ase.csie.g1093.testpractice.prototype;

public class Movie implements PrototypeCapable {

	private String name = null; 
	
	
	//NU E RECOMANDAT SA TRECEM PRIN CTORUL ASTA, IA O GRAMADA DE TIMP SI E COSTLY
	public Movie(String name) {
		super();
		this.name = name;
	}

	public Movie() { }
	
	public String getName() { 
		return this.name;
	}
	
	public void setName(String name) { 
		this.name = name;
	}
	
	@Override
	public Movie clone() throws CloneNotSupportedException {
		System.out.println("Cloning Movie object...");
		Movie movie = new Movie(); 
		movie.name = this.name; 
		return movie;
	}

	@Override
	public String toString() {
		return "Movie";
	}
	
	
	

}
