package miron.cristina.g1093.builder;

public class Book {
	
	private String title;
	private String author; 
	private String category; 
	private String description; 
	private float rating; 
	private int noPages; 
	private BookCondition condition; 	
	private boolean isAvailable; 
		
	private Book() { 
		
	}
	
	public String getBookDets() { 
		return "Title - " + this.title +
				"\n 	Author - " + this.author + 
				"\n 	Description - " + this.description + 
				"\n 	Category - " + this.category + 
				"\n 	Rating - " + this.rating +
				"\n	Condition - " + this.condition +
				"\n 	Is Available ? " + this.isAvailable; 
	}
	
	
	
	public static class BookBuilder { 
		
		Book book; 
		
		public BookBuilder(String title, String category) { 
			this.book = new Book(); 
			this.book.title = title; 
			this.book.category = category; 
		}
		
		public BookBuilder addAuthor(String author) { 
			this.book.author = author; 
			return this; 
		}
		
		public BookBuilder addDescription(String description) { 
			this.book.description = description; 
			return this; 
		}
		
		public BookBuilder addNoPages(int noPages) { 
			this.book.noPages = noPages; 
			return this; 
			
		}
		
		public BookBuilder addRating(float rating) { 
			this.book.rating = rating; 
			return this; 
		}
		
		public BookBuilder addCondition(BookCondition condition) { 
			this.book.condition = condition; 
			return this; 
			
		}
		
		public BookBuilder isAvailable() { 
			this.book.isAvailable = true; 
			return this; 
		}
		
		public Book build() { 
			return this.book; 
		}
	}


}


