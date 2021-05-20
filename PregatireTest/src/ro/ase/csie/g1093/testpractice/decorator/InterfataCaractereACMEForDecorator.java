package ro.ase.csie.g1093.testpractice.decorator;

public interface InterfataCaractereACMEForDecorator {

	//interfata caracterelor prin care noi am definit jocul 
	public String getNume(); 
	public int getPuncteViata(); 
	
	public void getDescriere(); 
	public void esteAtacat(int puncte); 
	public void seVindeca(int puncte);
	
}
