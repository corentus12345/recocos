package model;

import java.io.File;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
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
			}
			else if(level == 3) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level3}");
				cStmt.execute();
			}
			else if(level == 4) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level4}");
				cStmt.execute();
			}
			else if(level == 5) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level5}");
				cStmt.execute();
			}
			if(level == 1) {
				ResultSetMetaData resulMeta = result.getMetaData();
//				for(int a = 1; a <= resulMeta.getColumnCount(); a++) {
//					//System.out.print("\t" + resulMeta.getColumnName(a).toUpperCase() + "\t *");
//				}
//				//System.out.println("\n*********************************************************************************************");
				while(result.next()) {
					for(int a = 1; a <= resulMeta.getColumnCount(); a++) {
						switch (result.getObject(1).toString()) {
						case "-":
							String g = result.getObject(2).toString();
							Frame.panel.x= Integer.valueOf(g);
							String t = result.getObject(3).toString();
							Frame.panel.y = Integer.valueOf(t);
							Frame.debut = 1;
							try {
								Frame.panel.img[Frame.panel.x][Frame.panel.y] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\horizontal_bone.png"));
							} catch (IOException e) {
								e.printStackTrace();
							}
							break;
						case "|":
							String g2 = result.getObject(2).toString();
							Frame.panel.x= Integer.valueOf(g2);
							String t2 = result.getObject(3).toString();
							Frame.panel.y = Integer.valueOf(t2);
							Frame.debut = 1;
							try {
								Frame.panel.img[Frame.panel.x][Frame.panel.y] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\vertical_bone.png"));
							} catch (IOException e) {
								e.printStackTrace();
							}
						case ".":
							String g3 = result.getObject(2).toString();
							Frame.panel.x= Integer.valueOf(g3);
							String t3 = result.getObject(3).toString();
							Frame.panel.y = Integer.valueOf(t3);
							Frame.debut = 1;
							try {
								Frame.panel.img[Frame.panel.x][Frame.panel.y] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\bone.png"));
							} catch (IOException e) {
								e.printStackTrace();
							}
						case "p":
							String g4 = result.getObject(2).toString();
							Frame.panel.x= Integer.valueOf(g4);
							String t4 = result.getObject(3).toString();
							Frame.panel.y = Integer.valueOf(t4);
							Frame.debut = 1;
							try {
								Frame.panel.img[Frame.panel.x][Frame.panel.y] = ImageIO.read(new File("C:\\Users\\Corentin\\Documents\\GitHub\\recocos\\sprite\\gate_closed.png"));
							} catch (IOException e) {
								e.printStackTrace();
							}
						default:
							break;
						}
					}
					//System.out.println("\n_______________________________________________________________________________________________");
				}
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
