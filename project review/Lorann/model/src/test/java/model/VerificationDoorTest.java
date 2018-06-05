package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import contract.IController;
import view.Frame;

public class VerificationDoorTest {

	private IController control;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void testVerificationDoor() {
		Frame.key = true;
		control.setLevel(1);
		new VerificationDoor(null);
		assertEquals(2, control.getLevel());
		
		Frame.key = false;
		new VerificationDoor(null);
		assertEquals(2, Frame.debut);
	}


}
