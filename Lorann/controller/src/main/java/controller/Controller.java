package controller;

import model.CreateBDD;
import model.HaveBDD;
import view.Frame;

public class Controller {
	private int level = 1;
	
	@SuppressWarnings("unused")
	public Controller() {
		CreateBDD bdd = new CreateBDD();
		HaveBDD map = new HaveBDD(level);
		Frame frame = new Frame();
	}
}
