package studyPackage;

import java.applet.Applet;
import java.awt.*;

public class FontDemo extends Applet {
	public void paint(Graphics g) {
		int baseline = 100;
		g.setColor(Color.red);
		g.drawLine(0, baseline,400, baseline);
		g.setFont(new Font("Serif", Font.BOLD, 36));
		g.setColor(Color.black);
		g.drawString("Wxyz", 100, baseline);
	}
	
}
