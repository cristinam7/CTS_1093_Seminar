package ro.ase.csie.g1093.testpractice.state;

public interface InterfataActiuniCaracter {

	//daca cele mai multe dintre metodele din interfata au nevoie de referinta catre obiectul respectiv, 
	//varianta 1 -> trb sa fie INTR-O CLASA ABSTRACTA, NU INTR O INTERFATA 
	//adaugi referinta catre obiect si il cereti prin constructor
	//CaracterJoc caracter;
	
	//daca doar cateva(putine) fct au nevoie de obiect, 
	//varianta 2 --> o dai ca parametru in metoda care are nevoie de ea 
	//in cazul asta, in metoda ataca()
	
	public void seDeplaseara();
	public void ataca(String inamic, int pct, CaracterJoc caracter);
	
	
}
