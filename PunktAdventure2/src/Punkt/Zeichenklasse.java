package Punkt;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JLabel;


public class Zeichenklasse extends JLabel {
	
		protected void paintComponent(Graphics g){
			super.paintComponent(g);
			Graphics2D g2d = (Graphics2D) g;
			g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
			
			if(Variablen.isRunning == true && Variablen.notGameOver == true){
				
			g.drawImage(Variablen.gras, Variablen.wieseX1, Variablen.wieseY1, 600, Variablen.height, null);
			g.drawImage(Variablen.gras, Variablen.wieseX2, Variablen.wieseY2, 600, Variablen.height, null);
			g.drawImage(Variablen.gras, Variablen.wieseX3, Variablen.wieseY3, 600, Variablen.height, null);
				
			g.drawImage(Variablen.wolkig2, Variablen.himmelX, Variablen.himmelY, 820, Variablen.height-150, null);
			g.drawImage(Variablen.wolkig2, Variablen.himmelX2, Variablen.himmelY2, 820, Variablen.height-150, null);
			
			g.drawImage(Variablen.i1, Variablen.punktX, Variablen.punktY, 110, 110, null);
			
			if(Variablen.stand == true){
			g.drawImage(Variablen.mega1, Variablen.megaX1, 200, 80, 80, null);
			}
			else{
			g.drawImage(Variablen.mega2, Variablen.megaX2, 200, 80, 80, null);
			}
			
			repaint();
			}	
			
			else{
				g.drawImage(Variablen.wolkig2, 0, 0, 800, 450, null);
				g.drawImage(Variablen.gras, 0, 450, 400, 200, null);
				g.drawImage(Variablen.gras, 400, 450, 400, 200, null);
				g.drawImage(Variablen.i1, Variablen.punktX, Variablen.punktY, 110, 110, null);

				repaint();
			}
	}
}
