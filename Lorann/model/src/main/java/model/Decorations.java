package model;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import view.BuilderGraphics;
import view.Frame;

public class Decorations {
	private BufferedImage img;
	private int xWallH;
	private int yWallH;
	private Graphics g;
	
	public Decorations(BufferedImage img, int xWallH, int yWallY) {
		setImageWallH(img);
		setxWallH(xWallH);
		setyWallH(yWallH);
	}
	
	public void setImageWallH(BufferedImage img) {
		Frame.panel(g, getImageWallH(), getxWallH(), getyWallH());
	}
	
	public BufferedImage getImageWallH() {
		return img;
	}
	
	public void setxWallH(int xWallH) {
		this.xWallH = xWallH;
	}
	
	public int getxWallH() {
		return xWallH;
	}
	
	public void setyWallH(int yWallH) {
		this.yWallH = yWallH;
	}
	
	public int getyWallH() {
		return yWallH;
	}
}
