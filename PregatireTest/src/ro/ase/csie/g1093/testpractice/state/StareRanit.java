package ro.ase.csie.g1093.testpractice.state;

public class StareRanit implements InterfataActiuniCaracter {

	@Override
	public void seDeplaseara() {
		System.out.println("Se misca cu greutate");
	}

	@Override
	public void ataca(String inamic, int pct, CaracterJoc caracter) {
		System.out.println(caracter.nume + " il loveste cu greu pe " + inamic);
		System.out.println("Putere lovitura : " + pct /2);
	}

}
