package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

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
				for(int a = 1; a <= resulMeta.getColumnCount(); a++) {
					//System.out.print("\t" + resulMeta.getColumnName(a).toUpperCase() + "\t *");
				}
				//System.out.println("\n*********************************************************************************************");
				while(result.next()) {
					for(int a = 1; a <= resulMeta.getColumnCount(); a++) {
						switch (result.getObject(a).toString()) {
						case "-":
								String g = result.getObject(2).toString();
								int x = Integer.valueOf(g);
								String t = result.getObject(3).toString();
								int y = Integer.valueOf(t);
								Frame.debut = 1;
								Frame.panel.setXWallHorizontal(x);
								Frame.panel.setYWallHorizontal(y);
							break;

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
