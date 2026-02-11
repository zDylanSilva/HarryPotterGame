package Spells;

public class OculusReparo implements SpellBehavior {

	
	@Override
	public void spellAction() {
		System.out.println("You have fixed harry glasses");
		
	}

	@Override
	public String toString() {
	    return "OculusReparo"; 
	}
}

