package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	private int xWallH;
	private int yWallH;

	public Panel() {

	}
	
	public void paintComponent(Graphics g) {
		try {
			if(Frame.debut == 1) {
				BufferedImage wallH = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\horizontal_bone.png"));
				g.drawImage(wallH, getXWallHorizontal(), getYWallHorizontal(), null);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		repaint();
	}
	
	public int getXWallHorizontal() {
		return xWallH;
	}
	
	public void setXWallHorizontal(int xWallH) {
		this.xWallH = xWallH;
	}
	
	public int getYWallHorizontal() {
		return yWallH;
	}
	
	public void setYWallHorizontal(int yWallH) {
		this.yWallH = yWallH;
	}
}
