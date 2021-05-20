package ro.ase.csie.g1093.testpractice.decorator;

import java.util.ArrayList;

import ro.ase.csie.g1093.testpractice.decorator.CaracterACME;
import ro.ase.csie.g1093.testpractice.decorator.InterfataCaractereACMEForDecorator;

public class TestDecorator {

	public static void main(String[] args) {
		
		
		//modificarea in timpul jocului a caracteristicilor unor super-eroi 
		//in timpul jocului super-eroii pot fi dotati cu echipamente noi 
		//comportamentul super-eroului se poate modifica dinamic in functie de interactiunea cu celelalte caractere din joc
		
		
		//KEY-WORDS: 
				//modificarea la run-time/ modificare in timpul executiei a unor obiecte EXISTENTE
				//modificarea se face la nivel de structura -> adaugam atribute noi
				//daca doresti ca doar pt o anumita instanta de obiect o functie sa se comporte diferit 
				//(Ex -> daca clasa student are o functie sustine examen, pt toate obiectele sa se comporte intr un fel si doar pt o exceptie student sa fi diferit (de ex daca da online))
		
		InterfataCaractereACMEForDecorator superman = new CaracterACME("Superman", 1000);
		InterfataCaractereACMEForDecorator batman = new CaracterACME("Batman", 1000);
		
		superman.getDescriere();
		superman.esteAtacat(200);
		superman.getDescriere();
		
		DecoratorScut supermanDecorat = new DecoratorScut(superman, "scut de fier");
		System.out.println(" ------------- Dupa decorare superman");
		supermanDecorat.esteAtacat(200);
		supermanDecorat.getDescriere();
		
		DecoratorRanitCritic batmanDecorat = new DecoratorRanitCritic(batman); 
		System.out.println(" ------------- Dupa decorare batman");
		batmanDecorat.esteAtacat(950);
		batmanDecorat.getDescriere();
		
		//cum combin doi decoratori
		//decoratorii pot fi aplicati in cascada
		//vreau ca superman sa aiba si scut sa fie si ranit critic
		
		DecoratorRanitCritic supermanCuScutSiRanit = new DecoratorRanitCritic(supermanDecorat);
		System.out.println(" ------------- Dupa decorare superman si cu scut si ranit critic");
		supermanCuScutSiRanit.esteAtacat(1300);
		supermanCuScutSiRanit.getDescriere();
		
		//decorator poate fi simplu combinat cu adapter pattern
		//ArrayList<InterfataCaractereACME> eroi = new ArrayList<>();
		//eroi.add(new CaracterACME("Superman", 1000));
		//eroi.add(new CaracterACME("Batman", 800));
		
		//putem adauga la colectie si caractere(obiecte) decorate 
		//eroi.add((InterfataCaractereACME) supermanCuScutSiRanit); 
		//eroi.add((InterfataCaractereACME) batmanDecorat);
	}
}
