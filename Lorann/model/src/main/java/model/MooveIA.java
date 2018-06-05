package model;

import contract.IMooveIA;
/**
 * 
 * @author Corentin BOURGEY,Corentin BRION
 *
 */
public class MooveIA implements IMooveIA{

	@Override
	/**
	 * Start Thread of IA 
	 */
	public void mooveThread() {
		
		new Thread(new ThreadIA()).start();
		
	}
}
