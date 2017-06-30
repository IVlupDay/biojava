package studyPackage;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import org.biojava.bio.gui.sequence.*;
import org.biojava.bio.seq.*;
import org.biojava.bio.symbol.*;


public class GraphicalViewer extends JFrame{
	
	  private Sequence seq;
	  private JPanel jPanel = new JPanel();
	  private SequencePanel seqPanel = new SequencePanel();
	  private SequenceRenderer symSeqRenderer = new SymbolSequenceRenderer();
	 
	  public GraphicalViewer() {
	    try {
	      //create the sequence to display
	      seq = RNATools.createRNASequence("accggcgcgagauuugcagcgcgcgcgcaucgcg"+
	                                       "gggcgcauuaccagacuucauucgacgacucagc", "rna1");
	      init();
	    }
	    catch(Exception e) {
	      e.printStackTrace();
	    }
	 
	  }
	 
	  /**
	   * Set up the components to display the graphics
	   */
	  private void init() throws Exception {
	    this.getContentPane().setLayout(new BorderLayout());
	    this.getContentPane().add(jPanel, BorderLayout.CENTER);
	    this.setTitle("SeqView");
	    jPanel.add(seqPanel, BorderLayout.CENTER);
	 
	    //set the sequence to display
	    seqPanel.setSequence(seq);
	 
	    //set the object responsible for painting the sequence
	    seqPanel.setRenderer(symSeqRenderer);
	 
	    //the amount of sequence to display
	    seqPanel.setRange(new RangeLocation(1,seq.length()));
	  }
	 
	  /**
	   * Overide this to close the program when the window closes.
	   */
	  protected void processWindowEvent(WindowEvent we){
	    if (we.getID() == WindowEvent.WINDOW_CLOSING) {
	      System.exit(0);
	    }
	    else {
	      super.processWindowEvent(we);
	    }
	 }
	  
	  public static void main(String[] args) {
			GraphicalViewer seqView = new GraphicalViewer();
		    seqView.pack();
		    seqView.show();
		  }
  }
