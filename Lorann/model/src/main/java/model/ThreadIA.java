package model;

import view.Frame;

public class ThreadIA implements Runnable{

	@Override
	public void run() {
		
		for(int x = 0; x < 22; x++) {
			
			for(int y = 0; y < 17; y++) {
				
				if(Frame.panel.coordGhostx[x][y] != null && Frame.panel.coordGhosty[x][y] != null) {
					
					if(Frame.panel.getXPerso() < Frame.panel.coordGhostx[x][y] && x - 1 == Frame.panel.coordEmptyx[x - 1][y] && Frame.panel.getXPerso() != 0) {
						
						System.out.println(Frame.panel.getXPerso() + "   " + Frame.panel.coordGhostx[x][y] + "   " + x + "    " + y);
						Frame.panel.coordGhostx[x - 1][y] = x - 1;
						Frame.panel.coordGhosty[x - 1][y] = y;
						
						Frame.panel.coordGhostx[x][y] = null;
						Frame.panel.coordGhosty[x][y] = null;
						
						Frame.panel.img[x - 1][y] = Frame.panel.img[x][y];
						Frame.panel.img[x][y] = Frame.panel.getImgEmpty();
						
						Frame.panel.coordEmptyx[x - 1][y] = x - 1;
						Frame.panel.coordEmptyx[x][y] = -1;
						
					}
//					else if(Frame.panel.getXPerso() > Frame.panel.coordGhostx[x][y] && x + 1 == Frame.panel.coordEmptyx[x + 1][y]){
//						
//						Frame.panel.coordGhostx[x + 1][y] = x + 1;
//						Frame.panel.coordGhosty[x + 1][y] = y;
//						
//						Frame.panel.coordGhostx[x][y] = null;
//						Frame.panel.coordGhosty[x][y] = null;
//						
//						Frame.panel.img[x + 1][y] = Frame.panel.img[x][y];
//						Frame.panel.img[x][y] = Frame.panel.getImgEmpty();
//						
//						Frame.panel.coordEmptyx[x + 1][y] = x + 1;
//						Frame.panel.coordEmptyx[x][y] = -1;
//
//					}
				}
			}
		}
	}
}
