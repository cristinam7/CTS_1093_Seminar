package ro.ase.csie.cts.g1093.dp.command;

public class AsyncTask implements AsyncTaskInterface {

	//you need a reference to the object that will execute the action
	GameModuleInterface module; 
	String actionDetails;
	
	//new attributes which are specific to your context 
	int priority;
	
	
	
	public AsyncTask(GameModuleInterface module, String actionDetails, int priority) {
		super();
		this.module = module;
		this.actionDetails = actionDetails;
		this.priority = priority;
	}



	@Override
	public void startTask() {
		this.module.doTheTask(actionDetails);
	}

}
