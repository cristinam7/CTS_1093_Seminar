package miron.cristina.g1093.factory;

public class Dictionary extends AbstractBook {

	int noWords;
	String language; 
	
	public Dictionary(String title, String field, int words) {
		super(title, field);
		// TODO Auto-generated constructor stub
		this.noWords = words;
	}
	
	public void setLanguage(String language) { 
		this.language = language;
	}

	@Override
	public void getBorrowed() {
		System.out.println("Dictionary " + this.title + " was borrowed");
	}

}
