package ro.ase.csie.g1093.testpractice.command;

public class TaskAsyncron extends TaskAsyncAbstract {

	//poate avea de asemenea o stare specifica task ului 
	float timeout;
	
	//referinta catre executant 
	InterfataModuleJoc modul;
	
	
	//trb neaparat sa primesc modului in constructor
	public TaskAsyncron(String denumireTask, float timeout, InterfataModuleJoc modul) {
		super(denumireTask);
		this.timeout = timeout;
		this.modul = modul;
	}

	@Override
	public void executaTask(int prioritate) {
		this.modul.executaActiune();
	}

}
