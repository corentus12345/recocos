package BDD;

import static org.junit.Assert.*;

import java.sql.ResultSet;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import view.Frame;

public class SetBDDTest {
	ResultSet result;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test(expected=NullPointerException.class)
	public void testSetBDD() {
		Frame.debut = 0;

		new SetBDD(result);
		assertEquals(1, Frame.debut);
		
		
	}

}