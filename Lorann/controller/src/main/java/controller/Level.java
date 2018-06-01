package controller;

import BDD.HaveBDD;
import contract.IController;
import view.Frame;

public class Level implements IController{
	private int level = 1;
	
	public void setLevel(int level) {
		this.level = level;
		if(Frame.debut == 1) {
			new HaveBDD(getLevel());
		}
	}
	
	public int getLevel() {
		return level;
	}
}
