package view;

import javax.swing.JFrame;

public class Frame extends JFrame{

	private static final long serialVersionUID = 1L;
	public static Panel panel;
	public static int debut = 0;
		
	public Frame() {
		this.setTitle("Lorann");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		panel = new Panel();
			
		this.setContentPane(panel);
			
		this.setVisible(true);
	}
}
