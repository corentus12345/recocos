package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HaveBDD {
	private int id;
	public HaveBDD(int level) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cnx = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");
			if(level == 1) {
				CallableStatement cStmt = cnx.prepareCall("{CALL Level1}");
				cStmt.execute();
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
			CallableStatement cStmt2 = cnx.prepareCall("{CALL CountLigne(" + level + ")}");
			ResultSet rs = cStmt2.executeQuery();
			cStmt2.execute();
			while (rs.next()) {
				id = rs.getInt(1);
			}
			System.out.print(id);
			for(int i = ((id * level) - id); i <= id * level; i++) {
				//Créer les image sprite
			}
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
