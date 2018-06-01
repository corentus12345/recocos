package model;

import contract.IController;
import view.Frame;

public class VerificationDoor{
	
	private IController control;
	
	public VerificationDoor(IController control) {
		this.control = control;
		
		if(Frame.key) {
			doorOpen();
		}
		else {
			doorClose();
		}
	}
	
	public void doorOpen() {
		
		control.setLevel(control.getLevel() + 1);

	}
	
	public void doorClose() {
		
		Frame.debut = 2;
		
	}
}
