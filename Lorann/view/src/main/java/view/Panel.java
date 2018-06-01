package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	public BufferedImage img[][] = new BufferedImage[22][17];
	public int coordItemx[][] = new int[22][17];
	public int coordItemy[][] = new int[22][17];
	public int coordKeyx[][] = new int[22][17];
	public int coordKeyy[][] = new int[22][17];
	public int coordDoorx[][] = new int[22][17];
	public int coordDoory[][] = new int[22][17];
	public int coordEmptyx[][] = new int[22][17];
	public int coordEmptyy[][] = new int[22][17];
	private int xPerso;
	private int yPerso;
	private int xPersoImage;
	private int yPersoImage;
	private int xKeyImage;
	private int yKeyImage;
	
	public Panel() {

	}
	
	public void paintComponent(Graphics g) {
		BufferedImage fond;
		BufferedImage square;
		BufferedImage end;
		try {
			
			fond = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\fond.png"));
			square = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\square.png"));
			end = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\GameOver.png"));
			g.drawImage(fond, 0, 0, null);
			
			if(Frame.debut == 1) {
				for(int y1 = 0; y1 < 17; y1++) {
					for(int x1 = 0; x1 < 22; x1++) {
						if((x1 == getXPerso() && y1 == getYPerso()) || (x1 == getXpersoImage() && y1 == getYpersoImage())) {
							
							g.drawImage(img[getXpersoImage()][getYpersoImage()], getXPerso() * 32, getYPerso() * 32, null);
							
						}
						else{
							
							g.drawImage(img[x1][y1], x1 * 32, y1 *32, null);
							
						}
					}
				}
			}
			else if(Frame.debut == 2) {

				g.drawImage(end, 0, 0, null);
				
			}
			if(Frame.key) {
				
				g.drawImage(square, getXKeyImage() * 32, getYKeyImage() * 32, null);
				g.drawImage(img[getXpersoImage()][getYpersoImage()], getXPerso() * 32, getYPerso() * 32, null);
				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void setXPerso(int xPerso) {
		this.xPerso = xPerso;
	}
	
	public int getXPerso() {
		return xPerso;
	}
	
	public void setYPerso(int yPerso) {
		this.yPerso = yPerso;
	}
	
	public int getYPerso() {
		return yPerso;
	}
	
	public void setXpersoImage(int xPersoImage) {
		this.xPersoImage = xPersoImage;
	}
	
	public int getXpersoImage() {
		return xPersoImage;
	}
	
	public void setYpersoImage(int yPersoImage) {
		this.yPersoImage = yPersoImage;
	}
	
	public int getYpersoImage() {
		return yPersoImage;
	}
	
	public void setXKeyImage(int xKeyImage) {
		this.xKeyImage = xKeyImage;
	}
	
	public int getXKeyImage() {
		return xKeyImage;
	}
	
	public void setYKeyImage(int yKeyImage) {
		this.yKeyImage = yKeyImage;
	}
	
	public int getYKeyImage() {
		return yKeyImage;
	}
}
