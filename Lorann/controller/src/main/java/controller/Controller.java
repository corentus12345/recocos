package controller;

import BDD.CreateBDD;
import BDD.HaveBDD;
import model.KeyPressed;
import model.MooveIA;
import model.Sound;
import view.Frame;
/**
 * 
 * @author corentin BOURGEY, corentin BRION
 *
 */
public class Controller{
	private Level level = new Level();
	private HaveBDD hbdd = new HaveBDD();
	/**
	 * Select your level and go search on the BDD
	 */
	@SuppressWarnings("unused")
	public Controller() {
		
		CreateBDD bdd = new CreateBDD();
		Frame frame = new Frame(new KeyPressed(), level, new MooveIA(), hbdd);
		new Thread(new Sound()).start();
		
	}
}
