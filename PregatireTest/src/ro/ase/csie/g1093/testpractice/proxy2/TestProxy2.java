package ro.ase.csie.g1093.testpractice.proxy2;

public class TestProxy2 {

	public static void main(String[] args) {
		//INFO 
		//A proxy object hides the original object and control access to it. 
		//We can use proxy when we may want to use a class that can perform as an interface to something else.
		//A proxy can be used to add an additional security layer around the original object as well.
		
		RealObject proxy = new RealObjectProxy(); 
		proxy.doSomething();
	}

}
