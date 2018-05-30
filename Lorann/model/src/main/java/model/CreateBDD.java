package model;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CreateBDD {
	
	public CreateBDD() {
		for(int level = 1; level <= 5; level++) {
			ArrayList<String> list = new ArrayList<String>();
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection cnx = DriverManager.getConnection(
						"jdbc:mysql://localhost:3306/lorann?autoReconnect=true&useSSL=false&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
						"root", "");
				Statement stmt = cnx.createStatement();
				if(level == 1) {
					
					InputStream is = new FileInputStream("C:/Users/Corentin/Desktop/CesiEXIA/Java/Level/Level1.txt");
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
					String ligne;
	
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					buff.close();
					stmt.executeUpdate("DROP TABLE lorann.level");
					stmt.executeUpdate("CREATE TABLE level( ID int not null auto_increment, Type_de_structure varchar(100) not null, X int(11) NOT NULL, Y int(11) NOT NULL, Numero_du_niveau int(5) NOT NULL, primary key (ID))");
					
				}
				else if(level == 2) {
					InputStream is = new FileInputStream("C:/Users/Corentin/Desktop/CesiEXIA/Java/Level/Level2.txt");
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
					String ligne;
	
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					buff.close();
				}
				else if(level == 3) {
					InputStream is = new FileInputStream("C:/Users/Corentin/Desktop/CesiEXIA/Java/Level/Level3.txt");
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
					String ligne;
	
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					buff.close();
				}
				else if(level == 4) {
					InputStream is = new FileInputStream("C:/Users/Corentin/Desktop/CesiEXIA/Java/Level/Level4.txt");
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
					String ligne;
	
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					buff.close();
				}
				else if(level == 5) {
					InputStream is = new FileInputStream("C:/Users/Corentin/Desktop/CesiEXIA/Java/Level/Level5.txt");
					InputStreamReader lire = new InputStreamReader(is);
					BufferedReader buff = new BufferedReader(lire);
					String ligne;
	
					while ((ligne = buff.readLine()) != null) {
						list.add(ligne);
					}
					buff.close();
				}
	
				int x, y;
				for (y = 0; y <= 16; y++) {
					String temp = list.get(y);
	
					for (x = 0; x <= 21; x++) {
	
						char sprite = temp.charAt(x);
	
						switch (sprite) {
						case '|':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\"|\","
									+ x + "," + y + ","  + level + ")");
							break;
						case ' ':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\" \","
									+ x + "," + y + ","  + level + ")");
							break;
						case 'X':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\"X\","
									+ x + "," + y + ","  + level + ")");
							break;
						case '-':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\"-\","
									+ x + "," + y + ","  + level + ")");
							break;
						case '.':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\".\","
									+ x + "," + y + ","  + level + ")");
							break;
						case 'i':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\"i\","
									+ x + "," + y + ","  + level + ")");
							break;
						case 'o':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\"o\","
									+ x + "," + y + ","  + level + ")");
							break;
						case 'H':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\"H\","
									+ x + "," + y + ","  + level + ")");
							break;
						case 'p':
							stmt.executeUpdate("INSERT INTO level(Type_de_structure, X, Y, Numero_du_niveau) VALUES(\"p\","
									+ x + "," + y + ","  + level + ")");
							break;
						default:
							break;
						}
					}
				}
				stmt.close();
				cnx.close();
				list.clear();
			} catch (ClassNotFoundException | SQLException | IOException e) {
				e.printStackTrace();
			}
		}
	}
}
