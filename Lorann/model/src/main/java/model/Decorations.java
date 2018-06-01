package model;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import view.Frame;

public class Decorations {

	public Decorations(String g, String t, String g2, String t2, String g3, String t3) {
		if(g != null) {
			setImageWallHorizontal(g, t);
		}
		else if(g2 != null) {
			setImageWallVertical(g2, t2);
		}
		else if(g3 != null) {
			setImageWallCorner(g3, t3);
		}
	}
	
	private void setImageWallHorizontal(String g, String t) {
		
		int x = Integer.valueOf(g);	
		int y = Integer.valueOf(t);
		
		try {
			Frame.panel.img[x][y] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\horizontal_bone.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
	
	private void setImageWallVertical(String g2, String t2) {
		
		int x2 = Integer.valueOf(g2);
		int y2 = Integer.valueOf(t2);
		
		try {
			Frame.panel.img[x2][y2] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\vertical_bone.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	private void setImageWallCorner(String g3, String t3) {
		
		int x3 = Integer.valueOf(g3);
		int y3 = Integer.valueOf(t3);
		
		try {
			Frame.panel.img[x3][y3] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\bone.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
