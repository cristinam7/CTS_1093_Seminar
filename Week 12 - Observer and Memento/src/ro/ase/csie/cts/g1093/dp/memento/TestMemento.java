package ro.ase.csie.cts.g1093.dp.memento;

public class TestMemento {

	public static void main(String[] args) {
		
		SuperHero superman = new SuperHero("Superman", 100, "Fly"); 
		
		HeroMemento initialSave = superman.createRestorePoint();  
		
		superman.takeAHit(50); 
		superman.takeAHit(20); 
		
		System.out.println("Lifepoints: " + superman.lifePoints);
		
		superman.restore(initialSave); 
		
		System.out.println("Lifepoints: " + superman.lifePoints);
		
	}

}
