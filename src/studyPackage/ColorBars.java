package studyPackage;

import java.applet.Applet;
import java.awt.*;

public class ColorBars extends Applet {
	Color colors[] = {Color.black, Color.blue, Color.cyan, Color.lightGray, Color.magenta, Color.orange, Color.pink, 
		                  Color.red, Color.white, Color.yellow}; 
	public void paint(Graphics g) {
		int deltax = 260 / colors.length; 
		for(int i=0; i<colors.length; i++) {
			g.setColor(colors[i]);
			g.fillRect(i*deltax, 0, deltax, 260);
		}
	}
  }

