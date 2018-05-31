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
	
	public Panel() {

	}
	
	public void paintComponent(Graphics g) {
		if(Frame.debut == 1) {
			for(int y1 = 0; y1 < 17; y1++) {
				for(int x1 = 0; x1 < 22; x1++) {
					g.drawImage(img[x1][y1], x1 * 32, y1 *32, null);
				}
			}
			
		}
		else {
			BufferedImage fond;
			try {
				fond = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\fond.png"));
				g.drawImage(fond, 0, 0, null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
