package studyPackage;

import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;

public class JTextAreaEvents extends JApplet {
	JTextArea ta; 
	JLabel label; 
	public void init() {
		getContentPane().setLayout(new FlowLayout());
		label = new JLabel("Event Type");
		ta = new JTextArea(10, 20);
		ta.getDocument().addDocumentListener(new DocumentListener() {
			public void changedUpdate(DocumentEvent de) {
				label.setText("changedUpdate");
			}
		    public void inserUpdate(DocumentEvent de) {
		    	label.setText("insertUpdate");
		    }
		    public void removeUpdate(DocumentEvent de) {
		    	label.setText("removeUpdate");
		    }
 		});
		
		getContentPane().add(label);
		getContentPane().add(ta);
 		
	}
	
}
