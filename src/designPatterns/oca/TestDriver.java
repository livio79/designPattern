package designPatterns.oca;

import java.util.*;

public class TestDriver {
	
	public static void print (List<Animal> lista, CheckTrait check) {
		for(Animal animal : lista) {
			System.out.print(animal.toString() + " ");
			check.test(animal);
		}
	}
	
	public static void main(String[] args) {
		List<Animal> lista = new ArrayList<>();
		lista.add(new Animal("Cane", true, false));
		lista.add(new Animal("Trota", false, true));
		lista.add(new Animal("Rana", true, true));
		
		 
		 print(lista, new HopChecker());
		 System.out.println("       LAMBDA");
		 print(lista, a->a.canHop());
		
	}
}	