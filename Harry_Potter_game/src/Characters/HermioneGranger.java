package Characters;

import Spells.OculusReparo;

public class HermioneGranger extends Character {

	
	public HermioneGranger() {
		spellBehavior = new OculusReparo();
		
	}

	@Override
	public void display() {
		System.out.println("My name is Hermione Granger best Oculus Reparo caster");
	}
	
}
