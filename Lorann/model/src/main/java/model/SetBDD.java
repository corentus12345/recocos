package model;

import java.io.File;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.imageio.ImageIO;

import view.Frame;

public class SetBDD {
	
	public SetBDD(ResultSet result) {
		try {
			while(result.next()) {
				
				String test = result.getObject(1).toString();
				
				switch (test) {
				case "-":		
					String g = result.getObject(2).toString();		
					String t = result.getObject(3).toString();
					
					Frame.debut = 1;
					
					new WallHorizontal(g, t);
					
					break;
				case "|":
					String g2 = result.getObject(2).toString();
					String t2 = result.getObject(3).toString();
					
					
					Frame.debut = 1;
					
					new WallVertical(g2, t2);
					
					break;
				case ".":
					String g3 = result.getObject(2).toString();
					String t3 = result.getObject(3).toString();
					
					
					Frame.debut = 1;
					
					new WallCorner(g3, t3);
					
					break;
				case "p":
					String g4 = result.getObject(2).toString();
					int x4 = Integer.valueOf(g4);
					String t4 = result.getObject(3).toString();
					int y4 = Integer.valueOf(t4);
					
					Frame.debut = 1;
					
					try {
						Frame.panel.img[x4][y4] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\gate_closed.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case "X":
					String g5 = result.getObject(2).toString();
					int x5 = Integer.valueOf(g5);
					String t5 = result.getObject(3).toString();
					int y5 = Integer.valueOf(t5);
					
					Frame.debut = 1;
					
					try {
						Frame.panel.img[x5][y5] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\monster_1.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case "i":
					String g6 = result.getObject(2).toString();
					int x6 = Integer.valueOf(g6);
					String t6 = result.getObject(3).toString();
					int y6 = Integer.valueOf(t6);
					
					Frame.debut = 1;
					
					try {
						Frame.panel.img[x6][y6] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\purse.png"));
						Frame.panel.coordItemx[x6][y6] = x6;
						Frame.panel.coordItemy[x6][y6] = y6;
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case "o":
					String g7 = result.getObject(2).toString();
					int x7 = Integer.valueOf(g7);
					String t7 = result.getObject(3).toString();
					int y7 = Integer.valueOf(t7);
					
					Frame.debut = 1;
					
					try {
						Frame.panel.img[x7][y7] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\crystal_ball.png"));
						Frame.panel.coordKeyx[x7][y7] = x7;
						Frame.panel.coordKeyx[x7][y7] = y7;
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case "H":
					String g8 = result.getObject(2).toString();
					Frame.panel.setXPerso(Integer.valueOf(g8));
					Frame.panel.setXpersoImage(Integer.valueOf(g8));
					String t8 = result.getObject(3).toString();
					Frame.panel.setYPerso(Integer.valueOf(t8));
					Frame.panel.setYpersoImage(Integer.valueOf(t8));
					
					Frame.debut = 1;
					
					try {
						Frame.panel.img[Frame.panel.getXPerso()][Frame.panel.getYPerso()] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\lorann_r.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				default:
					break;
				}
				Frame.panel.repaint();
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
