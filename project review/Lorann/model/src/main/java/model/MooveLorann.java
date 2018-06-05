package model;

import view.Frame;
/**
 * 
 * @author Corentin BOURGEY,Corentin BRION
 *
 */
public class MooveLorann{
	/**
	 * Lorann can move on the right
	 */
	public void mooveRight() {
		Frame.panel.setXPerso(Frame.panel.getXPerso() + 1);
	}
	/**
	 * Lorann can move on the left
	 */
	public void mooveLeft() {
		Frame.panel.setXPerso(Frame.panel.getXPerso() - 1);
	}
	/**
	 * Lorann can move on the top
	 */
	public void mooveUp() {
		Frame.panel.setYPerso(Frame.panel.getYPerso() - 1);
	}
	/**
	 * Lorann can move on the down
	 */
	public void mooveDown() {
		Frame.panel.setYPerso(Frame.panel.getYPerso() + 1);
	}
}
