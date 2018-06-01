package BDD;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;


public class HaveBDD {
	private ResultSet result;
	private CallableStatement cStmt;
	
	public HaveBDD(int level) {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection cnx = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
					"root", "");
			
			if(level == 1) {
				
				cStmt = cnx.prepareCall("{CALL Level1}");
				cStmt.execute();
				result = cStmt.executeQuery();
				
			}
			else if(level == 2) {
				
				cStmt = cnx.prepareCall("{CALL Level2}");
				cStmt.execute();
				result = cStmt.executeQuery();
				
			}
			else if(level == 3) {
				
				cStmt = cnx.prepareCall("{CALL Level3}");
				cStmt.execute();
				result = cStmt.executeQuery();
				
			}
			else if(level == 4) {
				
				cStmt = cnx.prepareCall("{CALL Level4}");
				cStmt.execute();
				result = cStmt.executeQuery();
				
			}
			else if(level == 5) {
				
				cStmt = cnx.prepareCall("{CALL Level5}");
				cStmt.execute();
				result = cStmt.executeQuery();
				
			}
			
			new SetBDD(result);
			
			result.close();
			cStmt.close();
			cnx.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
}
