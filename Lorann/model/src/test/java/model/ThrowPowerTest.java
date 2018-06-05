package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.Frame;

public class ThrowPowerTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void testRun() {
	
		ThrowPower instance = new ThrowPower();
		//new Thread(new ThrowPower()).start();
		instance.run();
		assertEquals(false, Frame.power);
		assertNotNull(Frame.panel.img);
	}
	
}