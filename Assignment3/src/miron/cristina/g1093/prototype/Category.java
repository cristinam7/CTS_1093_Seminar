package miron.cristina.g1093.prototype;

public class Category implements Cloneable {

	String name; 
	
	public Category(String name) { 
		try {
			Thread.sleep(3000);
			this.name = name; 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private Category() { 
		
	}
	
	public String getCategoryName() { 
		return this.name;
	}

	@Override
	public Object clone() throws CloneNotSupportedException {
		System.out.println("Cloning category...");
		Category copy = new Category(); 
		copy.name = this.name; 		
		return copy; 		
	}
		 
}
