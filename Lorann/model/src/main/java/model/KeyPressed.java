package model;

import contract.IController;
import contract.IKeyPressed;
import view.Frame;

public class KeyPressed implements IKeyPressed{
	private MooveLorann mv = new MooveLorann();
	
	@Override
	public void right(IController control) {
		if((Frame.panel.getXPerso() + 1 == Frame.panel.coordEmptyx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordEmptyy[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()]) || (Frame.panel.getXPerso() + 1 == Frame.panel.getXpersoImage() && Frame.panel.getYPerso() == Frame.panel.getYpersoImage())) {
			
			mv.mooveRight();
			
		}
		else if(Frame.panel.getXPerso() + 1 == Frame.panel.coordItemx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordItemy[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()]) {
			
			mv.mooveRight();
			//Faire la méthode de comptage de point
			
		}
		else if(Frame.panel.getXPerso() + 1 == Frame.panel.coordKeyx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordKeyy[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()]) {
			
			mv.mooveRight();
			Frame.key = true;
			
		}
		else if(Frame.panel.getXPerso() + 1 == Frame.panel.coordDoorx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordDoory[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()]) {
			
			mv.mooveRight();
			new VerificationDoor(control);
			
		}
		else if(Frame.panel.coordGhostx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] != null && Frame.panel.getXPerso() + 1 == Frame.panel.coordGhostx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordGhosty[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()]) {
			
			Frame.debut = 2;
			
		}
	}

	@Override
	public void left(IController control) {
		if((Frame.panel.getXPerso() - 1 == Frame.panel.coordEmptyx[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordEmptyy[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()]) || (Frame.panel.getXPerso() - 1 == Frame.panel.getXpersoImage() && Frame.panel.getYPerso() == Frame.panel.getYpersoImage())) {
			
			mv.mooveLeft();
		}
		
		else if(Frame.panel.getXPerso() - 1 == Frame.panel.coordItemx[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordItemy[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()]) {
			
			mv.mooveLeft();
			//Faire la méthode de comptage de point
			
		}
		else if(Frame.panel.getXPerso() - 1 == Frame.panel.coordKeyx[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordKeyy[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()]) {
			
			mv.mooveLeft();
			Frame.key = true;
			
		}
		else if(Frame.panel.getXPerso() - 1 == Frame.panel.coordDoorx[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordDoory[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()]) {
			
			mv.mooveLeft();
			new VerificationDoor(control);
			
		}
		else if(Frame.panel.coordGhostx[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] != null && Frame.panel.getXPerso() - 1 == Frame.panel.coordGhostx[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordGhosty[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()]) {
			
			Frame.debut = 2;
			
		}
	}

	@Override
	public void up(IController control) {
		if((Frame.panel.getYPerso() - 1 == Frame.panel.coordEmptyy[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] && Frame.panel.getXPerso() == Frame.panel.coordEmptyx[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1]) || (Frame.panel.getXPerso() == Frame.panel.getXpersoImage() && Frame.panel.getYPerso() - 1 == Frame.panel.getYpersoImage())) {
			
			mv.mooveUp();
			
		}
		else if(Frame.panel.getYPerso() - 1 == Frame.panel.coordItemy[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] && Frame.panel.getXPerso() == Frame.panel.coordItemx[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1]) {
			
			mv.mooveUp();
			//Faire la méthode de comptage de point
			
		}
		else if(Frame.panel.getXPerso() == Frame.panel.coordKeyx[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] && Frame.panel.getYPerso() - 1 == Frame.panel.coordKeyy[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1]) {
			
			mv.mooveUp();
			Frame.key = true;
			
		}
		else if(Frame.panel.getYPerso() - 1 == Frame.panel.coordDoory[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] && Frame.panel.getXPerso() == Frame.panel.coordDoorx[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1]) {
			
			mv.mooveUp();
			new VerificationDoor(control);
			
		}
		else if(Frame.panel.coordGhosty[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] != null && Frame.panel.getYPerso() - 1 == Frame.panel.coordGhosty[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] && Frame.panel.getXPerso() == Frame.panel.coordGhostx[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1]) {
			
			Frame.debut = 2;
			
		}
	}

	@Override
	public void down(IController control) {
		if((Frame.panel.getYPerso() + 1 == Frame.panel.coordEmptyy[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] && Frame.panel.getXPerso() == Frame.panel.coordEmptyx[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1]) || (Frame.panel.getXPerso() == Frame.panel.getXpersoImage() && Frame.panel.getYPerso() + 1 == Frame.panel.getYpersoImage())) {
			
			mv.mooveDown();			
			
		}
		else if(Frame.panel.getYPerso() + 1 == Frame.panel.coordItemy[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] && Frame.panel.getXPerso() == Frame.panel.coordItemx[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1]) {
			
			mv.mooveDown();
			//Faire la méthode de comptage de point
			
		}
		else if(Frame.panel.getXPerso() == Frame.panel.coordKeyx[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] && Frame.panel.getYPerso() + 1 == Frame.panel.coordKeyy[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1]) {
			
			mv.mooveDown();
			Frame.key = true;
			
		}
		else if(Frame.panel.getYPerso() + 1 == Frame.panel.coordDoory[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] && Frame.panel.getXPerso() == Frame.panel.coordDoorx[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1]) {
			
			mv.mooveDown();
			new VerificationDoor(control);
			
		}
		else if(Frame.panel.coordGhosty[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] != null && Frame.panel.getYPerso() + 1 == Frame.panel.coordGhosty[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] && Frame.panel.getXPerso() == Frame.panel.coordGhostx[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1]) {
			
			Frame.debut = 2;
			
		}
	}
	
	public void throwPower() {
		
		new LancerPower();
		
	}

}
