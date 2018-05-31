package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class Frame extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	public static Panel panel;
	public static int debut = 0;
	private MooveLorann mv = new MooveLorann();
		
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
			if(panel.img[panel.getXPerso() + 1][panel.getYPerso()] == null || (panel.getXPerso() + 1 == panel.coordItemx[panel.getXPerso() + 1][panel.getYPerso()] && panel.getYPerso() == panel.coordItemy[panel.getXPerso() + 1][panel.getYPerso()])) {
				mv.mooveRight();

			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
			if(panel.img[panel.getXPerso() - 1][panel.getYPerso()] == null || (panel.getXPerso() - 1 == panel.coordItemx[panel.getXPerso() - 1][panel.getYPerso()] && panel.getYPerso() == panel.coordItemy[panel.getXPerso() - 1][panel.getYPerso()])) {
				mv.mooveLeft();

			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_UP) {
			if(panel.img[panel.getXPerso()][panel.getYPerso() - 1] == null || (panel.getYPerso() - 1 == panel.coordItemy[panel.getXPerso()][panel.getYPerso() - 1] && panel.getXPerso() == panel.coordItemx[panel.getXPerso()][panel.getYPerso() - 1])) {
				mv.mooveUp();

			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_DOWN) {
			if(panel.img[panel.getXPerso()][panel.getYPerso() + 1] == null || (panel.getYPerso() + 1 == panel.coordItemy[panel.getXPerso()][panel.getYPerso() + 1] && panel.getXPerso() == panel.coordItemx[panel.getXPerso()][panel.getYPerso() + 1])) {
				mv.mooveDown();
				
			}
		}
		panel.repaint();
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}
}
