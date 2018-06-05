package model;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import view.Frame;
/**
 * 
 * @author Corentin BOURGEY
 *
 */
public class Sound implements Runnable{
	private Clip clip;
	@Override
	/**
	 * Start the sound during the game
	 */
	public void run() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(getClass().getResource("/sound/Sound1.wav").toURI()));
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			while(Frame.debut == -1 || Frame.debut == 1) {
				String a = "";
				System.out.print(a);
			}
			if(Frame.debut == 2 || Frame.debut == 0) {
				clip.stop();
			}
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
