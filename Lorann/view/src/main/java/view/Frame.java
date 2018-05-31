package view;

import javax.swing.JFrame;

public class Frame extends JFrame{

	private static final long serialVersionUID = 1L;
	public static Panel panel;
	public static int debut = 0;
		
	public Frame() {
		this.setTitle("Lorann");
		this.setSize(32*22 + 20, 32*18 + 10);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		panel = new Panel();
			
		this.setContentPane(panel);
			
		this.setVisible(true);
	}
}
