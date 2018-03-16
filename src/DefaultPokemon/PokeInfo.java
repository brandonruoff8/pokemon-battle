package DefaultPokemon;

//import java.util.Arrays;
import java.util.Scanner;
//import java.util.ArrayList;

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
	
	public void printParty(Pokemon[] tempParty, PokeFrame frame) {
		frame.setCurrent("Your party: "
				+ "\n"
				+ "-----------"
				+ "\n");
		for(int i = 0; i < 6; i++) {
			frame.appendCurrent(tempParty[i].getName());
			frame.appendCurrent("\n");
		}
	}
	
	public void setUserName(PokeInfo info, PokeFrame frame) {
		frame.appendCurrent("\nWhat is your name, challenger? (Type in box and click [ENTER])" + "\n");
		info.promptEnterKey(frame);
		info.playerName = frame.getTextArea();
	}
	
	public void promptEnterKey(PokeFrame frame){
		frame.continue_program = false;
		while(!frame.continue_program) {
			pause(100);
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