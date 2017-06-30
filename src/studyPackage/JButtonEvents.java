package studyPackage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JButtonEvents extends JApplet implements ActionListener {
	JLabel label; 
	public void init() {
		getContentPane().setLayout(new FlowLayout());
		
		JButton b1 = new JButton("Apple");
		b1.addActionListener(this);
		getContentPane().add(b1);
		
		JButton b2 = new JButton("Banana");
		b2.addActionListener(this);
		getContentPane().add(b2);
		
		JButton b3 = new JButton("Orange");
		b3.addActionListener(this);
		getContentPane().add(b3);
		
		label = new JLabel("");
		getContentPane().add(label);
	}
	public void actionPerformed(ActionEvent ae) {
		label.setText(ae.getActionCommand());
	}
}    
      