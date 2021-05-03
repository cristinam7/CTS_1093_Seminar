package miron.cristina.g1093.factory;

public class ClassicBook extends AbstractBook{

	public ClassicBook(String title, String field) {
		super(title, field);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getBorrowed() {
		System.out.println("The book " + this.title + " has been borrowed");
	}

}
