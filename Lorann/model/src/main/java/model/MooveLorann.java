package model;

import contract.IKeyPressed;
import view.Frame;

public class MooveLorann implements IKeyPressed{
	
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
