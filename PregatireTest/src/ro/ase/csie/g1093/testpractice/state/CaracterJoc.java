package ro.ase.csie.g1093.testpractice.state;

public class CaracterJoc {

	String nume; 
	int pctViata;
	
	InterfataActiuniCaracter stareCurenta = null;
	//E OBLIGATORIU SA AI O STARE INITIALA!!!!! 
	//spre deosebire de strategy unde nu trb neaparat, puteam folosi ctor default si sa setam apoi strategia cu set
	
	public CaracterJoc(String nume, int pctViata) {
		super();
		this.nume = nume;
		this.pctViata = pctViata;
		
		this.stareCurenta = new StareNormala(); //la state pleaca de la o stare normala
	}
		
	//la strategy metoda asta trb sa fie neaparat publica, ca altfel nu ai cum sa schimbi strategia 
	//la state este privata!!!! obiectul isi decide singur starea
	private void setStareCurenta(InterfataActiuniCaracter stareCurenta) {
		this.stareCurenta = stareCurenta;
	}

	public void merge() { 
		this.stareCurenta.seDeplaseara();
	}
	
	public void ataca(String inamic, int pct) { 
		this.stareCurenta.ataca(inamic, pct, this);
	}
	
	public void seVindeca(int pct) { 
		this.pctViata += pct;
		
		//starea se va schimba intr o anumita metoda!!!!!
		if(this.pctViata <= 500) { 
			this.setStareCurenta(new StareRanit());
		} else
			if(this.pctViata <= 1000) { 
				this.setStareCurenta(new StareNormala());
			}
		
	}
	
	public void esteLovid(int puncte) { 
		this.pctViata -= puncte;
		if(this.pctViata < 50) { 
			this.setStareCurenta(new StareRanitCritic());
		} else 
			if(this.pctViata < 500) { 
				this.setStareCurenta(new StareRanit());
			}
	}
	
	
	
}
