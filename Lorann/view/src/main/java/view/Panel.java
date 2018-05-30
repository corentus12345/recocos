package view;

import java.awt.Graphics;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private static final long serialVersionUID = 1L;

	public Panel() {

	}
	
	public void paintComponent(Graphics g) {
		g.drawString("88888", 15, 30);
		repaint();
	}
}
