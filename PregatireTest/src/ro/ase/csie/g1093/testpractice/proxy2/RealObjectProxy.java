package ro.ase.csie.g1093.testpractice.proxy2;

public class RealObjectProxy extends RealObjectImpl {

	@Override
	public void doSomething() {
		//perform additional logic and security
		//even we can block the operation execution -> like we did earlier 
		System.out.println("Delegating work on real object");
		super.doSomething();
	}

	
	
}
