package ro.ase.csie.g1093.testpractice.command;

public class TestCommand {

	public static void main(String[] args) {
		
		//PROBLEMA
		//Pt dezvoltarea unui joc online sa se dezvolte o solutie solfware in care 
		//clientul jocului trebuie sa efectueze sarcini in fundal fara a interfera cu derularea jocului ( fara a-l bloca sau incetini) 
		//backup de date client ---> auto-save
		//primeste actualizari pentru forum 
		//actualizari modele 3d ---> silent update-uri
		//trebuie gasita o solutie prin care aceste task-uri sa fe executate fara a afecta executia jocului 
				
		//KEY-WORDS 
		//executia jocului 
		//interfera cu derularea jocului 
		//nu stii exact cand va avea loc executia dar stii sigur ca se va intampla la un moment dat		
		
		TaskManager taskManager = new TaskManager(); 
		System.out.println("Jocul ruleaza ... ");
		System.out.println("Lansare autosave...");
		taskManager.adaugaTask(new TaskAsyncron("Backup", 1000, new ModulBackUpDate()));
		
		System.out.println("Jocul ruleaza ... ");
		System.out.println("Lansare update forum...");
		taskManager.adaugaTask(new TaskAsyncron("Backup", 1000, new ModulUpdateForum()));
		System.out.println("Jocul ruleaza ... ");
		
		taskManager.executaTask();
		System.out.println("Jocul ruleaza ... ");
		taskManager.executaTask();
		System.out.println("Jocul ruleaza ... ");
	}

}
