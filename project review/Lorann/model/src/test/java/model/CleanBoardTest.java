package model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.Frame;

public class CleanBoardTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testCleanBoard() {
		new Frame(null, null, null, null);
		new CleanBoard();
		int x = 1;
		int y = 1;
		int expResult = -1;
		
		assertNull(Frame.panel.img[x][y]);
		assertEquals(expResult, Frame.panel.coordDoorx[x][y]);
		assertEquals(expResult, Frame.panel.coordDoory[x][y]);
		assertEquals(expResult, Frame.panel.coordEmptyx[x][y]);
		assertEquals(expResult, Frame.panel.coordEmptyy[x][y]);
		assertEquals(expResult, Frame.panel.coordItemx[x][y]);
		assertEquals(expResult, Frame.panel.coordItemy[x][y]);
		assertEquals(expResult, Frame.panel.coordKeyx[x][y]);
		assertEquals(expResult, Frame.panel.coordKeyy[x][y]);
		assertNull(Frame.panel.coordGhostx[x][y]);
		assertNull(Frame.panel.coordGhosty[x][y]);

	}

}