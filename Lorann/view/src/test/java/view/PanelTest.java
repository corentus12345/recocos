package view;

import static org.junit.Assert.*;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class PanelTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	
	@Test(expected=NullPointerException.class)
	public void testPaintComponent() {
		BufferedImage fond = null;
		
		Panel instance = new Panel(null);
		Graphics g = null;
		instance.paintComponent(g);
		assertNotNull(fond);
		
	}

	@Test
	public void testSetXPerso() {
		int xPerso = 1;
		Panel instance = new Panel(null);
		instance.setYPerso(xPerso);
		assertEquals(instance.getYPerso(), xPerso);
	}

	@Test
	public void testGetXPerso() {
		Panel instance = new Panel(null);
		int expResult = 1;
		instance.setXPerso(1);
		int result = instance.getXPerso();
		assertEquals(expResult, result);
		
	}

	@Test
	public void testSetYPerso() {
		int yPerso = 1;
		Panel instance = new Panel(null);
		instance.setYPerso(yPerso);
		assertEquals(instance.getYPerso(), yPerso);
	}

	@Test
	public void testGetYPerso() {
		Panel instance = new Panel(null);
		int expResult = 1;
		instance.setYPerso(1);
		int result = instance.getYPerso();
		assertEquals(expResult, result);
		
	}

	@Test
	public void testSetXpersoImage() {
		int xPersoImage = 1;
		Panel instance = new Panel(null);
		instance.setXpersoImage(xPersoImage);
		assertEquals(instance.getXpersoImage(), xPersoImage);
	}

	@Test
	public void testGetXpersoImage() {
		Panel instance = new Panel(null);
		int expResult = 1;
		instance.setXpersoImage(1);
		int result = instance.getXpersoImage();
		assertEquals(expResult, result);
		
	}

	@Test
	public void testSetYpersoImage() {
		int yPersoImage = 1;
		Panel instance = new Panel(null);
		instance.setYpersoImage(yPersoImage);
		assertEquals(instance.getYpersoImage(), yPersoImage);
	}

	@Test
	public void testGetYpersoImage() {
		Panel instance = new Panel(null);
		int expResult = 1;
		instance.setYpersoImage(1);
		int result = instance.getYpersoImage();
		assertEquals(expResult, result);
	}

	@Test
	public void testSetXKeyImage() {
		int xKeyImage = 1;
		Panel instance = new Panel(null);
		instance.setXKeyImage(xKeyImage);
		assertEquals(instance.getXKeyImage(), xKeyImage);
	}

	@Test
	public void testGetXKeyImage() {
		Panel instance = new Panel(null);
		int expResult = 1;
		instance.setXKeyImage(1);
		int result = instance.getXKeyImage();
		assertEquals(expResult, result);
	}

	@Test
	public void testSetYKeyImage() {
		int yKeyImage = 1;
		Panel instance = new Panel(null);
		instance.setYKeyImage(yKeyImage);
		assertEquals(instance.getYKeyImage(), yKeyImage);
	}

	@Test
	public void testGetYKeyImage() {
		Panel instance = new Panel(null);
		int expResult = 1;
		instance.setYKeyImage(1);
		int result = instance.getYKeyImage();
		assertEquals(expResult, result);
	}

	@Test
	public void testSetImgGhost() {
		BufferedImage imgGhost = new BufferedImage(1, 1, 1);
		Panel instance = new Panel(null);
		instance.setImgGhost(imgGhost);
		assertEquals(instance.getImgGhost(), imgGhost);
	}

	@Test
	public void testGetImgGhost() {
		Panel instance = new Panel(null);
		BufferedImage expResult = new BufferedImage(1, 10, 1);
		instance.setImgGhost(expResult);
		BufferedImage result = instance.getImgGhost();
		assertEquals(expResult, result);
	}



}
