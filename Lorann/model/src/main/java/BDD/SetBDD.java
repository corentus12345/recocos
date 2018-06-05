package BDD;

import java.sql.ResultSet;
import java.sql.SQLException;

import decorations.Door;
import decorations.Empty;
import decorations.Item;
import decorations.Key;
import decorations.Lorann;
import decorations.Monster;
import decorations.WallCorner;
import decorations.WallHorizontal;
import decorations.WallVertical;
import model.Sound;
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
					
					new WallHorizontal(g, t);
					
					break;
				case "|":
					String g2 = result.getObject(2).toString();
					String t2 = result.getObject(3).toString();
					
					new WallVertical(g2, t2);
					
					break;
				case ".":
					String g3 = result.getObject(2).toString();
					String t3 = result.getObject(3).toString();
					
					new WallCorner(g3, t3);
					
					break;
				case "p":
					String g4 = result.getObject(2).toString();
					String t4 = result.getObject(3).toString();
					
					new Door(g4, t4);
					
					break;
				case "X":
					String g5 = result.getObject(2).toString();
					String t5 = result.getObject(3).toString();
					
					new Monster(g5, t5);
					
					break;
				case "i":
					String g6 = result.getObject(2).toString();
					String t6 = result.getObject(3).toString();
					
					new Item(g6, t6);
					
					break;
				case "o":
					String g7 = result.getObject(2).toString();
					String t7 = result.getObject(3).toString();
					
					new Key(g7, t7);
					
					break;
				case "H":
					String g8 = result.getObject(2).toString();
					String t8 = result.getObject(3).toString();
					
					new Lorann(g8, t8);
					
					break;
				case " ":
					String g9 = result.getObject(2).toString();
					String t9 = result.getObject(3).toString();
					
					new Empty(g9, t9);
				default:
					break;
				}		
			}
			
			Frame.debut = 1;
			new Thread(new Sound()).start();
			Frame.panel.repaint();
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
