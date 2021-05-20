package ro.ase.csie.g1093.testpractice.adapter;

public class CaracterACME implements InterfataCaractereACME{

	protected String nume; 
	protected int puncteViata;
	
	//generam constructor cu toti parametrii
	public CaracterACME(String nume, int puncteViata) {
		super();
		this.nume = nume;
		this.puncteViata = puncteViata;
	}

	@Override
	public String getNume() {
		return this.nume;
	}

	@Override
	public int getPuncteViata() {
		return this.puncteViata;
	}

	@Override
	public void getDescriere() {
		System.out.println(nume + " - " + puncteViata);
	}

	@Override
	public void esteAtacat(int puncte) {
		System.out.println(nume + " este atacat ");
		puncteViata -= puncte;
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(nume + " se vindeca ");
		puncteViata += puncte;
	}
	
	
}
