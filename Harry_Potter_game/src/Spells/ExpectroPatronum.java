package Spells;

public class ExpectroPatronum implements SpellBehavior {

	@Override
	public void spellAction() {
		System.out.println("Channeling happinness into a powerful guardian");
	}

	@Override
	public String toString() {
	    return "Expectro Patronum"; 
	}
}
