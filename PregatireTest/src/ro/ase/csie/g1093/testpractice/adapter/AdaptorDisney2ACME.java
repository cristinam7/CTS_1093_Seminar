package ro.ase.csie.g1093.testpractice.adapter;

public class AdaptorDisney2ACME implements InterfataCaractereACME{

	
	//folosim un approach de adapter de obiecte 
	CaracterDisney caracter;

	
	//cel mai bine este ca prin constructor sa se primeasca caracterul ce vrem sa il adaptam
	public AdaptorDisney2ACME(CaracterDisney caracter) {
		super();
		this.caracter = caracter;
	}


	@Override
	public String getNume() {
		return caracter.getDenumire();
	}


	@Override
	public int getPuncteViata() {
		return (int) this.caracter.getNivelEnergie();
	}


	@Override
	public void getDescriere() {
		System.out.println(caracter.getDenumire() + " - " + caracter.getNivelEnergie());
	}


	@Override
	public void esteAtacat(int puncte) {
		caracter.interactioneaza(puncte);
	}


	@Override
	public void seVindeca(int puncte) {
		caracter.resetareEnergie();
	} 
	
	
}
