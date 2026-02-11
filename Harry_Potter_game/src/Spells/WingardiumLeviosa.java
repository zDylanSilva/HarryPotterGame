package Spells;

public class WingardiumLeviosa implements SpellBehavior {

	@Override
	public void spellAction() {
		System.out.println("You are currently levitating an object");
		
	}
	
	@Override
	public String toString() {
	    return "Wingardium Leviosa"; 
	}
}

