package ro.ase.csie.g1093.testpractice.strategy3;

public class TestStrategy3 {

	public static void main(String[] args) {
		
		//PROBLEMA
		//subiectul cu sala fitness
		
		SalaFitnessContext context = new SalaFitnessContext(); 
		context.setExercitiu(new JumpingJacks());
		context.startExercitiu(200);
		
		System.out.println(" ---------------- ");
		context.setExercitiu(new Squats());
		context.startExercitiu(150);
		
		context.setExercitiu(new IChallenge() {
			
			@Override
			public void startExercitiu(int nrRepetari) {
				System.out.println("Executand " + nrRepetari + " abdomene") ;
			}
		});	
		context.startExercitiu(222);
		
	}

}
