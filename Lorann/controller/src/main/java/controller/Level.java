package controller;

import BDD.HaveBDD;
import contract.IController;
import model.CleanBoard;
import view.Frame;

public class Level implements IController{
	private int level = 1;
	
	public void setLevel(int level) {
		this.level = level;
		if(Frame.debut == 1) {
			if(getLevel() <= 5) {
				new CleanBoard();
				new HaveBDD(getLevel());
			}
			else {
				Frame.debut = 0;
			}
		}
	}
	
	public int getLevel() {
		return level;
	}
}
