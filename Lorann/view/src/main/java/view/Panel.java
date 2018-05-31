package view;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

public class Panel extends JPanel{
	private static final long serialVersionUID = 1L;
	public BufferedImage img[][] = new BufferedImage[22][17];
	public int x;
	public int y;
	
	public Panel() {

	}
	
	public void paintComponent(Graphics g) {
		if(Frame.debut == 1) {
			g.drawImage(img[Frame.panel.x][Frame.panel.y], Frame.panel.x * 32, Frame.panel.y * 32, null);
		}
		repaint();
	}
}
