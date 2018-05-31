package view;

public class MooveLorann {
	
	public MooveLorann() {
		
	}
	
	public void mooveRight() {
		Frame.panel.setXPerso(Frame.panel.getXPerso() + 1);
	}
	
	public void mooveLeft() {
		Frame.panel.setXPerso(Frame.panel.getXPerso() - 1);
	}

	public void mooveUp() {
		Frame.panel.setYPerso(Frame.panel.getYPerso() - 1);
	}

	public void mooveDown() {
		Frame.panel.setYPerso(Frame.panel.getYPerso() + 1);
	}
}
