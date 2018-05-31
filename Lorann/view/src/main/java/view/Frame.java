package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	public static Panel panel;
	public static int debut = 0;
		
	public Frame() {
		this.setTitle("Lorann");
		this.setSize(32*22 + 20, 32*18 + 10);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		panel = new Panel();
		
		setFocusable(true);
	    addKeyListener(this);
		
		this.setContentPane(panel);
			
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent evt) {
		if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(panel.img[panel.getXPerso() + 1][panel.getYPerso()] == null) {
				panel.setXPerso(panel.getXPerso() + 1);
				if(panel.getXPerso() > 20) {
					panel.setXPerso(panel.getXPerso() - 1);
				}
				Frame.panel.repaint();
			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
			if(panel.img[panel.getXPerso() - 1][panel.getYPerso()] == null) {
				panel.setXPerso(panel.getXPerso() - 1);
				if(panel.getXPerso() < 1) {
					panel.setXPerso(panel.getXPerso() + 1);
				}
				Frame.panel.repaint();
			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_UP) {
			if(panel.img[panel.getXPerso()][panel.getYPerso() - 1] == null) {
				panel.setYPerso(panel.getYPerso() - 1);
				if(panel.getYPerso() < 1) {
					panel.setYPerso(panel.getYPerso() + 1);
				}
				Frame.panel.repaint();
			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_DOWN) {
			if(panel.img[panel.getXPerso()][panel.getYPerso() + 1] == null) {
				panel.setYPerso(panel.getYPerso() + 1);
				if(panel.getYPerso() > 15) {
					panel.setYPerso(panel.getYPerso() - 1);
				}
				Frame.panel.repaint();
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
}
