package miron.cristina.g1093.factory;

public abstract class AbstractBook {
	
	String title; 
	String field; 
	
	public AbstractBook(String title, String field) { 
		this.title = title; 
		this.field = field;
		
	}
	
	public abstract void getBorrowed();
	
	
}
