package miron.cristina.g1093.factory;

public class BookFactory {
	
	public static AbstractBook getBook(BookType type, String title, String field) { 
		
		AbstractBook book = null; 
		
		switch(type) {
		case CLASSIC: 
			book = new ClassicBook(title,  field); 
			break; 
		case MAGAZINE: 
			book = new Magazine(title, 1); 
			break; 
		case ENCYCLOPEDIA:
			book = new Encyclopedia(title, field, true); 
			break; 
		case DICTIONARY: 
			book = new Dictionary(title, field, 500);
			break; 
		default: 	
			throw new UnsupportedOperationException(); 
		
		}
		
		return book ;
	}
	
}
