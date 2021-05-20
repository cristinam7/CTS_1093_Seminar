package ro.ase.csie.g1093.testpractice.decorator;

public class DecoratorScut extends DecoratorACME {

	//acest decorator adauga un scurt
	String scut; 
	
	//avem nevoie de ctor, ptc extindem o clasa abstracta
	//dar pot cere si atribute noi, cele pe care le adauga practic decoratorul
	public DecoratorScut(InterfataCaractereACMEForDecorator superman, String scut) {
		super(superman);
		this.scut = scut;
	}

	@Override
	public void esteAtacat(int puncte) {
		System.out.println("Se apara cu un scut " + this.scut);
		//o sa fie ranit doar cu jumatate din puncte, datorita scutului
		super.esteAtacat(puncte/2);
	} 
	
	//obtine eroul initial 
	//elimina scut
	public InterfataCaractereACMEForDecorator eliminaScut() { 
		return this.erou;
	}
	
	

}
