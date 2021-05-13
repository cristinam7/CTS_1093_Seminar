package ro.ase.csie.cts.g1093.dp.command;

public class AutoSaveModule implements GameModuleInterface {

	
	//you can also have attributes and other methods 
	int frequency;
		
	public AutoSaveModule(int frequency) {
		super();
		this.frequency = frequency;
	}

	@Override
	public void doTheTask(String details) {
		System.out.println("Autosaving for " + details);
	}

}
