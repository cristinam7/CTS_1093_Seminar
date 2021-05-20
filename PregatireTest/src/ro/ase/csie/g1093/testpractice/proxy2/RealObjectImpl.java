package ro.ase.csie.g1093.testpractice.proxy2;

public class RealObjectImpl implements RealObject {

	@Override
	public void doSomething() {
		System.out.println("Performing work in real object...");
	}

}
