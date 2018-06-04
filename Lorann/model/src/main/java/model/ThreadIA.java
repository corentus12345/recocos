package model;

import java.awt.image.BufferedImage;

import view.Frame;

public class ThreadIA implements Runnable{

	@Override
	public void run() {
		try {
		for(int x = 0; x < 21; x++) {
			
			for(int y = 0; y < 16; y++) {
				
				if(Frame.panel.coordGhostx[x][y] != null && Frame.panel.coordGhosty[x][y] != null) {
						Thread.sleep(1000);
					if(Frame.panel.coordGhostx[x][y] != null  && Frame.panel.getXPerso() < Frame.panel.coordGhostx[x][y] && x - 1 == Frame.panel.coordEmptyx[x - 1][y] && Frame.panel.getXPerso() != 0) {
						
						Frame.panel.coordGhostx[x - 1][y] = x - 1;
						Frame.panel.coordGhosty[x - 1][y] = y;
						
						Frame.panel.coordGhostx[x][y] = null;
						Frame.panel.coordGhosty[x][y] = null;
						
						BufferedImage save[] = new BufferedImage[1];
						save[0] = Frame.panel.img[x - 1][y];
						Frame.panel.img[x - 1][y] = Frame.panel.img[x][y];
						Frame.panel.img[x][y] = save[0];
						
						Frame.panel.coordEmptyx[x][y] = x;
						Frame.panel.coordEmptyx[x - 1][y] = -1;
						Frame.panel.coordEmptyy[x][y] = y;
						Frame.panel.coordEmptyy[x - 1][y] = -1;
						
					}
					else if(Frame.panel.coordGhostx[x][y] != null && Frame.panel.getXPerso() > Frame.panel.coordGhostx[x][y] && x + 1 == Frame.panel.coordEmptyx[x + 1][y] && Frame.panel.getXPerso() != 0){

						Frame.panel.coordGhostx[x + 1][y] = x + 1;
						Frame.panel.coordGhosty[x + 1][y] = y;
						
						Frame.panel.coordGhostx[x][y] = null;
						Frame.panel.coordGhosty[x][y] = null;
						
						BufferedImage save[] = new BufferedImage[1];
						save[0] = Frame.panel.img[x + 1][y];
						Frame.panel.img[x + 1][y] = Frame.panel.img[x][y];
						Frame.panel.img[x][y] = save[0];
						
						Frame.panel.coordEmptyx[x][y] = x;
						Frame.panel.coordEmptyx[x + 1][y] = -1;
						Frame.panel.coordEmptyy[x][y] = y;
						Frame.panel.coordEmptyy[x + 1][y] = -1;

					}
					else if(Frame.panel.coordGhosty[x][y] != null && Frame.panel.getYPerso() < Frame.panel.coordGhosty[x][y] && y - 1 == Frame.panel.coordEmptyy[x][y - 1] && Frame.panel.getYPerso() != 0) {
						
						Frame.panel.coordGhostx[x][y - 1] = x;
						Frame.panel.coordGhosty[x][y - 1] = y - 1;
						
						Frame.panel.coordGhostx[x][y] = null;
						Frame.panel.coordGhosty[x][y] = null;
						
						BufferedImage save[] = new BufferedImage[1];
						save[0] = Frame.panel.img[x][y - 1];
						Frame.panel.img[x][y - 1] = Frame.panel.img[x][y];
						Frame.panel.img[x][y] = save[0];
						
						Frame.panel.coordEmptyx[x][y] = x;
						Frame.panel.coordEmptyy[x][y] = y;
						Frame.panel.coordEmptyx[x][y - 1] = -1;
						Frame.panel.coordEmptyy[x][y - 1] = -1;
						
					}
					else if(Frame.panel.coordGhosty[x][y] != null && Frame.panel.getYPerso() > Frame.panel.coordGhosty[x][y] && y + 1 == Frame.panel.coordEmptyy[x][y + 1] && Frame.panel.getYPerso() != 0) {
						
						Frame.panel.coordGhostx[x][y + 1] = x;
						Frame.panel.coordGhosty[x][y + 1] = y + 1;
						
						Frame.panel.coordGhostx[x][y] = null;
						Frame.panel.coordGhosty[x][y] = null;
						
						BufferedImage save[] = new BufferedImage[1];
						save[0] = Frame.panel.img[x][y + 1];
						Frame.panel.img[x][y + 1] = Frame.panel.img[x][y];
						Frame.panel.img[x][y] = save[0];
						
						Frame.panel.coordEmptyx[x][y] = x;
						Frame.panel.coordEmptyy[x][y] = y;
						Frame.panel.coordEmptyx[x][y + 1] = -1;
						Frame.panel.coordEmptyy[x][y + 1] = -1;
						
					}
				}
			}
		}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
