package controller;

import java.util.Scanner;

import BDD.CreateBDD;
import BDD.HaveBDD;
import model.KeyPressed;
import model.MooveIA;
import view.Frame;
/**
 * 
 * @author corentin BOURGEY, corentin BRION
 *
 */
public class Controller{
	private Level level = new Level();
	private Scanner sc;
	/**
	 * Select your level and go search on the BDD
	 */
	@SuppressWarnings("unused")
	public Controller() {
		sc = new Scanner(System.in);
		System.out.println("Par quel niveau voulez-vous commencer (1 � 5) ?");
		level.setLevel(sc.nextInt());
		
		CreateBDD bdd = new CreateBDD();
		Frame frame = new Frame(new KeyPressed(), level, new MooveIA());
		HaveBDD map = new HaveBDD(level.getLevel());
	}
}
