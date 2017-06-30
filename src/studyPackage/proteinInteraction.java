package studyPackage;

import org.biojava.bio.structure.Atom;
import org.biojava.bio.structure.Structure;
import org.biojava.bio.structure.StructureTools;
import org.biojava.bio.structure.align.StructureAlignment;
import org.biojava.bio.structure.align.StructureAlignmentFactory;
import org.biojava.bio.structure.align.fatcat.FatCatRigid;
import org.biojava.bio.structure.align.fatcat.calc.FatCatParameters;
import org.biojava.bio.structure.align.model.AFPChain;
import org.biojava.bio.structure.align.util.AtomCache;
import org.biojava.bio.structure.align.gui.StructureAlignmentDisplay;

public class proteinInteraction  {
	public static void main(String[] args) throws Exception{
		String proteinName1 = "3hhb.C";
		String proteinName2 = "3hhb.D";
		AtomCache cache = new AtomCache(); 
		Structure proteinStructure1 = null;
		Structure proteinStructure2 = null;
		StructureAlignment algorithm = StructureAlignmentFactory.getAlgorithm(FatCatRigid.algorithmName);
		proteinStructure1 = cache.getStructure(proteinName1);
		proteinStructure2 = cache.getStructure(proteinName2);
		Atom[] cacheProtein1 = StructureTools.getAtomCAArray(proteinStructure1);
		Atom[] cacheProtein2 = StructureTools.getAtomCAArray(proteinStructure2);
		FatCatParameters fatcatParameter = new FatCatParameters(); 
		AFPChain chainProtein = algorithm.align(cacheProtein1, cacheProtein2, fatcatParameter);
		chainProtein.setName1(proteinName1);
		chainProtein.setName2(proteinName2);
		StructureAlignmentDisplay.display(chainProtein, cacheProtein1, cacheProtein2);
	}
}

	   