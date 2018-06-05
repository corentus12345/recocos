package view;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FrameTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@SuppressWarnings("static-access")
	@Test
	public void testFrame() {
		
		Frame frame = new Frame(null, null, null, null);
		int dimX = frame.getWidth();
		int dimY = frame.getHeight();
		Frame instance = new Frame(null, null, null, null);
	
		assertNotNull(frame);
		assertEquals("Lorann", frame.getTitle() );
		assertEquals(724, dimX);
		assertEquals(586, dimY);
		assertEquals(6, instance.panel.getComponentCount());
	}

	/*@Test
	public void testKeyPressed(KeyEvent evt) {
		 IKeyPressed mv;
		 IController control = null;
		 IKeyPressed instance;
		 
		//Si les methodes right, left, up et down fonctionnent alors cette méthode fonctionne.
		
			 
		}*/
	

	

}
