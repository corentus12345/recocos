package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class BuilderGraphics extends Observable{

	public BuilderGraphics() {
		
	}
	
	public void applyGraphics(Graphics g, BufferedImage img, int xWallH, int yWallH) {
		g.drawString("88888888", 50, 50);
	}
	
}
