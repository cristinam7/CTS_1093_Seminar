package ro.ase.csie.g1093.testpractice.proxy;

public class ProxyModulLogin implements InterfataModulLogin {

	InterfataModulLogin modulLogin;
	int contorIncercari = 0; //de cate ori a incercat parola 
	
	
	//vreau sa primesc modulul de login prin ctor
	public ProxyModulLogin(InterfataModulLogin modulLogin) {
		super();
		this.modulLogin = modulLogin;
	}

	
	@Override
	public boolean login(String user, String pass) {
		
		if(contorIncercari >= 3 ) { 
			System.out.println("Notific utilizatorul - cont blocat!!! Mai mult de 3 incercari nereusite");
			return false;
		}
		boolean esteAutentificat = this.modulLogin.login(user, pass);
		if(!esteAutentificat) { 
			contorIncercari += 1; 
		} else  
			contorIncercari = 0;
		
		return esteAutentificat; 
	}

	
}
