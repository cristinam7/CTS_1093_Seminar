package miron.cristina.g1093;
import miron.cristina.g1093.builder.Book;
import miron.cristina.g1093.builder.BookCondition;
import miron.cristina.g1093.factory.AbstractBook;
import miron.cristina.g1093.factory.BookFactory;
import miron.cristina.g1093.factory.BookType;
import miron.cristina.g1093.prototype.Category;
import miron.cristina.g1093.singleton.User;

public class TestAssignment {

	public static void main(String[] args) {
		
		//Singleton
		User user1 = new User(); 
		User user2 = new User(); 
		
		user1.connect();
		user2.connect();
		//connection is established only once

		
		//Builder 
		Book book1 = new Book.BookBuilder("Pride and Prejudice", "Drama").build(); 
		System.out.println(book1.getBookDets()); 
		
		Book book2 = new Book.BookBuilder("Outliers", "Personal Development")
				.addAuthor("Malcolm Gladwell")
				.addCondition(BookCondition.NEW)
				.isAvailable()
				.addNoPages(335)
				.addRating(4.7f)
				.addDescription("A book that describes remarkable people and their life accomplishments")
				.build(); 
		
		System.out.println(book2.getBookDets());
		
		//factory 
		AbstractBook absBook = BookFactory.getBook(BookType.DICTIONARY, "Learn Russian with 3 words/day", "Foreign languages"); 
		absBook.getBorrowed();
		absBook = BookFactory.getBook(BookType.MAGAZINE, "Harper's Bazaar", "Fashion"); 
		absBook.getBorrowed();
		
		//prototype 
		Category category1 = new Category("Fiction"); 
		Category category2 = new Category("Parenting"); 
		
		try {
			Category prototypeCat1 = (Category) category1.clone();
			Category prototypeCat2 = (Category) category2.clone();
			
			System.out.println(prototypeCat1.getCategoryName());
			System.out.println(prototypeCat2.getCategoryName());
			
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}

}
