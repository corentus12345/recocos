package model;

import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.imageio.ImageIO;

import view.Frame;

public class HaveBDD {
	private ResultSet result;
	
	public HaveBDD(int level) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cnx = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");
			if(level == 1) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level1}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}
			else if(level == 2) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level2}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}
			else if(level == 3) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level3}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}
			else if(level == 4) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level4}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}
			else if(level == 5) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level5}");
				cStmt.execute();
				result = cStmt.executeQuery();
			}
			while(result.next()) {
				String test = result.getObject(1).toString();
				System.out.println(test);
				switch (test) {
				case "-":
					String g = result.getObject(2).toString();
					int x = Integer.valueOf(g);
					String t = result.getObject(3).toString();
					int y = Integer.valueOf(t);
					Frame.debut = 1;
					try {
						Frame.panel.img[x][y] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\horizontal_bone.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case "|":
					String g2 = result.getObject(2).toString();
					int x2 = Integer.valueOf(g2);
					String t2 = result.getObject(3).toString();
					int y2 = Integer.valueOf(t2);
					Frame.debut = 1;
					try {
						Frame.panel.img[x2][y2] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\vertical_bone.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case ".":
					String g3 = result.getObject(2).toString();
					int x3 = Integer.valueOf(g3);
					String t3 = result.getObject(3).toString();
					int y3 = Integer.valueOf(t3);
					Frame.debut = 1;
					try {
						Frame.panel.img[x3][y3] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\bone.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
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
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				case "H":
					String g8 = result.getObject(2).toString();
					int x8 = Integer.valueOf(g8);
					String t8 = result.getObject(3).toString();
					int y8 = Integer.valueOf(t8);
					Frame.debut = 1;
					try {
						Frame.panel.img[x8][y8] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\lorann_r.png"));
					} catch (IOException e) {
						e.printStackTrace();
					}
					break;
				default:
					break;
				}
			}
		Frame.panel.repaint();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
