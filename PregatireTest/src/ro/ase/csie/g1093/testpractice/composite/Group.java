package ro.ase.csie.g1093.testpractice.composite;

import java.util.ArrayList;

public class Group extends NodAbstract {

	ArrayList<NodAbstract> noduri = new ArrayList<>(); 
	
	public Group(String nume) {
		super(nume);
	}

	@Override
	public void ataca(String inamic) {
		for(NodAbstract nod: noduri) { 
			nod.ataca(inamic);
		}
	}

	@Override
	public void seApara() {
		for(NodAbstract nod: noduri) { 
			if(nod instanceof CaracterJoc) { 
				nod.seApara();
			}
		}
	}

	@Override
	public void seVindeca(int puncte) {
		//putem face si asta 
		throw new UnsupportedOperationException();
	}

	
	//TREBUIE NEAPARAT SA FAC OVERRIDE LA ACESTE METODE
	@Override
	public void adauga(NodAbstract nod) {
		this.noduri.add(nod); 
	}

	@Override
	public void sterge(int index) {
		if(index > 0 && index < this.noduri.size())
			this.noduri.remove(index); 
	}

	@Override
	public NodAbstract get(String nume) {
		NodAbstract ref = null; 
		for(NodAbstract nod : this.noduri) { 
			if(nod.nume.equals(nume)) { 
				ref = nod;			
			}
		}		
		return ref;
	}
	

}
