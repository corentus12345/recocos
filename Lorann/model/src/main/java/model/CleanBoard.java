package model;

import view.Frame;

public class CleanBoard {
	
	public CleanBoard() {
		for(int x = 0; x < 22; x++) {
			for(int y = 0; y < 17; y++) {
				Frame.panel.img[x][y] = null;
				Frame.panel.coordDoorx[x][y] = -1;
				Frame.panel.coordDoory[x][y] = -1;
				Frame.panel.coordEmptyx[x][y] = -1;
				Frame.panel.coordEmptyy[x][y] = -1;
				Frame.panel.coordItemx[x][y] = -1;
				Frame.panel.coordItemy[x][y] = -1;
				Frame.panel.coordKeyx[x][y] = -1;
				Frame.panel.coordKeyy[x][y] = -1;
				Frame.panel.coordGhostx[x][y] = null;
				Frame.panel.coordGhosty[x][y] = null;
				Frame.key = false;
			}
		}
	}
}
