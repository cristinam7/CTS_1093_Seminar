package miron.cristina.g1093.factory;

public class Magazine extends AbstractBook{

	int edition; 
	
	public Magazine(String title, int edition) {
		super(title, "Magazine");
		this.edition = edition;
	}

	@Override
	public void getBorrowed() {
		System.out.println(this.title + " edition " + this.edition + " was borrowed");
	}

}
