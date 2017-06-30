package studyPackage;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Applet implements MouseListener {
       public void init() {
    	   addMouseListener(this);
       }
       public void mouseClicked(MouseEvents me) {
    	   setBackground(Color.blue);
    	   repaint(); 
       }
       public void mouseEntered(MouseEvent me) {
    	   setBackground(Color.green);
    	   repaint();
       }
       public void mouseExited(MouseEvent me) {
    	   setBackground(Color.red);
    	   repaint();
       }
       public void mousePressed(MouseEvent me) {
    	   setBackground(Color.white);
    	   repaint(); 
       }
       public void mouseReleased(MouseEvent me) {
    	   setBackground(Color.yellow);
    	   repaint();
       }
       
	
}
