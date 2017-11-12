package DefaultPokemon;

import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class PokeInfo {
	
	PokeList pokeList = new PokeList();
	MoveList moveList = pokeList.moveList;
	TypeList typeList = moveList.typeList;
	Scanner in = new Scanner(System.in);
		
	String cpuName = "Brandon";
	String playerName = "You";				
			
	//Array containing all choosable Pokemon
	Pokemon[] pokeArray = {pokeList.venusaur, pokeList.charizard, pokeList.blastoise, pokeList.alo_raichu, 
			pokeList.meganium, pokeList.typhlosion, pokeList.feraligatr,
			pokeList.sceptile, pokeList.blaziken, pokeList.swampert, pokeList.whiscash,
			pokeList.torterra, pokeList.infernape, pokeList.empoleon, pokeList.garchomp,
			pokeList.serperior, pokeList.emboar, pokeList.samurott, 
			pokeList.chesnaught, pokeList.delphox, pokeList.greninja};
	// ArrayList<Pokemon> pokeArrayList = new ArrayList<Pokemon>(); (unnecessary at this current time).
	
	Pokemon brandonParty[] = {
			pokeList.galvantula, 
			pokeList.infernape, 
			pokeList.klinklang, 
			pokeList.wishiwashi, 
			pokeList.sylveon, 
			pokeList.medicham};
	
	Pokemon playerParty[] = new Pokemon[6];
	
	public void choosePokemon() {
		System.out.println("You are about to challenge the champion from America, Brandon, in a 6v6 Pokemon battle.");
		System.out.println("[Use the ENTER key to move through text]");
		promptEnterKey();
		System.out.println("Please enter the index numbers of the Pokemon you would like to add to your party.");
		promptEnterKey();
		System.out.print("A list will appear below for your reference:"
				+ "\n"
				+ "---------------------------------------------------------"
				+ "\n");
		promptEnterKey();
		// Printing the choosable Pokemon with their moves listed below them
		for(int i = 0; i < pokeArray.length; i++) {
			
			for(int j = 0; j < 5; j++) {
				try {
					System.out.printf("%-22" + "s", "(" + (i + 1) + ") "  + pokeArray[i].getName());
					i++;
				}
				catch (Exception e) {
					i = i + (5-j) ;
					break;
				}
			}
			i = i - 5;
			System.out.println();
			for(int j = 0; j < 4; j++) {
				try {
					System.out.printf("    - %-16s", pokeArray[i].getMoves()[j].getName());
					System.out.printf("    - %-16s", pokeArray[i+1].getMoves()[j].getName());
					System.out.printf("    - %-16s", pokeArray[i+2].getMoves()[j].getName());
					System.out.printf("    - %-16s", pokeArray[i+3].getMoves()[j].getName());
					System.out.printf("    - %-16s", pokeArray[i+4].getMoves()[j].getName());	
					System.out.println();
				}
				catch (Exception e) {
					System.out.println();
				}
			}
			System.out.println();
			i = i + 4;
			pause(300);
		}
		
		int index = 0;
		int enterPoke;
		System.out.print("\n" + "Enter a corresponding integer and press [ENTER]:" + "\n");
		while(index < 6) {
			enterPoke = in.nextInt() - 1;
			if ((enterPoke >= 0) && (enterPoke < pokeArray.length)) {
				playerParty[index] = pokeArray[enterPoke];
				System.out.print(pokeArray[enterPoke].getName()
								+ " has been added to your party in slot "
								+ (index + 1) 
								+ "."
								+ "\n");
				index++;
			}		
			else {
				System.out.print("Not a valid Pokemon." + "\n");
			}
		}	
		System.out.print("\n");
	}
	
	public double damageCalculator(double[] attackerStats, double[] defenderStats, Pokemon attackerPoke, Pokemon defenderPoke, Move move){
		double damage = 0.0;
		if (move.getPurpose().equals("PHYSICAL")) {
			damage = (2 * attackerPoke.getLevel())/(5);
			damage = damage + 2; 
			damage = damage * (move.getPower()) * (attackerStats[1]/defenderStats[2]);
			damage = damage / (50);
			damage = damage + (2);
		}
		else if (move.getPurpose().equals("SPECIAL")) {
			damage = (2 * attackerPoke.getLevel())/(5);
			damage = damage + 2; 
			damage = damage * (move.getPower()) * (attackerStats[3]/defenderStats[4]);
			damage = damage / (50);
			damage = damage + (2);
		}
		else if (move.getPurpose().equals("SPECIAL")) {
			move.specialEffect();
		}
		return damage;
	}
	
	public void printParty(Pokemon[] tempParty) {
		for(int i = 0; i < 6; i++) {
			System.out.print(tempParty[i].getName());
			System.out.print("\n");
		}
		System.out.print("\n");
	}
	
	public void promptEnterKey(){
	    try {
	        System.in.read();
	    } 
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	public void pause(int time) {
		try {
			Thread.sleep(time);
		}
		catch(Exception ex) {
			System.out.print("Pause failed.\n");
		}
	}
}