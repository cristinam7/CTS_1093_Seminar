package ro.ase.csie.g1093.testpractice.strategy;

public class ModulPuncteBonus {

	InterfataCalculPuncteBonus stategieCurenta = null;

	//optional, putem cere aceasta strategie prin ctor 
	public ModulPuncteBonus(InterfataCalculPuncteBonus stategieCurenta) {
		super();
		this.stategieCurenta = stategieCurenta;
	}	
	
	public void setStategieCurenta(InterfataCalculPuncteBonus stategieCurenta) {
		this.stategieCurenta = stategieCurenta;
	} 
	
	
	public int getPuncteBonusJucator(String nume, int timpJoc) { 
		//callback 
		if(stategieCurenta != null) { 
			return stategieCurenta.getPuncteBonus(); 
		} else { 
			throw new UnsupportedOperationException();
		}
	}
	
	
}
