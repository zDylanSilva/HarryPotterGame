package Spells;

public class Expelliarmus implements SpellBehavior {

	@Override
	public void spellAction() {
		System.out.println("The victim has thrown the object in their hands");
	}
	@Override
	public String toString() {
	    return "Expelliarmus"; 
	}

}
