package ro.ase.csie.cts.g1093.dp.memento;

import java.util.Date;

public class HeroMemento {


	String name; 
	int lifePoints; 
	String magic;
	
	Date timestamp;

	public HeroMemento(String name, int lifePoints, String magic) {
		super();
		this.name = name;
		this.lifePoints = lifePoints;
		this.magic = magic;
		this.timestamp = new Date();
	} 
	
	public void attack() { 
		System.out.println("Is attacking");
	}
	
	
	public void heal(int points) { 
		this.lifePoints += points;
		
	}
	
	public void takeAHit(int points) { 
		this.lifePoints -= points;
	}
	
	
	
}
