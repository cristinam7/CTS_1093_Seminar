package ro.ase.csie.g1093.testpractice.command;

public abstract class TaskAsyncAbstract {

	String denumireTask;

	public TaskAsyncAbstract(String denumireTask) {
		super();
		this.denumireTask = denumireTask;
	} 
	
	//metoda asta e cea mai importanta
	public abstract void executaTask(int prioritate);
	
}
