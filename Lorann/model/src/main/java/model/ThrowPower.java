package model;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;

import view.Frame;

public class ThrowPower implements Runnable {

	@Override
	public void run() {
		if(Frame.direction == "RIGHT" && !Frame.power) {
			try {
				BufferedImage power = ImageIO.read(new File(getClass().getResource("/pictures/fireball_1.png").toURI()));
				Frame.panel.setxPower(Frame.panel.getXPerso());
				Frame.panel.setyPower(Frame.panel.getYPerso());
				Frame.power = true;
				while(Frame.panel.getxPower() + 1 == Frame.panel.coordEmptyx[Frame.panel.getxPower() + 1][Frame.panel.getyPower()] && Frame.panel.getxPower() <= 20) {
					
					Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
					Frame.panel.coordEmptyx[Frame.panel.getxPower()][Frame.panel.getyPower()] = Frame.panel.getxPower();
					Frame.panel.coordEmptyy[Frame.panel.getxPower()][Frame.panel.getyPower()] = Frame.panel.getyPower();
					Frame.panel.setxPower(Frame.panel.getxPower() + 1);
					Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = power;
					Thread.sleep(300);
					
				}
				Frame.power = false;
				Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
			} catch (IOException | InterruptedException | URISyntaxException e) {
				e.printStackTrace();
			}
		}
		if(Frame.direction == "LEFT" && !Frame.power) {
			try {
				BufferedImage power = ImageIO.read(new File(getClass().getResource("/pictures/fireball_1.png").toURI()));
				Frame.panel.setxPower(Frame.panel.getXPerso());
				Frame.panel.setyPower(Frame.panel.getYPerso());
				Frame.power = true;
				while(Frame.panel.getxPower() - 1 == Frame.panel.coordEmptyx[Frame.panel.getxPower() - 1][Frame.panel.getyPower()] && Frame.panel.getxPower() >= 2) {
					
					Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
					Frame.panel.coordEmptyx[Frame.panel.getxPower()][Frame.panel.getyPower()] = Frame.panel.getxPower();
					Frame.panel.coordEmptyy[Frame.panel.getxPower()][Frame.panel.getyPower()] = Frame.panel.getyPower();
					Frame.panel.setxPower(Frame.panel.getxPower() - 1);
					Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = power;
					Thread.sleep(300);
					
				}
				Frame.power = false;
				Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
			} catch (IOException | InterruptedException | URISyntaxException e) {
				e.printStackTrace();
			}
		}
		if(Frame.direction == "UP" && !Frame.power) {
			BufferedImage power;
			try {
				power = ImageIO.read(new File(getClass().getResource("/pictures/fireball_1.png").toURI()));
				Frame.panel.setxPower(Frame.panel.getXPerso());
				Frame.panel.setyPower(Frame.panel.getYPerso());
				Frame.power = true;
				while(Frame.panel.getyPower() - 1 == Frame.panel.coordEmptyy[Frame.panel.getxPower()][Frame.panel.getyPower() - 1] && Frame.panel.getyPower() >= 2) {
					
					Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
					Frame.panel.coordEmptyx[Frame.panel.getxPower()][Frame.panel.getyPower()] = Frame.panel.getxPower();
					Frame.panel.coordEmptyy[Frame.panel.getxPower()][Frame.panel.getyPower()] = Frame.panel.getyPower();
					Frame.panel.setyPower(Frame.panel.getyPower() - 1);
					Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = power;
					Thread.sleep(300);
					
				}
				Frame.power = false;
				Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
			} catch (IOException | InterruptedException | URISyntaxException e) {
				e.printStackTrace();
			}
		}
		if(Frame.direction == "DOWN" && !Frame.power) {
			BufferedImage power;
			try {
				power = ImageIO.read(new File(getClass().getResource("/pictures/fireball_1.png").toURI()));
				Frame.panel.setxPower(Frame.panel.getXPerso());
				Frame.panel.setyPower(Frame.panel.getYPerso());
				Frame.power = true;
				while(Frame.panel.getyPower() + 1 == Frame.panel.coordEmptyy[Frame.panel.getxPower()][Frame.panel.getyPower() + 1] && Frame.panel.getyPower() <= 15) {
					
					Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
					Frame.panel.coordEmptyx[Frame.panel.getxPower()][Frame.panel.getyPower()] = Frame.panel.getxPower();
					Frame.panel.coordEmptyy[Frame.panel.getxPower()][Frame.panel.getyPower()] = Frame.panel.getyPower();
					Frame.panel.setyPower(Frame.panel.getyPower() + 1);
					Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = power;
					Thread.sleep(300);
					
				}
				Frame.power = false;
				Frame.panel.img[Frame.panel.getxPower()][Frame.panel.getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
			} catch (IOException | InterruptedException | URISyntaxException e) {
				e.printStackTrace();
			}
		}
	}
}
