package model;

import contract.IController;
import view.Frame;

public class VerificationDoor{
	
	private IController control;
	
	public VerificationDoor(int level, IController control) {
		this.control = control;
		
		if(Frame.key) {
			doorOpen(level);
		}
		else {
			doorClose();
		}
	}
	
	public void doorOpen(int level) {
		
		control.setLevel(level + 1);

	}
	
	public void doorClose() {
		
		System.out.print("Game over");
		
	}
}
