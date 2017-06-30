package studyPackage;

import java.applet.Applet;
import java.awt.*;

public class Dots extends Applet implements Runnable{
	Thread t; 
	public void init() {
		t = new Thread(this);
		t.start();
	}
	
	public void run() {
		try {
			while(true) {
				repaint();
				Thread.sleep(10);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void update(Graphics g) {
		Dimension d = getSize(); 
		int x = (int)(Math.random()*d.width);
		int y = (int)(Math.random()*d.height);
		g.fillRect(x, y, 4, 4);
	}
}
