package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import contract.IController;
import contract.IKeyPressed;

public class Frame extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	public static Panel panel;
	public static int debut = 0;
	public static boolean key = false;
	private IKeyPressed mv;
	private IController control;
		
	public Frame(IKeyPressed mv, IController control) {
		this.mv = mv;
		this.control = control;
		
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
			
			mv.right(control);
			
		}
		if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
			
			mv.left(control);
			
		}
		if(evt.getKeyCode() == KeyEvent.VK_UP) {
			
			mv.up(control);
			
		}
		if(evt.getKeyCode() == KeyEvent.VK_DOWN) {
			
			mv.down(control);
			
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
