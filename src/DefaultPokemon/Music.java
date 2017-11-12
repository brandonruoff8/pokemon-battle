package DefaultPokemon;
import java.io.*;
import javax.sound.sampled.*;

public class Music extends Thread {
	
		boolean continuePlaying = true;
		String songName;
		Clip clip;
		
		public void run() {
			playSong();
		}
		
		public void playSong() {
			 try {
				   File file = new File(songName);
				   clip = AudioSystem.getClip();
				   clip.open(AudioSystem.getAudioInputStream(file));
				   clip.start();
			 } 
			 catch (Exception e) {
				  System.err.println(e.getMessage());
			 }	
		}
		
		public void endSong() {
			clip.stop();
		}
}