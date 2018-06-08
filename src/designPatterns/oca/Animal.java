package designPatterns.oca;

//Vedi Lambda libro
public class Animal {
	private String name;
	private boolean canHop;
	private boolean canSwim;
	
	public Animal(String name, boolean canHop, boolean canSwim) {
		this.name = name;
		this.canHop = canHop;
		this.canSwim = canSwim;
	}
	
	public boolean canHop() {
		if(!canHop) System.out.print("non ");
		System.out.println("puo saltellare");
		return canHop;}
	
	public boolean canSwim() {return canSwim;}
	
	public String toString() {return name;}
}
