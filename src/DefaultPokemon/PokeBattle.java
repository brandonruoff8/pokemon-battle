package DefaultPokemon;
//import java.util.concurrent.TimeUnit;
import java.util.Scanner;
import java.io.File;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PokeBattle {
	
	PokeFrame frame = new PokeFrame();
	
	Scanner in = new Scanner(System.in);
	
	public void commence(TypeList typeList, MoveList moveList, PokeList pokeList, PokeInfo info) {	
			
		frame.setTitle("Brandon's Pokemon Emulator");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setVisible(true);
		
		// Player and opponent's party Pokemon
		Pokemon playerArray[] = info.playerParty;
		Pokemon brandonArray[] = info.brandonParty;
		
		// Indexes to keep track of which Pokemon is in battle at the current moment
		int playerIndex = 0;
		int brandonIndex = 0;
		
		// Battle conditions
		//Weather weather = new Weather();
		//Terrain terrain = new Terrain();
		
		//Arrays containing the players' Party Pokemon
		Pokemon playerPoke = playerArray[playerIndex];
		Pokemon brandonPoke = brandonArray[brandonIndex];
		//Arrays with stats that can be modified without changing the actual Pokemon's official stats
		double[] poke1stats = {
				playerPoke.getHP(),
				playerPoke.getAttack(),
				playerPoke.getDefense(),
				playerPoke.getSpAtk(),
				playerPoke.getSpDef(),
				playerPoke.getSpeed()};
		double[] pokeBstats = {
				brandonPoke.getHP(),
				brandonPoke.getAttack(),
				brandonPoke.getDefense(),
				brandonPoke.getSpAtk(),
				brandonPoke.getSpDef(),
				brandonPoke.getSpeed()};
		//Arrays and booleans to keep track of which party Pokemon have HP remaining to battle
		boolean[] healthyParty1 = {true, true, true, true, true, true};
		boolean[] healthyPartyB = {true, true, true, true, true, true};
		boolean stillCanBattlePlayer = true;
		boolean stillCanBattleBrandon = true;
		Move playerUseMove;
		Move brandonUseMove;
		int turnCounter = 0;
		int indivTurnCounter = 0;

		Music music1 = new Music();
		music1.songName = "music/TellurTownAutumnPokkenTournament.wav";
		music1.run();
		
		frame.setLabelText("Brandon: Welcome challenger. My name is Brandon. Pleased to meet you, " + info.playerName + ". \n");
		pause(2000);
		frame.setLabelText("I have traveled the world with my hardworking Pokemon only to return back to the" + "\n");
		pause(2000);
		frame.setLabelText("United States and claim my place as champion.  We have been through a lot." + "\n");
		pause(2000);
		frame.setLabelText("Do you think you have what it takes to take my place as the champion of the USA?" + "\n");
		pause(2000);
		frame.setLabelText("Let's find out! Go " + brandonPoke.getName() + "!" + "\n\n");
		pause(2000);
		frame.setLabelText("You sent out " + playerPoke.getName() + "." + "\n\n");
		pause(2000);
		
		frame.createButtonPanel();
		
		while (stillCanBattlePlayer && stillCanBattleBrandon) {
			turnCounter++;
			indivTurnCounter++;
			checkSpecialPowers(indivTurnCounter, brandonPoke, pokeBstats);
			printCurrent(info, playerPoke, brandonPoke, poke1stats, pokeBstats, turnCounter);
			
			playerUseMove = playerDecision(playerPoke);
			brandonUseMove = brandonDecision(info, brandonPoke, playerPoke, pokeBstats, poke1stats);
			//Check to see which Pokemon is faster, and then that Pokemon moves first			
			
			if (playerMovesFirst(playerUseMove, brandonUseMove, poke1stats, pokeBstats)) {
				playerMove(info, playerPoke, brandonPoke, poke1stats, pokeBstats, playerUseMove);
				//Check to see if the slower Pokemon still has HP to attack
				if (stillHasHP(pokeBstats)) {
					brandonMove(info, playerPoke, brandonPoke, poke1stats, pokeBstats, brandonUseMove);
					
					healthyParty1[playerIndex] = stillHasHP(poke1stats);
					if (!healthyParty1[playerIndex]) {
						frame.setLabelText(playerArray[playerIndex].getName() + " fainted." + "\n");
						pause(2000);
					}
				}
				else {
					healthyPartyB[brandonIndex] = false;
					frame.setLabelText(brandonArray[brandonIndex].getName() + " fainted." + "\n");
					pause(2000);
				}
			}
			else {
				brandonMove(info, playerPoke, brandonPoke, poke1stats, pokeBstats, brandonUseMove);
				
				if (stillHasHP(poke1stats)) {
					playerMove(info, playerPoke, brandonPoke, poke1stats, pokeBstats, playerUseMove);
					healthyPartyB[brandonIndex] = stillHasHP(pokeBstats);
					if (!healthyPartyB[brandonIndex]) {
						frame.setLabelText(brandonArray[brandonIndex].getName() + " fainted." + "\n");
						pause(2000);
					}
				}
				else {
					healthyParty1[playerIndex] = false;
					frame.setLabelText(playerArray[playerIndex].getName() + " fainted." + "\n");
					pause(2000);
				}
			}
			
			stillCanBattlePlayer = checkPartyCanBattle(healthyParty1);
			stillCanBattleBrandon = checkPartyCanBattle(healthyPartyB);
			if(!(stillCanBattlePlayer && stillCanBattleBrandon)) {
				break;
			}
			if (!healthyParty1[playerIndex]) {
				playerIndex = playerNextPoke(playerArray, healthyParty1);
				playerPoke = playerArray[playerIndex];
				copyPokeStats(poke1stats, playerPoke);
				
				frame.setLabelText("You sent out " + playerPoke.getName() + "." + "\n\n");
				pause(2000);
			}
			if(!healthyPartyB[brandonIndex]) {
				brandonIndex = brandonNextPoke(brandonArray, brandonIndex, music1);
				indivTurnCounter = 0;
				brandonPoke = brandonArray[brandonIndex];
				copyPokeStats(pokeBstats, brandonPoke);
				
				pokeBstats[0] = brandonPoke.getHP();
				pokeBstats[1] = brandonPoke.getAttack();
				pokeBstats[2] = brandonPoke.getDefense();
				pokeBstats[3] = brandonPoke.getSpAtk();
				pokeBstats[4] = brandonPoke.getSpDef();
				pokeBstats[5] = brandonPoke.getSpeed();
			}
		}
		if (stillCanBattlePlayer) {
			frame.setLabelText("\nYou win!");
		} else if (stillCanBattleBrandon) {
			frame.setLabelText("\nYou lose...");
		} else {
			frame.setLabelText("You have drawn with the champion... a rematch must occur.");
		}
		return;
		
	}
	
	public void printCurrent(PokeInfo info, Pokemon playerPoke, Pokemon brandonPoke, 
							 double[] poke1stats, double[] pokeBstats, int turnCounter) {
		frame.setCurrent("Turn: " + turnCounter
				+ "\n                    " + info.cpuName + "\n"
				+ "                    -------------------" + "\n"
				+ "                    Lv." + brandonPoke.getLevel() + " " + brandonPoke.getName() + "\n"
				+ "                    HP: " + (int)pokeBstats[0] + " / " + brandonPoke.getHP() + "\n"
				+ "                    -------------------" + "\n\n"
				+ info.playerName + "\n"
				+ "-------------------" + "\n"
				+ "Lv." + brandonPoke.getLevel() + " " + playerPoke.getName() + "\n"
				+ "HP: " + (int)poke1stats[0] + " / " + playerPoke.getHP() + "\n"
				+ "-------------------" + "\n\n");
		
		frame.setMoveButtons(playerPoke);
		frame.createButtonPanel();
		pause(2000);
	}
	
	public Move playerDecision(Pokemon playerPoke) {
		int playerPromptMove = 0;
		System.out.print("Which move should " + playerPoke.getName() + " use?" + "\n");
		for(int i = 0; i < 4; i++) {
			System.out.print("[" + playerPoke.getMoves()[i].getType().getName() + "] " + playerPoke.getMoves()[i].getName() + " (" + (i+1) + ")" + "\n");
		}
		System.out.print("Enter 1, 2, 3, or 4 to choose your move:" + "\n");
		while ((playerPromptMove < 1) || (playerPromptMove > 4)) {
			playerPromptMove = in.nextInt();
			if ((playerPromptMove < 1) || (playerPromptMove > 4)) {
				System.out.print("Invalid choice.");
			}
		}
		frame.createTextPanel();
		return playerPoke.getMoves()[playerPromptMove - 1];
	}
	
	public Move brandonDecision(PokeInfo info, Pokemon brandonPoke, Pokemon playerPoke, double[] pokeBstats, double[] poke1stats) {
		double[] damageArray = new double[4];
		damageArray[0] = info.damageCalculator(pokeBstats, poke1stats, playerPoke, brandonPoke, brandonPoke.getMoves()[0]);
		// System.out.print(damageArray[0] + " damage initially calculated for " + brandonPoke.getMoves()[0].getName() + "\n");
		damageArray[0] = applyModifiers(damageArray[0], brandonPoke, playerPoke, brandonPoke.getMoves()[0], info);
		
		damageArray[1] = info.damageCalculator(pokeBstats, poke1stats, playerPoke, brandonPoke, brandonPoke.getMoves()[1]);
		// System.out.print(damageArray[1] + " damage initially calculated for " + brandonPoke.getMoves()[1].getName() + "\n");
		damageArray[1] = applyModifiers(damageArray[1], brandonPoke, playerPoke, brandonPoke.getMoves()[1], info);
		
		damageArray[2] = info.damageCalculator(pokeBstats, poke1stats, playerPoke, brandonPoke, brandonPoke.getMoves()[2]);
		// System.out.print(damageArray[2] + " damage initially calculated for " + brandonPoke.getMoves()[2].getName() + "\n");
		damageArray[2] = applyModifiers(damageArray[2], brandonPoke, playerPoke, brandonPoke.getMoves()[2], info);
		
		damageArray[3] = info.damageCalculator(pokeBstats, poke1stats, playerPoke, brandonPoke, brandonPoke.getMoves()[3]);
		// System.out.print(damageArray[3] + " damage initially calculated for " + brandonPoke.getMoves()[3].getName() + "\n");
		damageArray[3] = applyModifiers(damageArray[3], brandonPoke, playerPoke, brandonPoke.getMoves()[3], info);
		int biggestDamageIndex = 0;
		for (int i = 0; i < 4; i++) {
			if (damageArray[i] > damageArray[biggestDamageIndex]) {
				biggestDamageIndex = i;
			}
		}
		return brandonPoke.getMoves()[biggestDamageIndex];
	}
		
	public void playerMove(PokeInfo info, Pokemon playerPoke, Pokemon brandonPoke, double[] poke1stats, double[] pokeBstats, Move playerUseMove) {
		double playerDamage;
		boolean success = checkMoveHits(playerUseMove);
		frame.setLabelText(playerPoke.getName() + " used " + playerUseMove.getName() + "!");
		pause(2000);
		if (success) {
			frame.setLabelText(info.typeList.checkEffective( playerUseMove.getType(), brandonPoke.getType1(), brandonPoke.getType2()));
			pause(2000);
			playerDamage = info.damageCalculator(poke1stats, pokeBstats, playerPoke, brandonPoke, playerUseMove);
			//System.out.print(playerDamage + " damage initially calculated.\n");
			playerDamage = applyModifiers(playerDamage, playerPoke, brandonPoke, playerUseMove, info);
			frame.setLabelText((int)playerDamage + " damage." + "\n\n");
			pokeBstats[0] = pokeBstats[0] - playerDamage;
		}
		else {
			frame.setLabelText("The attack missed!" + "\n\n");
		}
		pause(2000);
	}
	
	public void brandonMove(PokeInfo info, Pokemon playerPoke, Pokemon brandonPoke, double[] poke1stats, double[] pokeBstats, Move brandonUseMove) {
		// System.out.print(brandonPoke.getName() + " is preparing to use " + brandonUseMove.getName() + "." + "\n");
		double brandonDamage = info.damageCalculator(pokeBstats, poke1stats, brandonPoke, playerPoke, brandonUseMove);
		// System.out.print("Damage initially calculated: " + brandonDamage + "\n");
		brandonDamage = applyModifiers(brandonDamage, brandonPoke, playerPoke, brandonUseMove, info);
		boolean success = checkMoveHits(brandonUseMove);
		frame.setLabelText("Brandon: " + brandonPoke.getName() + "! Use " + brandonUseMove.getName() + "!");
		pause(2000);
		if (success) {
			frame.setLabelText(info.typeList.checkEffective(brandonUseMove.getType(), playerPoke.getType1(), playerPoke.getType2()));
			pause(2000);
			frame.setLabelText((int)brandonDamage + " damage.\n");
			poke1stats[0] = poke1stats[0] - brandonDamage;
		}
		else {
			frame.setLabelText("The attack missed!" + "\n\n");
		}
		pause(2000);
	}
	
	// Determines if the player moves first depending on speed stats and move priorities
	public boolean playerMovesFirst(Move playerMove, Move brandonMove, double[] poke1stats, double[] pokeBstats) {
		if (playerMove.priority != brandonMove.priority) {
			return playerMove.priority > brandonMove.priority;
		} else if (poke1stats[5] != pokeBstats[5]) {
			return poke1stats[5] > pokeBstats[5];
		} else {
			// When speed and priority are the same, 50% chance of moving first
			return Math.random() > 0.50;
		}
	}
	
	public double applyModifiers(double damageInUse, Pokemon attacker, Pokemon defender, Move moveInUse, PokeInfo info) {
		double damageConstant = 0.0;
		damageInUse = damageInUse * info.typeList.checkMatchup(moveInUse.getType(), defender.getType1(), defender.getType2());
		// System.out.print(damageInUse + " damage after type matchup check.\n");
		while (damageConstant < 0.85) {
			damageConstant = Math.random();
		}
		damageInUse = damageInUse * damageConstant;
		// System.out.print(damageInUse + " damage after random 0.85 - 1.00 modifier.\n");
		if ((moveInUse.getType() == attacker.getType1()) || (moveInUse.getType() == attacker.getType2())) {
			damageInUse = damageInUse * 1.5;
		}
		// System.out.print(damageInUse + " damage after STAB (\"same-type attack bonus\").\n\n");
		// pause(1000);
		return damageInUse;
	}
	
	public boolean checkMoveHits(Move moveBeingUsed) {
		double chance = Math.random() * 100;
		if (chance < moveBeingUsed.getAccuracy()) {
			return true;
		}
		return false;
	}
	
	public void checkSpecialPowers(int tempIndivTurnCounter, Pokemon tempPokemon, double[] tempPokeStats) {
		if (tempIndivTurnCounter == 2 && tempPokemon.getName().equals("Galvantula")) {
			tempPokemon.getMoves()[0].power = (tempPokemon.getMoves()[0].getPower() * 1.5);
			frame.setLabelText("<< Galvantula's Power Charge! >>\n");
			pause(2000);
			frame.setLabelText("Galvantula's electricity has built up! Its electric-type moves are more powerful.");
			pause(2000);
			frame.setLabelText("Brandon: Oh yes. If you thought this was going to be a normal battle, you were wrong.");
			pause(2000);
			frame.setLabelText("My Pokemon have powerful, extraordinary abilities. Do you still think you can win this battle?");
			pause(2000);
			frame.setLabelText("Show me what you've got!");
			pause(2000);
		}
		if(tempIndivTurnCounter == 2 && tempPokemon.getName().equals("Infernape")) {
			tempPokeStats[1] = tempPokeStats[1] * 1.5;
			frame.setLabelText("<< Infernape's Blazing Blitz! >>");
			pause(2000);
			frame.setLabelText("Infernape is on fire! Its attack rose.");
			pause(2000);
			frame.setLabelText("Brandon: Infernape has a tendency to let its frustrations take control during battle.");
			pause(2000);
			frame.setLabelText("A normal Infernape would have Blaze, an ability that boosts its fire-type moves when it");
			pause(2000);
			frame.setLabelText("is in danger. However, my Infernape has figured out how to use that power as it chooses.");
			pause(2000);
			frame.setLabelText("I hope you're prepared to feel the burn!");
			pause(2000);
		}
		if(tempIndivTurnCounter == 1 && tempPokemon.getName().equals("Klinklang")) {
			tempPokeStats[2] = tempPokeStats[2] * 1.5;
			tempPokeStats[4] = tempPokeStats[4] * 1.5;
			frame.setLabelText("<< Klinklang's Unbreakable Metal! >> \n");
			pause(2000);
			frame.setLabelText("Klinklang's tough metal is glistening. Its defense and special defense rose.");
			pause(2000);
			frame.setLabelText("Klinklang is one of the few Pokemon that are pure steel-type.");
			pause(2000);
			frame.setLabelText("Its gears are extremely sturdy. You won't be able to damage it easily.");
			pause(2000);			
		}
		if(tempPokemon.getName().equals("Wishiwashi")) {
			if(tempPokeStats[0] < (tempPokemon.getHP()/4.0)) {
				tempPokemon.changeName("Wishiwashi [Solo]");
				tempPokeStats[1] = 40;
				tempPokeStats[2] = 40;
				tempPokeStats[3] = 45+32;
				tempPokeStats[4] = 45;
				tempPokeStats[5] = 60;
				frame.setLabelText("Wishiwashi is low on HP... its school fled.");
				pause(2000);
				frame.setLabelText("Wishiwashi changed to Solo Form. Its stats decreased.");
				pause(2000);				
			}
		}
		
		if(tempPokemon.getName().equals("Sylveon"))
		{
			if(tempIndivTurnCounter == 1) {
				frame.setLabelText("Sylveon appears to have a deep connection with its trainer.");
			}
			if(tempIndivTurnCounter >= 2) {
				double recover = (int)(tempPokemon.getHP()/8);
				if ((tempPokeStats[0] + recover) > tempPokemon.getHP()) {
					recover = tempPokemon.getHP() - tempPokeStats[0];
				}				
				tempPokeStats[0] = tempPokeStats[0] + recover;
				frame.setLabelText("<< Sylveon's Eternal Affection! >>\n");
				pause(2000);
				if (tempIndivTurnCounter == 2) {
					frame.setLabelText("Brandon: Sylveon! I'm letting you down, I'm sorry. I can't let you get hurt anymore!");
					pause(2000);
				}
				frame.setLabelText("Sylveon's connection with Brandon allowed it to recover " + (int)recover + " HP.");
				pause(2000);
			}
		}
	}
	
	public boolean stillHasHP(double[] pokeStats) {
		if ((int)pokeStats[0] <= 0) {
			return false;
		}
		return true;
	}
	
	public boolean checkPartyCanBattle (boolean[] tempHealthArray) {
		boolean tempStillCan = false;
		for (int i = 0; i < 6; i++) {
			if (tempHealthArray[i] == true) {
				tempStillCan = true;
			}
		}
		return tempStillCan;
	}
	
	public int playerNextPoke(Pokemon[] playerArray, boolean[] healthyPoke) {
		frame.setCurrent("");
		frame.appendCurrent("\n" + "Your party: " + "\n"
						+ "-----------" + "\n");
		for (int i = 0; i < 6; i++) {
			if (healthyPoke[i] == true) {
				frame.appendCurrent(playerArray[i].getName() + " (" + (i + 1) + ")" + "\n");
			}
			else {
				frame.appendCurrent(playerArray[i].getName() + " - Fainted" + "\n");
			}
		}
		frame.appendCurrent("Choose your next Pokemon by entering the corresponding integer: " + "\n");
		int nextPokeInt = in.nextInt();
		while ((nextPokeInt < 1 || nextPokeInt > 6) || (!healthyPoke[nextPokeInt - 1])) {
			if(!healthyPoke[nextPokeInt - 1]) {
				frame.setLabelText("That Pokemon does not have energy to battle. Choose a different one: " + "\n");
			}
			else {
				frame.setLabelText("Invalid. Enter an integer between 1 and 6: ");	
			}
			nextPokeInt = in.nextInt();
		}
		return (nextPokeInt - 1);
	}
	
	public void copyPokeStats(double[] tempStats, Pokemon tempPoke) {
		tempStats[0]= tempPoke.getHP();
		tempStats[1]= tempPoke.getAttack();
		tempStats[2]= tempPoke.getDefense();
		tempStats[3]= tempPoke.getSpAtk();
		tempStats[4]= tempPoke.getSpDef();
		tempStats[5]= tempPoke.getSpeed();
	}
	
	public int brandonNextPoke(Pokemon[] brandonArray, int brandonIndex, Music music) {
		if (brandonIndex == 0) {
			printFaintGalvantula();
			music.endSong();
			music.songName = "music/MagmaColosseumPokemonBattleRevolution.wav";
			music.run();
		}
		if (brandonIndex == 1) {
			printFaintInfernape();
			music.endSong();
			music.songName = "music/PokemonORASChampionTheme.wav";
			music.run();
		}
		if (brandonIndex == 2) {
			printFaintKlinklang();
			music.endSong();
			music.songName = "music/TotemPokemonSunAndMoon.wav";
			music.run();
		}
		if (brandonIndex == 3) {
			printFaintWishiwashi();
			music.endSong();
			music.songName = "music/PokemonXandYChampionTheme.wav";
			music.run();
		}
		if (brandonIndex == 4) {
			printFaintSylveon();
		}
		if (brandonIndex == 5) {
			printFaintMedicham();
		}
		brandonIndex++;
		return brandonIndex;
	}
	
	public void printFaintGalvantula() {
		frame.setLabelText("Brandon: You did a great job Galvantula. You got us off to a great start. However, challenger,");
		frame.setLabelText("it would appear now that my team and I will have turn it up a notch.");
		pause(2000);
		frame.setLabelText("You won't defeat me easily. I can guarantee you that right now.");
		pause(2000);
		frame.setLabelText("Alright then. Time for my second Pokemon. Go Infernape! Show them how your heart burns for victory!");
		pause(2000);
	}
	
	public void printFaintInfernape() {
		pause(2000);
		frame.setLabelText("Brandon: Go! Klinklang!");
	}
	
	public void printFaintKlinklang() {
		pause(2000);
		frame.setLabelText("Brandon: Go! Wishiwashi!");
	}
	
	public void printFaintWishiwashi() {
		pause(2000);
		frame.setLabelText("Brandon: Go! Sylveon!");
	}
	
	public void printFaintSylveon() {
		pause(2000);
		frame.setLabelText("Brandon: Go! Medicham!");
	}
	
	public void printFaintMedicham() {
		pause(2000);
		frame.setLabelText("Brandon: Oh no... this can't be...");		
	}
	
	public void promptEnterKey() {
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
			frame.setLabelText("Pause failed.\n");
		}
	}
}