package ro.ase.csie.g1093.testpractice.state;

public class StareNormala implements InterfataActiuniCaracter {

	@Override
	public void seDeplaseara() {
		System.out.println(" Caracterul alearga ");
	}

	@Override
	public void ataca(String inamic, int pct, CaracterJoc caracter) {
		System.out.println(caracter.nume + " ataca pe " + inamic );
		System.out.println("Lovitura are " + pct + " puncte");
	}

}
