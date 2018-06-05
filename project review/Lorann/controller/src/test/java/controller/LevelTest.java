package controller;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class LevelTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testSetLevel() {
		int level = 1;
		Level instance = new Level();
		instance.setLevel(level);
		assertEquals(instance.getLevel(), level);
	}

	@Test
	public void testGetLevel() {
		Level instance = new Level();
		int expResult = 1;
		instance.setLevel(1);
		int result = instance.getLevel();
		assertEquals(expResult, result);
	}

}