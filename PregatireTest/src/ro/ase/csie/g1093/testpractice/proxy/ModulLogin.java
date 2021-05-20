package ro.ase.csie.g1093.testpractice.proxy;

public class ModulLogin implements InterfataModulLogin {

	String user; 
	String pass; 
	
	
	public ModulLogin(String user, String pass) {
		super();
		this.user = user;
		this.pass = pass;
	}

	@Override
	public boolean login(String user, String pass) {
		if(user.equals(this.user) && pass.equals(this.pass)) { 
			return true; 
		} else { 
			return false;
		}
	}

}
