package Characters;

import Spells.Expelliarmus;

public class RonWeasley extends Character {

	
	public RonWeasley() {
		spellBehavior = new Expelliarmus();
		 
	}

	@Override
	public void display() {
		System.out.println("I'm Ron Weasley expert at the Expelliarmus spell");
	}
	
}
