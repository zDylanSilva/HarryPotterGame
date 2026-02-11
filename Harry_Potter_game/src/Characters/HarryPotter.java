package Characters;

import Spells.WingardiumLeviosa;

public class HarryPotter extends Character {

	
	public HarryPotter() {
		spellBehavior= new WingardiumLeviosa();
	}

	@Override
	public void display() {
		System.out.println("My name is Harry Potter and im highly skilled in Wingardium Leviosa");
	}
}
