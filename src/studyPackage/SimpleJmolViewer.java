package studyPackage;


import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.biojava.bio.structure.Structure;
import org.biojava.bio.structure.io.PDBFileReader;
import org.jmol.adapter.smarter.SmarterJmolAdapter;
import org.jmol.api.JmolAdapter;
import org.jmol.api.JmolSimpleViewer;
import org.biojava.bio.structure.gui.*;




public class SimpleJmolViewer {
	
	public static void main(String[] args){
		try {
 
			PDBFileReader pdbr = new PDBFileReader();   
 
			pdbr.setPath("/Path/To/PDBFiles/");
 
			String pdbCode = "5pti";
 
			Structure struc = pdbr.getStructureById(pdbCode);
 
			BiojavaJmol jmolPanel = new BiojavaJmol();
 
			jmolPanel.setStructure(struc);
 
			// send some RASMOL style commands to Jmol
			jmolPanel.evalString("select * ; color chain;");
			jmolPanel.evalString("select *; spacefill off; wireframe off; backbone 0.4;  ");
 
		} catch (Exception e){
			e.printStackTrace();
		}
	}
}
