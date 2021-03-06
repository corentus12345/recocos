package decorations;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import javax.imageio.ImageIO;

import view.Frame;
/**
 * 
 * @author Corentin BOURGEY
 *
 */
public class Decorations {
/**
 * Launch the method of object creation
 * @param g
 * @param t
 * @param g2
 * @param t2
 * @param g3
 * @param t3
 * @param g4
 * @param t4
 * @param g5
 * @param t5
 * @param g6
 * @param t6
 * @param g7
 * @param t7
 * @param g8
 * @param t8
 * @param g9
 * @param t9
 */
	protected Decorations(String g, String t, String g2, String t2, String g3, String t3, String g4, String t4, String g5, String t5, String g6, String t6, String g7, String t7, String g8, String t8, String g9, String t9) {
		if(g != null) {
			setImageWallHorizontal(g, t);
		}
		else if(g2 != null) {
			setImageWallVertical(g2, t2);
		}
		else if(g3 != null) {
			setImageWallCorner(g3, t3);
		}
		else if(g4 != null) {
			setImageDoor(g4, t4);
		}
		else if(g5 != null) {
			setImageMonster(g5, t5);
		}
		else if(g6 != null) {
			setImageItem(g6, t6);
		}
		else if(g7 != null) {
			setImageKey(g7, t7);
		}
		else if(g8 != null) {
			setImageLorann(g8, t8);
		}
		else if(g9 != null) {
			setImageEmpty(g9, t9);
		}
	}
	/**
	 * create object of WallHorizontal
	 * @param g
	 * @param t
	 */
	private void setImageWallHorizontal(String g, String t) {
		
		int x = Integer.valueOf(g);	
		int y = Integer.valueOf(t);
		
		try {
			Frame.panel.img[x][y] = ImageIO.read(new File(getClass().getResource("/pictures/horizontal_bone.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}	
	}
	/**
	 * create object of WallVertical
	 * @param g2
	 * @param t2
	 */
	private void setImageWallVertical(String g2, String t2) {
		
		int x2 = Integer.valueOf(g2);
		int y2 = Integer.valueOf(t2);
		
		try {
			Frame.panel.img[x2][y2] = ImageIO.read(new File(getClass().getResource("/pictures/vertical_bone.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	/**
	 * create object of WallCorner
	 * @param g3
	 * @param t3
	 */
	private void setImageWallCorner(String g3, String t3) {
		
		int x3 = Integer.valueOf(g3);
		int y3 = Integer.valueOf(t3);
		
		try {
			Frame.panel.img[x3][y3] = ImageIO.read(new File(getClass().getResource("/pictures/bone.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	/**
	 * create object of Door
	 * @param g4
	 * @param t4
	 */
	private void setImageDoor(String g4, String t4) {
		
		int x4 = Integer.valueOf(g4);
		int y4 = Integer.valueOf(t4);
		
		try {
			Frame.panel.img[x4][y4] = ImageIO.read(new File(getClass().getResource("/pictures/gate_closed.png").toURI()));
			Frame.panel.setxDoor(x4);
			Frame.panel.setyDoor(y4);
			Frame.panel.coordDoorx[x4][y4] = x4;
			Frame.panel.coordDoory[x4][y4] = y4;
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create object of Monster
	 * @param g5
	 * @param t5
	 */
	private void setImageMonster(String g5, String t5) {
		
		int x5 = Integer.valueOf(g5);
		int y5 = Integer.valueOf(t5);
		
		try {
			Frame.panel.img[x5][y5] = ImageIO.read(new File(getClass().getResource("/pictures/monster_1.png").toURI()));
			Frame.panel.setImgGhost(ImageIO.read(new File(getClass().getResource("/pictures/monster_1.png").toURI())));
			Frame.panel.coordGhostx[x5][y5] = x5;
			Frame.panel.coordGhosty[x5][y5] = y5;
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create object of Item
	 * @param g6
	 * @param t6
	 */
	private void setImageItem(String g6, String t6) {
		
		int x6 = Integer.valueOf(g6);
		int y6 = Integer.valueOf(t6);
		
		try {
			Frame.panel.img[x6][y6] = ImageIO.read(new File(getClass().getResource("/pictures/purse.png").toURI()));
			Frame.panel.coordItemx[x6][y6] = x6;
			Frame.panel.coordItemy[x6][y6] = y6;
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create object of Key
	 * @param g7
	 * @param t7
	 */
	private void setImageKey(String g7, String t7) {
		
		int x7 = Integer.valueOf(g7);
		int y7 = Integer.valueOf(t7);
		
		try {
			Frame.panel.img[x7][y7] = ImageIO.read(new File(getClass().getResource("/pictures/crystal_ball.png").toURI()));
			Frame.panel.coordKeyx[x7][y7] = x7;
			Frame.panel.coordKeyy[x7][y7] = y7;
			Frame.panel.setXKeyImage(x7);
			Frame.panel.setYKeyImage(y7);
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create object of Lorann
	 * @param g8
	 * @param t8
	 */
	private void setImageLorann(String g8, String t8) {
		
		Frame.panel.setXPerso(Integer.valueOf(g8));
		Frame.panel.setXpersoImage(Integer.valueOf(g8));
		
		Frame.panel.setYPerso(Integer.valueOf(t8));
		Frame.panel.setYpersoImage(Integer.valueOf(t8));
		
		try {
			Frame.panel.img[Frame.panel.getXPerso()][Frame.panel.getYPerso()] = ImageIO.read(new File(getClass().getResource("/pictures/lorann_r.png").toURI()));
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
	/**
	 * Create object of Empty
	 * @param g9
	 * @param t9
	 */
	private void setImageEmpty(String g9, String t9) {
		
		int x9 = Integer.valueOf(g9);
		int y9 = Integer.valueOf(t9);
		
		try {
			Frame.panel.img[x9][y9] = ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI()));
			Frame.panel.setImgSquare(ImageIO.read(new File(getClass().getResource("/pictures/square.png").toURI())));
			Frame.panel.coordEmptyx[x9][y9] = x9;
			Frame.panel.coordEmptyy[x9][y9] = y9;
		} catch (IOException | URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
