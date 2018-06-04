package model;

import contract.IMooveIA;

public class MooveIA implements IMooveIA{

	@Override
	public void mooveThread() {
		
		new Thread(new ThreadIA()).start();
		
	}
}
