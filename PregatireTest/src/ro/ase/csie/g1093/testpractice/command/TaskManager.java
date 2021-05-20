package ro.ase.csie.g1093.testpractice.command;

import java.util.ArrayList;

public class TaskManager {

	ArrayList<TaskAsyncAbstract> tasks = new ArrayList<>();
	
	public void adaugaTask(TaskAsyncAbstract task) { 
		tasks.add(task);
	}
	
	public void executaTask() {
		if(this.tasks.size() > 0) {
			TaskAsyncAbstract task = tasks.get(0); 
			tasks.remove(0); 
			task.executaTask(1000);
		}		
	}
	
}
