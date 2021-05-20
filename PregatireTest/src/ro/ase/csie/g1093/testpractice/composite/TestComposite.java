package ro.ase.csie.g1093.testpractice.composite;

public class TestComposite {

	public static void main(String[] args) {
		
		//PROBLEMA 
		//Pt a gestiona o structura ierarhica de caractere (de ex o armata sau un grup de jucatori) 
		//Sa se gaseasca o solutie eficienta  care sa permita gruparea jucatorilor
		//un grup poate contine caractere controlate de jucatori sau alte grupuri
		
		//KEY-WORDS
		//grupuri/categorii/structura ierarhica
		//la composite trb sa plecam cu solutia deja implementata
		//orice solutie care duce catre categorii si structuri ierarhice este un composite, ft greu de misinterpreted
		
		//LA COMPOSITE NIVELUL ABSTRACT ESTE OBLIGATORIU!!!
		
		//exemplul cu pizza de la cursurile romana
		
		CaracterJoc superman = new CaracterJoc("Superman"); 
		CaracterJoc batman = new CaracterJoc("Batman"); 

		Group echipa1 = new Group("Echipa Rosie"); 
		echipa1.adauga(superman);
		echipa1.adauga(batman);
		
		Group echipa2 = new Group("Super Echipa"); 
		echipa2.adauga(echipa1);
		echipa2.adauga(new CaracterJoc("CatWoman"));
		
		echipa2.ataca("Joker");
		echipa2.seApara();
		
		//aici trebuie facute validari, daca nu e null si daca e de tip CaracterJoc
		echipa2.get("CatWoman").seVindeca(100);
	}
	
}
