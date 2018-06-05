package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import contract.IMooveIA;

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
	public Integer coordGhostx[][] = new Integer[22][17];
	public Integer coordGhosty[][] = new Integer[22][17];
	public Integer coordWallHx[][] = new Integer[22][17];
	public Integer coordWallHy[][] = new Integer[22][17];
	private int xPerso;
	private int yPerso;
	private int xPersoImage;
	private int yPersoImage;
	private int xKeyImage;
	private int yKeyImage;
	private IMooveIA mvIA;
	private int xPower;
	private int yPower;
	private BufferedImage imgGhost;
	private BufferedImage imgSquare;
	private int xDoor;
	private int yDoor;

	public Panel(IMooveIA mvIA) {
		this.mvIA = mvIA;
	}
	
	public void paintComponent(Graphics g) {
		BufferedImage fond;
		BufferedImage square;
		BufferedImage end;
		BufferedImage victory;
		BufferedImage openDoor;
		try {
			
			fond = ImageIO.read(new File(getClass().getResource("/pictures/fond.png").toURI()));
			square = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
			end = ImageIO.read(new File(getClass().getResource("/pictures/GameOver.png").toURI()));
			victory = ImageIO.read(new File(getClass().getResource("/pictures/victoire.jpg").toURI()));
			openDoor = ImageIO.read(new File(getClass().getResource("/pictures/gate_open.png").toURI()));
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
				
				mvIA.mooveThread();
				
			}
			else if(Frame.debut == 2) {

				g.drawImage(end, 0, 0, null);
				
			}
			else if(Frame.debut == 0) {
				
				g.drawImage(victory, 0, 0, null);
				
			}
			if(Frame.key && Frame.debut != 0) {
				
				g.drawImage(square, getXKeyImage() * 32, getYKeyImage() * 32, null);
				g.drawImage(img[getXpersoImage()][getYpersoImage()], getXPerso() * 32, getYPerso() * 32, null);
				img[getxDoor()][getyDoor()] = openDoor;
				g.drawImage(img[getxDoor()][getyDoor()], getxDoor() * 32, getyDoor() * 32, null);
				
			}
			if(Frame.power && Frame.debut == 1) {
									
				if(coordGhostx[getxPower()][getyPower()] != null && getxPower() == coordGhostx[getxPower()][getyPower()] && getyPower() == coordGhosty[getxPower()][getyPower()]) {
					
					img[getxPower()][getyPower()] = ImageIO.read(new File(getClass().getResource("/pictures/fireball_1.png").toURI()));;
					Frame.panel.coordGhostx[getxPower()][getyPower()] = null;
					Frame.panel.coordGhosty[getxPower()][getyPower()] = null;
					
				}
				
				g.drawImage(img[getxPower()][getyPower()], getxPower() * 32, getyPower() * 32, null);
				
			}

			for(int y1 = 0; y1 < 17; y1++) {
				
				for(int x1 = 0; x1 < 22; x1++) {
					
					if(Frame.panel.coordGhosty[x1][y1] != null && (Frame.panel.coordGhosty[x1][y1] == Frame.panel.getYPerso() && Frame.panel.coordGhostx[x1][y1] == Frame.panel.getXPerso())) {
						
						Frame.debut = 2;
						
					}
				}	
			}
		
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
		
		repaint();
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
	
	public int getyPower() {
		return yPower;
	}

	public void setyPower(int yPower) {
		this.yPower = yPower;
	}
	
	public int getxPower() {
		return xPower;
	}

	public void setxPower(int xPower) {
		this.xPower = xPower;
	}
	
	public BufferedImage getImgGhost() {
		return imgGhost;
	}

	public void setImgGhost(BufferedImage imgGhost) {
		this.imgGhost = imgGhost;
	}
	
	public BufferedImage getImgSquare() {
		return imgSquare;
	}

	public void setImgSquare(BufferedImage imgSquare) {
		this.imgSquare = imgSquare;
	}
	
	public int getxDoor() {
		return xDoor;
	}

	public void setxDoor(int xDoor) {
		this.xDoor = xDoor;
	}

	public int getyDoor() {
		return yDoor;
	}

	public void setyDoor(int yDoor) {
		this.yDoor = yDoor;
	}
}
