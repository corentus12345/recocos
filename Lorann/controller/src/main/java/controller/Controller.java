package controller;

import java.util.Scanner;

import model.CreateBDD;
import model.HaveBDD;
import view.Frame;

public class Controller {
	private int level = 1;
	private Scanner sc;

	@SuppressWarnings("unused")
	public Controller() {
		sc = new Scanner(System.in);
		System.out.println("Par quel niveau voulez-vous commencer (1 à 5) ?");
		level = sc.nextInt();
		CreateBDD bdd = new CreateBDD();
		Frame frame = new Frame();
		HaveBDD map = new HaveBDD(level);
	}
}
