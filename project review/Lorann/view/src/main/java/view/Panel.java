package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import contract.IMooveIA;
/**
 * 
 * @author Corentin BOURGEY
 *
 */
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

	/**
	 * Start class for move IA
	 * @param mvIA
	 */
	public Panel(IMooveIA mvIA) {
		this.mvIA = mvIA;
	}
	/**
	 * add a decoration for your game like victory or end
	 */
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
	/**
	 * set x value of character
	 * @param xPerso
	 */
	public void setXPerso(int xPerso) {
		this.xPerso = xPerso;
	}
	/**
	 * return x value of character
	 * @return
	 */
	public int getXPerso() {
		return xPerso;
	}
	/**
	 * set y value of character
	 * @param yPerso
	 */
	public void setYPerso(int yPerso) {
		this.yPerso = yPerso;
	}
	/**
	 * return y value of character
	 * @return
	 */
	public int getYPerso() {
		return yPerso;
	}
	/**
	 * set x value of Lorann's picture
	 * @param xPersoImage
	 */
	public void setXpersoImage(int xPersoImage) {
		this.xPersoImage = xPersoImage;
	}
	/**
	 * return x value of Lorann's picture
	 * @return
	 */
	public int getXpersoImage() {
		return xPersoImage;
	}
	/**
	 * set y value of Lorann's picture 
	 * @param yPersoImage
	 */
	public void setYpersoImage(int yPersoImage) {
		this.yPersoImage = yPersoImage;
	}
	/**
	 * return y value of Lorann's picture
	 * @return
	 */
	public int getYpersoImage() {
		return yPersoImage;
	}
	/**
	 * set x value of key's picture
	 * @param xKeyImage
	 */
	public void setXKeyImage(int xKeyImage) {
		this.xKeyImage = xKeyImage;
	}
	/**
	 * return x value of key's picture
	 * @return
	 */
	public int getXKeyImage() {
		return xKeyImage;
	}
	/**
	 * set y value of key's picture
	 * @param yKeyImage
	 */
	public void setYKeyImage(int yKeyImage) {
		this.yKeyImage = yKeyImage;
	}
	/**
	 * return y value of key's picture
	 * @return
	 */
	public int getYKeyImage() {
		return yKeyImage;
	}
	/**
	 * return y value of power
	 * @return
	 */
	public int getyPower() {
		return yPower;
	}
	/**
	 * set y value of power
	 * @param yPower
	 */
	public void setyPower(int yPower) {
		this.yPower = yPower;
	}
	/**
	 * return x value of power
	 * @return
	 */
	public int getxPower() {
		return xPower;
	}
	/**
	 * set x value of power
	 * @param xPower
	 */
	public void setxPower(int xPower) {
		this.xPower = xPower;
	}
	/**
	 * return picture of ghost
	 * @return
	 */
	public BufferedImage getImgGhost() {
		return imgGhost;
	}
	/**
	 * set picture of ghost
	 * @param imgGhost
	 */
	public void setImgGhost(BufferedImage imgGhost) {
		this.imgGhost = imgGhost;
	}
	/**
	 * return picture of square
	 * @return
	 */
	public BufferedImage getImgSquare() {
		return imgSquare;
	}
	/**
	 * set picture of square
	 * @param imgSquare
	 */
	public void setImgSquare(BufferedImage imgSquare) {
		this.imgSquare = imgSquare;
	}
	/**
	 * return x value of door
	 * @return
	 */
	public int getxDoor() {
		return xDoor;
	}
	/**
	 * set x value of door
	 * @param xDoor
	 */
	public void setxDoor(int xDoor) {
		this.xDoor = xDoor;
	}
	/**
	 * return y value of door
	 * @return
	 */
	public int getyDoor() {
		return yDoor;
	}
	/**
	 * set y value of door
	 * @param yDoor
	 */
	public void setyDoor(int yDoor) {
		this.yDoor = yDoor;
	}
}
