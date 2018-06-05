package model;

import contract.IController;
import view.Frame;
/**
 * 
 * @author Corentin BOURGEY
 *
 */
public class VerificationDoor{
	
	private IController control;
	/**
	 * control if door is open or close
	 * @param control
	 */
	public VerificationDoor(IController control) {
		this.control = control;
		
		if(Frame.key) {
			doorOpen();
		}
		else {
			doorClose();
		}
	}
	/**
	 * switch the level when we passe a door open
	 */
	public void doorOpen() {
		
		control.setLevel(control.getLevel() + 1);

	}
	/**
	 * Game Over if you passe a door close
	 */
	public void doorClose() {
		
		Frame.debut = 2;
		
	}
}
