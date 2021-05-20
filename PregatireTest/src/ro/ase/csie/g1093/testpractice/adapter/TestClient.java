package ro.ase.csie.g1093.testpractice.adapter;

import java.util.ArrayList;

public abstract class TestClient {

	public static void main(String[] args) {
		
		
		ArrayList<InterfataCaractereACME> eroi = new ArrayList<>();
		eroi.add(new CaracterACME("Superman", 1000));
		eroi.add(new CaracterACME("Batman", 800));
		
		for(InterfataCaractereACME erou : eroi) { 
			erou.getDescriere();
			erou.esteAtacat(50);
		}
		
		//gestionare independenta -> prin alta colectie de tip disney, ca si cea acme 
		//problema aici este ca complexitatea solutiei creste 
		CaracterDisney tweety = new LooneyTune("Tweety", 500);
		ArrayList<CaracterDisney> caractereDisney = new ArrayList<>(); 
		caractereDisney.add(tweety);
		
		
		//implementare cu Adapter
		//eroi.add(tweety);  //aici vrem sa ajungem
		
		AdaptorDisney2ACME adaptorTweety = new AdaptorDisney2ACME(tweety);
		eroi.add(adaptorTweety);
		//acum pot gestiona si caractere acme si disney prin aceiasi colectie
		
		System.out.println("-------------------");
		
		for(InterfataCaractereACME erou : eroi) { 
			erou.getDescriere();
			erou.esteAtacat(50);
		}
	}

}
