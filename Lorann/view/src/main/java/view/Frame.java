package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import contract.IKeyPressed;

public class Frame extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	public static Panel panel;
	public static int debut = 0;
	private IKeyPressed mv;
		
	public Frame(IKeyPressed mv) {
		this.mv = mv;
		
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
			if(panel.img[panel.getXPerso() + 1][panel.getYPerso()] == null || (panel.getXPerso() + 1 == panel.getXpersoImage() && panel.getYPerso() == panel.getYpersoImage())) {
				
				mv.mooveRight();
				
			}
			else if(panel.getXPerso() + 1 == panel.coordItemx[panel.getXPerso() + 1][panel.getYPerso()] && panel.getYPerso() == panel.coordItemy[panel.getXPerso() + 1][panel.getYPerso()]) {
				
				mv.mooveRight();
				//Faire la méthode de comptage de point
				
			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
			if(panel.img[panel.getXPerso() - 1][panel.getYPerso()] == null || (panel.getXPerso() - 1 == panel.getXpersoImage() && panel.getYPerso() == panel.getYpersoImage())) {
				
				mv.mooveLeft();
			}
			
			else if(panel.getXPerso() - 1 == panel.coordItemx[panel.getXPerso() - 1][panel.getYPerso()] && panel.getYPerso() == panel.coordItemy[panel.getXPerso() - 1][panel.getYPerso()]) {
				
				mv.mooveLeft();
				//Faire la méthode de comptage de point
				
			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_UP) {
			if(panel.img[panel.getXPerso()][panel.getYPerso() - 1] == null || (panel.getXPerso() == panel.getXpersoImage() && panel.getYPerso() - 1 == panel.getYpersoImage())) {
				
				mv.mooveUp();
				
			}
			else if(panel.getYPerso() - 1 == panel.coordItemy[panel.getXPerso()][panel.getYPerso() - 1] && panel.getXPerso() == panel.coordItemx[panel.getXPerso()][panel.getYPerso() - 1]) {
				
				mv.mooveUp();
				//Faire la méthode de comptage de point
				
			}
		}
		if(evt.getKeyCode() == KeyEvent.VK_DOWN) {
			if(panel.img[panel.getXPerso()][panel.getYPerso() + 1] == null || (panel.getXPerso() == panel.getXpersoImage() && panel.getYPerso() + 1 == panel.getYpersoImage())) {
				
				mv.mooveDown();			
				
			}
			else if(panel.getYPerso() + 1 == panel.coordItemy[panel.getXPerso()][panel.getYPerso() + 1] && panel.getXPerso() == panel.coordItemx[panel.getXPerso()][panel.getYPerso() + 1]) {
				
				mv.mooveDown();
				//Faire la méthode de comptage de point
				
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
