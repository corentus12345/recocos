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

public class Sound implements Runnable{

	@Override
	public void run() {
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(getClass().getResource("/sound/Sound1.wav").toURI()));
			Clip clip;
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			while(Frame.debut == -1 || Frame.debut == 0) {
			
			}
			if(Frame.debut == 2 || Frame.debut == 0) {
				
				clip.stop();
				
			}
		} catch (LineUnavailableException | IOException | UnsupportedAudioFileException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
