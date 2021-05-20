package ro.ase.csie.g1093.testpractice.decorator;

public class DecoratorRanitCritic extends DecoratorACME{

	public DecoratorRanitCritic(InterfataCaractereACMEForDecorator batman) {
		super(batman);
	}

	@Override
	public void esteAtacat(int puncte) {
		super.esteAtacat(puncte);
		if(this.erou.getPuncteViata() < 100) { 
			System.out.println("Atentie! Este ranit critic");
		}
	}
	
	

}
