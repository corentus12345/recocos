package view;

import java.awt.Graphics;
import java.util.Observer;

import javax.swing.JPanel;

@SuppressWarnings("deprecation")
public class Panel extends JPanel implements Observer{

	private static final long serialVersionUID = 1L;
	private final BuilderGraphics graphicsBuilder;

	public Panel(final BuilderGraphics graphicsBuilder) {
		this.graphicsBuilder = graphicsBuilder;
	}
	
	public void paintComponent(Graphics g) {
		this.graphicsBuilder.applyGraphics(g);
	}

	@Override
	public void update(java.util.Observable arg0, Object arg1) {
		this.repaint();
	}
}
