package miron.cristina.g1093.factory;

public class Encyclopedia extends AbstractBook{

	boolean hasPictures;
	
	public Encyclopedia(String title, String field, boolean hasPictures) {
		super(title, field);
		// TODO Auto-generated constructor stub
		this.hasPictures = hasPictures; 
	}

	@Override
	public void getBorrowed() {
		System.out.println("Encyclopedia " + this.title + " has been borrowed");
	}

}
