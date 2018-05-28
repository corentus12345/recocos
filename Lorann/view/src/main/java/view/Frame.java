package view;

import javax.swing.JFrame;

public class Frame extends JFrame{

	private static final long serialVersionUID = 1L;
	private Panel panel;
	private BuilderGraphics Buildergraphics = new BuilderGraphics();
	
	public Frame() {
		this.setTitle("Lorann");
		this.setExtendedState(JFrame.MAXIMIZED_BOTH);
		panel = new Panel(Buildergraphics);
		
		this.setContentPane(panel);
		
		this.setVisible(true);
	}
}
