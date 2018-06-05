package decorations;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class DecorationsTest {
	String g = "10";
	String t = "11";
	int x = 0;
	int y = 0;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)

	public void testDecorations() {
		new Decorations(g, t, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
	assertEquals(10, x);
	assertEquals(11, y);
	}

}