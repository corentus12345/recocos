package view;

import java.awt.Graphics;
import java.util.Observable;

@SuppressWarnings("deprecation")
public class BuilderGraphics extends Observable{

	public BuilderGraphics() {
		
	}
	
	public void applyGraphics(Graphics g) {
		g.drawString(WallH, xWallH, yWallH);
	}
	
}
