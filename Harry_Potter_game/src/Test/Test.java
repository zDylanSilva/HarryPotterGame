package Test;
import java.util.Scanner;
import Characters.*;
import Characters.Character;
import Spells.*;

public class Test {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Character player = null;
		int option;
		boolean gameState=true;
		boolean choosing=true;
		
		System.out.println("Choose your character");
		System.out.println("1.Harry Potter\n"
				+ "2.Ron Weasley\n"
				+ "3.Hermione Granger\n");
		
		while(choosing) {
		option = sc.nextInt();
		
		if(option==1) {
			player= new HarryPotter();
			choosing=false;
		}
			else if (option==2) {
			player= new RonWeasley();
			choosing=false;
		}
			else if (option==3) {
			player= new HermioneGranger();
			choosing=false;
		}
			else {
				System.out.println("Choose again");
			}
		}
		
		player.display();
		
		while(gameState==true) {
			System.out.println("Actions\n"
					+ "1.Cast Spell\n"
					+ "2.Switch Spell\n"
					+ "Any other output will end the program");
			
			option = sc.nextInt();
			
			if(option==1) {
				
				player.castSpell();
			}
				else if (option==2) {
					System.out.println("1.Expectro Patronum\n"
							+ "2.Expelliarmus\n"
							+ "3.Oculus Reparo\n"
							+ "4.Wingardium Leviosa\n"
							+ "5.Don't change");
					
					int spellOption = sc.nextInt();
					
					switch(spellOption) {
					case 1:
						player.switchSpell(new ExpectroPatronum());
						break;
					case 2:
						player.switchSpell(new Expelliarmus());
						break;
					case 3:
						player.switchSpell(new OculusReparo());
						break;
					case 4:
						player.switchSpell(new WingardiumLeviosa());
						break;
					case 5:
						break;
				
						
					}
				}
				else {	
					gameState=false;
				}
			}
		}

	}
