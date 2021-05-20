package ro.ase.csie.g1093.testpractice.strategy3;

public class SalaFitnessContext {

	IChallenge challenge; 
		
	public void setExercitiu(IChallenge challenge) {
		this.challenge = challenge;
	}

	public void startExercitiu(int nrRepetari) {
		challenge.startExercitiu(nrRepetari);
	}	
	
}
