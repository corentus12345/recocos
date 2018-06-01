package model;

import contract.IController;
import contract.IKeyPressed;
import view.Frame;

public class KeyPressed implements IKeyPressed{
	private MooveLorann mv = new MooveLorann();
	
	@Override
	public void right(int level, IController control) {
		if(Frame.panel.img[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] == null || (Frame.panel.getXPerso() + 1 == Frame.panel.getXpersoImage() && Frame.panel.getYPerso() == Frame.panel.getYpersoImage())) {
			
			mv.mooveRight();
			
		}
		else if(Frame.panel.getXPerso() + 1 == Frame.panel.coordItemx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordItemy[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()]) {
			
			mv.mooveRight();
			//Faire la m�thode de comptage de point
			
		}
		else if(Frame.panel.getXPerso() + 1 == Frame.panel.coordKeyx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordKeyy[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()]) {
			
			mv.mooveRight();
			Frame.key = true;
			
		}
		else if(Frame.panel.getXPerso() + 1 == Frame.panel.coordDoorx[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordDoory[Frame.panel.getXPerso() + 1][Frame.panel.getYPerso()]) {
			
			mv.mooveRight();
			new VerificationDoor(level, control);
			
		}
	}

	@Override
	public void left(int level, IController control) {
		if(Frame.panel.img[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] == null || (Frame.panel.getXPerso() - 1 == Frame.panel.getXpersoImage() && Frame.panel.getYPerso() == Frame.panel.getYpersoImage())) {
			
			mv.mooveLeft();
		}
		
		else if(Frame.panel.getXPerso() - 1 == Frame.panel.coordItemx[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordItemy[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()]) {
			
			mv.mooveLeft();
			//Faire la m�thode de comptage de point
			
		}
		else if(Frame.panel.getXPerso() - 1 == Frame.panel.coordKeyx[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()] && Frame.panel.getYPerso() == Frame.panel.coordKeyy[Frame.panel.getXPerso() - 1][Frame.panel.getYPerso()]) {
			
			mv.mooveLeft();
			Frame.key = true;
			
		}
	}

	@Override
	public void up(int level, IController control) {
		if(Frame.panel.img[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] == null || (Frame.panel.getXPerso() == Frame.panel.getXpersoImage() && Frame.panel.getYPerso() - 1 == Frame.panel.getYpersoImage())) {
			
			mv.mooveUp();
			
		}
		else if(Frame.panel.getYPerso() - 1 == Frame.panel.coordItemy[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] && Frame.panel.getXPerso() == Frame.panel.coordItemx[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1]) {
			
			mv.mooveUp();
			//Faire la m�thode de comptage de point
			
		}
		else if(Frame.panel.getYPerso() == Frame.panel.coordKeyx[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1] && Frame.panel.getYPerso() + 1 == Frame.panel.coordKeyy[Frame.panel.getXPerso()][Frame.panel.getYPerso() - 1]) {
			
			mv.mooveUp();
			Frame.key = true;
			
		}
	}

	@Override
	public void down(int level, IController control) {
		if(Frame.panel.img[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] == null || (Frame.panel.getXPerso() == Frame.panel.getXpersoImage() && Frame.panel.getYPerso() + 1 == Frame.panel.getYpersoImage())) {
			
			mv.mooveDown();			
			
		}
		else if(Frame.panel.getYPerso() + 1 == Frame.panel.coordItemy[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] && Frame.panel.getXPerso() == Frame.panel.coordItemx[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1]) {
			
			mv.mooveDown();
			//Faire la m�thode de comptage de point
			
		}
		else if(Frame.panel.getXPerso() == Frame.panel.coordKeyx[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1] && Frame.panel.getYPerso() + 1 == Frame.panel.coordKeyy[Frame.panel.getXPerso()][Frame.panel.getYPerso() + 1]) {
			
			mv.mooveDown();
			Frame.key = true;
			
		}
	}

}
