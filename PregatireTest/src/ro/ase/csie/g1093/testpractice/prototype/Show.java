package ro.ase.csie.g1093.testpractice.prototype;

public class Show implements PrototypeCapable {

	 	private String name = null;
	 	private String interpreter = null;
	 
	 	//ASTA E CONSTLY, nu vrem sa trecem prin el
	    public Show(String name, String interpreter) {
		super();
		this.name = name;
		this.interpreter = interpreter;
	    }
	    
	    public Show() {}
	    
		public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    	    
	    @Override
		public String toString() {
			System.out.println("Cloning Movie object...");
			return "Show";
		}

		//these methods have to be public and to return the specific type!!!
		@Override
		public Show clone() throws CloneNotSupportedException {
			Show show = new Show(); //deep copy 
			show.name = this.name; 
			show.interpreter = this.interpreter; 
			return show; 
		}
	    
	    
	
}
