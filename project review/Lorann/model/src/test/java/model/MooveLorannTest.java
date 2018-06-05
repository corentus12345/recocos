package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.*;


public class MooveLorannTest {
	int XPerso = 1;
	int YPerso = 1;
	Frame instance = new Frame(null, null, null, null);
	MooveLorann mv = new MooveLorann();
	
	@Before
	public void setUp() throws Exception {	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMooveRight() {
		Frame.panel.setXPerso(XPerso);
		
		mv.mooveRight();
		int x1 = Frame.panel.getXPerso();
		assertEquals(2, x1);
	}

	@Test
	public void testMooveLeft() {
	Frame.panel.setXPerso(XPerso);
		
		mv.mooveLeft();
		int x1 = Frame.panel.getXPerso();
		assertEquals(0, x1);
	}

	@Test
	public void testMooveUp() {
	Frame.panel.setYPerso(YPerso);
		
		mv.mooveUp();
		int x1 = Frame.panel.getYPerso();
		assertEquals(0, x1);
	}

	@Test
	public void testMooveDown() {
	Frame.panel.setYPerso(YPerso);
		
		mv.mooveDown();
		int x1 = Frame.panel.getYPerso();
		assertEquals(2, x1);
	}

}