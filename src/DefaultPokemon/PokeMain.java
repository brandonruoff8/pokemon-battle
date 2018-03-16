package DefaultPokemon;
import java.util.Scanner;

public class PokeMain {
	
	public static void main(String[] args) {		
	
		Scanner in = new Scanner(System.in);
		
		Music music = new Music();
		music.songName = "music/KalosWelcomeTheme.wav";
		music.run();
		
		TypeList typeList = new TypeList();
		MoveList moveList = new MoveList();
		PokeList pokeList = new PokeList();
		PokeInfo info = new PokeInfo();
		PokeBattle battle = new PokeBattle();
		battle.choosePokemon(info);
		
//		System.out.print("Brandon's party: "
//						+ "\n"
//						+ "----------------"
//						+ "\n");
//		info.printParty(info.brandonParty);
		
		music.endSong();
		
		battle.commence(typeList, moveList, pokeList, info);	
		
		in.close();
	}
}