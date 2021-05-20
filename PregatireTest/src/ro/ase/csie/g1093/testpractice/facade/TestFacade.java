package ro.ase.csie.g1093.testpractice.facade;

public class TestFacade {

	public static void main(String[] args) {
		
		//Problema: 
		//Pt dezv unui joc online sa se dezv o solutie software case sa permita altor companii sau jucatorilor sa dezvolte solutii externe care sa se
		//conecteze la joc pentru a dezvolta o librarie 
		//API-ul contine multe clase cu multe detalii 
		//nu toate clasele sunt documentate 
		//API- ul trebuie sa ofere o interfata simplificata pt un set de functii de baza 
		
		
		//metode necesare pt a accesa forumul
		Login login = new Login();
		login.login("test", "1234"); 
		ForumJoc forum = new ForumJoc(); 
		Profil profil = new Profil(); 
		ConexiuneBazaDate conexiuneBazaDate = new ConexiuneBazaDate(); 
		conexiuneBazaDate.connect();
		profil.display();
		conexiuneBazaDate.disconnect();
		
		//modificarea setarilor jocului
		Login login2 = new Login();
		login.login("test", "1234"); 
		ConexiuneBazaDate conexiuneBazaDate2 = new ConexiuneBazaDate(); 
		conexiuneBazaDate2.connect();
		CaracterJoc caracter = new CaracterJoc(); 
		conexiuneBazaDate2.disconnect();
		
		
		//prin facade
		FacadeAPIJoc.accessForum("user", "1234");
		FacadeAPIJoc.setariJoc("user", "1234");
		
		//rolul lui facade este de a oferi o cale simplificata de a face lucruri prin incapsularea mai multor operatii/metode 
		//intr-o metoda statica
		//anyway, tu inca poti face acele lucruri si prin metoda clasica(de deasupra) deci nu va schimba cu nimic asta
		//-> accesul la framework este in continuare liber 
		
		
		
	}
	
}
