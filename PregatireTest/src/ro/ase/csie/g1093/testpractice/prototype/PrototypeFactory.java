package ro.ase.csie.g1093.testpractice.prototype;

import java.util.HashMap;

public class PrototypeFactory {

	private static HashMap<ModelType, PrototypeCapable> prototypes = new HashMap<ModelType, PrototypeCapable>();
	
	static { 
		prototypes.put(ModelType.MOVIE, new Movie()); 
		prototypes.put(ModelType.SHOW, new Show()); 
	}
	
	  public static PrototypeCapable getInstance(ModelType type) throws CloneNotSupportedException {
	        return ((PrototypeCapable) prototypes.get(type)).clone();
	    }
	  
	  
	  
}
