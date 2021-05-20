package ro.ase.csie.g1093.testpractice.decorator;

public abstract class DecoratorACME implements InterfataCaractereACMEForDecorator {

	//clasa asta este abstracta pentru ca e baza pentru ceilalti decoratori
	
	//folosim referinta la interfata si nu la clasa CaracterACME direct pentru ca poti fi mai multe clase concrete
	//ex CaracterAMCETip1
	//CaracterACMETip2 si tot asa si noi vrem sa putem decora toate tipurile de caractere ACME
	InterfataCaractereACMEForDecorator erou;

	
	//si aici ca si la adapter trb sa primim obiectul de care avem nevoie PRIN CONSTRUCTOR
	public DecoratorACME(InterfataCaractereACMEForDecorator erou) {
		super();
		this.erou = erou;
	}

	//este recomandat ca in aceasta clasa abstracta sa dam deja o implementare pentru TOATE metodele din interfata caracter ACME 
		//pentru ca atuni cand facem alti decoratori (clase concrete) ce extindem din clasa asta 
		//sa nu trebuiasca sa facem in fiecare implementari pentru TOATE metodele, ci doare pentru cele de care avem nevoie 
	//iar metodelor le dam o implementare standard, ca si cum nu am fi schimbat nimic
	
	
	@Override
	public String getNume() {
		return erou.getNume();
	}


	@Override
	public int getPuncteViata() {
		return erou.getPuncteViata();
	}


	@Override
	public void getDescriere() {
		erou.getDescriere();
	}


	@Override
	public void esteAtacat(int puncte) {
		erou.esteAtacat(puncte);
	}


	@Override
	public void seVindeca(int puncte) {
		erou.seVindeca(puncte);
	} 
	
	
	
	
	
}
