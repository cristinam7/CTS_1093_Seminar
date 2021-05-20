package ro.ase.csie.g1093.testpractice.state;

public class TestState {

	public static void main(String[] args) {
		
		//PROBLEMA
		//Comportamentul caracterului este influentata de starea lui 
		//daca acesta este ranit miscarile lui sunt afectate
		//daca este afectat de actiunile magice ale celorlalte caractere, actiunile acestuia sunt afectate
		
		//acest pattern poate fi adaugat apoi, nu trb neaparat inceput cu el 	
		CaracterJoc superman = new CaracterJoc("Superman", 1000); 
		superman.merge();
		superman.ataca("Joker", 100);
		
		superman.esteLovid(200);
		superman.merge();
		superman.ataca("Joker", 100);
		
		superman.esteLovid(400);
		superman.merge();
		superman.ataca("Joker", 100);
		
		superman.esteLovid(360);
		superman.merge();
		superman.ataca("Joker", 100);
		
		
		System.out.println("Dupa vindecare ------------------ ");
		superman.seVindeca(300);
		superman.merge();
		superman.ataca("Joker", 100);
	}
	
}
