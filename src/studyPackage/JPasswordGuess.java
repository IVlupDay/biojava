package studyPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JPasswordGuess extends JApplet { 
	JLabel label = new JLabel("Guess"); 
	JPasswordField question = new JPasswordField("secret", 16);
	JTextField ans = new JTextField(16);
	
	public void init() {
		JButton button = new JButton("Guess");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				if(new String(question.getPassword()).equals(ans.getText())) {
					label.setText("You win!");
				}
				else {
					label.setText("You miss!");
				}
			}
		});
		
		getContentPane().add(label);
		getContentPane().add(question);
		getContentPane().add(ans);
		getContentPane().add(button);
	}

}
