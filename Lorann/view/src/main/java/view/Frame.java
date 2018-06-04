package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import contract.IController;
import contract.IKeyPressed;
import contract.IMooveIA;

public class Frame extends JFrame implements KeyListener{

	private static final long serialVersionUID = 1L;
	public static Panel panel;
	public static int debut = -1;
	public static boolean key = false;
	public static String direction;
	private IKeyPressed mv;
	private IController control;
	@SuppressWarnings("unused")
	private IMooveIA mvIA;
	public static boolean power = false;
		
	public Frame(IKeyPressed mv, IController control, IMooveIA mvIA) {
		this.mv = mv;
		this.control = control;
		this.mvIA = mvIA;
		
		this.setTitle("Lorann");
		this.setSize(32*22 + 20, 32*18 + 10);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		panel = new Panel(mvIA);
		
		setFocusable(true);
	    addKeyListener(this);
		
		this.setContentPane(panel);
			
		this.setVisible(true);
	}

	@Override
	public void keyPressed(KeyEvent evt) {
		if(evt.getKeyCode() == KeyEvent.VK_RIGHT) {
			
			direction = "RIGHT";
			mv.right(control);
			
		}
		if(evt.getKeyCode() == KeyEvent.VK_LEFT) {
			
			direction = "LEFT";
			mv.left(control);
			
		}
		if(evt.getKeyCode() == KeyEvent.VK_UP) {
			
			direction = "UP";
			mv.up(control);
			
		}
		if(evt.getKeyCode() == KeyEvent.VK_DOWN) {
			
			direction = "DOWN";
			mv.down(control);
			
		}
		if(evt.getKeyCode() == KeyEvent.VK_T) {
			mv.throwPower();
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
