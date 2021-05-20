package ro.ase.csie.g1093.testpractice.composite;

public class CaracterJoc extends NodAbstract 
{

	public CaracterJoc(String nume) {
		super(nume);
	}

	@Override
	public void ataca(String inamic) {
		System.out.println(this.nume + " ataca pe " + inamic);
	}

	@Override
	public void seApara() {
		System.out.println(this.nume + " se apara ");
	}

	@Override
	public void seVindeca(int puncte) {
		System.out.println(this.nume + " se vindeca cu " + puncte + " puncte");
	}

	
	//aceste metode sunt specifice grupurilor de CaracterJoc, deci va trebui ca in implementare sa marcam faptul ca 
	//ele nu au sens prin aruncarea de exceptii
	
	
	//varianta 1
	//	@Override
	//	public void adauga(NodAbstract nod) {
	//		throw new UnsupportedOperationException(); 
	//	}
	//
	//	@Override
	//	public void sterge(int index) {
	//		throw new UnsupportedOperationException(); 
	//	}
	//
	//	@Override
	//	public NodAbstract get(String nume) {
	//		throw new UnsupportedOperationException(); 
	//	}

}
