package ro.ase.csie.g1093.testpractice.proxy;

public class TestProxy {

	public static void main(String[] args) {
		
		//PROBLEMA 
		//Adugarea unui filtru suplimentar pentru login 
		//acum loginul se face cu username + pass si in cazul in care parola este gresita utilizatorul poate incerca de mai multe ori (la nesfarsit)
		//exista atacuri asupra conturilor jucatorilor iar atacatorul ghiceste parola dupa mai multe incercari 
		//se doreste modificarea modulului de login prin limitarea numarului de incercari la maxim 3 
		//modului de login existent trebuie modificat fara a intrerupe jocul
		
		
		//KEY-WORDS 
		//se cere adaugarea ceva in plus la functionalitatea de login, nu sa se modifice (ca in cazul unui decorator)
		//aplicatia ruleaza, trebuie doar sa adaug o componenta noua
		//noua componenta se ataseaza/se pune in fata entitatii deja existente
		
		
		//FARA PROXY 
		ModulLogin modulLogin = new ModulLogin("admin", "1234");
		String[] dictionarParola = new String[] {"12345",  " 12220" , "admin", "1234" };
		
		for(String parola : dictionarParola) { 
			System.out.println("Incerc " + parola);
			if(modulLogin.login("admin", parola)) { 
				System.out.println("Am gasit parola!");
			}
		}
		
		System.out.println("ACELASI LUCRU CU PROXY ----------- ");
		
		//CU PROXY	
		ProxyModulLogin proxy = new ProxyModulLogin(modulLogin); 
		for(String parola : dictionarParola) { 
			System.out.println("Incerc " + parola);
			if(proxy.login("admin", parola)) { 
				System.out.println("Am gasit parola!");
			}
		}
		
		
	}
	
}
