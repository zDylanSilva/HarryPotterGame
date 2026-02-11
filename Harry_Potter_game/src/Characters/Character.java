package Characters;

import Spells.SpellBehavior;

public abstract class Character {

	SpellBehavior spellBehavior;
	
	
	public void castSpell() {
		spellBehavior.spellAction();
		System.out.println(spellBehavior + " has been casted");
	}
	
	public void switchSpell(SpellBehavior spell) {
		spellBehavior = spell;
	}
	
	public abstract void display();
}
