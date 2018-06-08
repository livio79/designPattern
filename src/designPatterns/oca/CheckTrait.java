package designPatterns.oca;



public interface CheckTrait {
	public boolean test(Animal a);
}

class HopChecker implements CheckTrait {
	
	public boolean test(Animal a) { return a.canHop();	}
}
