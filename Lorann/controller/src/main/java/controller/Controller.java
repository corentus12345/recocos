package controller;

import java.util.Scanner;

import BDD.CreateBDD;
import BDD.HaveBDD;
import model.KeyPressed;
import view.Frame;

public class Controller{
	private Level level = new Level();
	private Scanner sc;

	@SuppressWarnings("unused")
	public Controller() {
		sc = new Scanner(System.in);
		System.out.println("Par quel niveau voulez-vous commencer (1 à 5) ?");
		level.setLevel(sc.nextInt());
		
		CreateBDD bdd = new CreateBDD();
		Frame frame = new Frame(new KeyPressed(), level.getLevel(), new Level());
		HaveBDD map = new HaveBDD(level.getLevel());
	}
}
