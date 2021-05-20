package ro.ase.csie.g1093.testpractice.state;

public class StareRanitCritic implements InterfataActiuniCaracter {

	@Override
	public void seDeplaseara() {
		System.out.println("Nu se mai poate misca");
	}

	@Override
	public void ataca(String inamic, int pct, CaracterJoc caracter) {
		System.out.println(caracter.nume + " abia il atinge pe " + inamic);
		System.out.println("Putere lovitura : " + pct /10);
	}

}
