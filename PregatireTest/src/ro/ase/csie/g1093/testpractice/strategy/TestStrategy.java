package ro.ase.csie.g1093.testpractice.strategy;

import ro.ase.csie.g1093.testpractice.command.ModulBackUpDate;

public class TestStrategy {

	public static void main(String[] args) {
		
		//PROBLEMA
		//In functie de implicarea in joc (timp petrecut, activitate in timpul jocului, etc) jucatorii primesc puncte bonus 
		//aceasta strategie este stabilita de departamentul de marketing si se modifica in functie de alte companii, perioada anului, etc ... 
		//sa se gaseasca o solutie care sa permita 
		//modificarea strategiei de acordare a bonusului la runtime fara a modifica implementarea jocului 
		
		
		//trb sa facem sa se modifice functia fara sa se modifice clasa 
		//nu exista o implementare default 
		//actiune globala => 
		//diferenta fata de decorator => la decorator decoram doar anumite OBIECTE, in timp ce celelalte se bucurau de implementarea default 
		//la strategy e ca si cand modificam functia pentru toate obiectele
		
		
		ModulPuncteBonus modul = new ModulPuncteBonus(new StrategieFiza()); 
		int puncte = modul.getPuncteBonusJucator("Gigel", 1000); 
		System.out.println("Gigel a primit " + puncte);
		
		modul.setStategieCurenta(new StrategieRandom());
		puncte = modul.getPuncteBonusJucator("Gigel", 1000); 
		System.out.println("Gigel a primit " +  puncte);
		
		//merge si cu strategie anonima 
		modul.setStategieCurenta(new InterfataCalculPuncteBonus() {
			
			@Override
			public int getPuncteBonus() {
				return 555;
			}
		});
		
		puncte = modul.getPuncteBonusJucator("Gigel", 1000); 
		System.out.println("Gigel a primit " +  puncte);
		
		
	}
	
}
