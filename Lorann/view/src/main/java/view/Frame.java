package view;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Frame extends JFrame{

	private static final long serialVersionUID = 1L;
	private JPanel panel;
	
	public Frame() {
		this.setTitle("Lorann");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		panel = new JPanel();
		
		this.setContentPane(panel);
		
		this.setVisible(true);
	}
}
