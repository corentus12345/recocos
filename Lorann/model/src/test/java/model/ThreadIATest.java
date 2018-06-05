package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.Frame;

public class ThreadIATest {
	public int coordEmptyx[][] = new int[22][17];
	public int coordEmptyy[][] = new int[22][17];
	public Integer coordGhostx[][] = new Integer[22][17];
	public Integer coordGhosty[][] = new Integer[22][17];
	int x = 1;
	int y = 1;
	@Before
	public void setUp() throws Exception {
		
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void testRun() {
		Frame.panel.coordGhostx = null;
		new Thread(new ThreadIA()).start();
		assertNotNull(Frame.panel.coordGhostx);
		assertNotNull(Frame.panel.coordGhosty);
	}

}