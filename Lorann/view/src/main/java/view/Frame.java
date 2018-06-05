package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import contract.IController;
import contract.IHaveBDD;
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
	@SuppressWarnings("unused")
	private IHaveBDD hbdd;
	public static boolean power = false;
	private JButton button1 = new JButton("Level 1");
	private JButton button2 = new JButton("Level 2");
	private JButton button3 = new JButton("Level 3");
	private JButton button4 = new JButton("Level 4");
	private JButton button5 = new JButton("Level 5");
	private JLabel label = new JLabel("Choose your level which you want to start !");
		
	public Frame(IKeyPressed mv, IController control, IMooveIA mvIA, IHaveBDD hbdd) {
		this.mv = mv;
		this.hbdd = hbdd;
		this.control = control;
		this.mvIA = mvIA;
		
		this.setTitle("Lorann");
		this.setSize(32*22 + 20, 32*18 + 10);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		panel = new Panel(mvIA);
		
		Font police = new Font("Tahoma", Font.BOLD, 32);  
		label.setFont(police);  
		label.setForeground(Color.red);
		panel.add(label);
		label.setVerticalTextPosition(JLabel.TOP);
		
		panel.add(button1, BorderLayout.SOUTH);
		panel.add(button2, BorderLayout.SOUTH);
		panel.add(button3, BorderLayout.SOUTH);
		panel.add(button4, BorderLayout.SOUTH);
		panel.add(button5, BorderLayout.SOUTH);
		
		setFocusable(true);
	    addKeyListener(this);
	    button1.setFocusable(false);
	    button2.setFocusable(false);
	    button3.setFocusable(false);
	    button4.setFocusable(false);
	    button5.setFocusable(false);
	    
	    button1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
	        	
				control.setLevel(1);
				debut = 1;
				panel.remove(button1);
				panel.remove(button2);
				panel.remove(button3);
				panel.remove(button4);
				panel.remove(button5);
				hbdd.haveBDD(control.getLevel());
				panel.remove(label);
				
	        }
	    });
	    
	    button2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
	        	
				control.setLevel(2);
				debut = 1;
				panel.remove(button1);
				panel.remove(button2);
				panel.remove(button3);
				panel.remove(button4);
				panel.remove(button5);
				hbdd.haveBDD(control.getLevel());
				panel.remove(label);
				
	        }
	    });
	    
	    button3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
	        	
				control.setLevel(3);
				debut = 1;
				panel.remove(button1);
				panel.remove(button2);
				panel.remove(button3);
				panel.remove(button4);
				panel.remove(button5);
				hbdd.haveBDD(control.getLevel());
				panel.remove(label);
				
	        }
	    });
	    
	    button4.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
	        	
				control.setLevel(4);
				debut = 1;
				panel.remove(button1);
				panel.remove(button2);
				panel.remove(button3);
				panel.remove(button4);
				panel.remove(button5);
				hbdd.haveBDD(control.getLevel());
				panel.remove(label);
				
	        }
	    });
	    
	    button5.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent event){
	        	
				control.setLevel(5);
				debut = 1;
				panel.remove(button1);
				panel.remove(button2);
				panel.remove(button3);
				panel.remove(button4);
				panel.remove(button5);
				hbdd.haveBDD(control.getLevel());
				panel.remove(label);
				
	        }
	    });
		
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
