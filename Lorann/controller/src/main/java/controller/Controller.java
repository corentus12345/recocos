package controller;

import java.util.Scanner;

import BDD.CreateBDD;
import BDD.HaveBDD;
import model.MooveLorann;
import view.Frame;

public class Controller {
	private int level = 1;
	private Scanner sc;

	@SuppressWarnings("unused")
	public Controller() {
		sc = new Scanner(System.in);
		System.out.println("Par quel niveau voulez-vous commencer (1 � 5) ?");
		level = sc.nextInt();
		
		CreateBDD bdd = new CreateBDD();
		Frame frame = new Frame(new MooveLorann());
		HaveBDD map = new HaveBDD(level);
	}
}
