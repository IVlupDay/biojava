package studyPackage;

import java.applet.Applet;
import java.awt.Graphics;

public class FirstApplet extends Applet{
	
	String str = "";
	public void init() {
		str += "init;";
	}
	
	public void start() {
		str +="start;";
	}
	
	public void stop() {
		str +="stop;";
	}
	
	public void destroy () {
		System.out.println("Destroy");
	}
	
	public void paint(Graphics g) {
		g.drawString(str, 10, 25);
	}
	/*
	public void pain(Graphics g) {
		// g.drawString("This is my frist applet", 30, 100);
		// g.drawLine(10, 10, 180, 110);
		String str = "";
		
		} */
	}

