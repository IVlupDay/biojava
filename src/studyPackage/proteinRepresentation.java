package studyPackage;

import org.biojava3.core.sequence.compound.*;
import org.biojava3.core.sequence.loader.*;
import org.biojava3.core.sequence.*;


public class proteinRepresentation {
	public static void main(String[] args) {
		String proteinId = "P2661";
		try {
			AminoAcidCompoundSet set = AminoAcidCompoundSet.getAminoAcidCompoundSet(); 
			UniprotProxySequenceReader <AminoAcidCompound> sequenceProteinLoad = new UniprotProxySequenceReader
					                   <AminoAcidCompound> (proteinId, set);
			ProteinSequence sequenceProtein = new ProteinSequence(sequenceProteinLoad);
			// System.out.println(sequenceProteinLoad);
			System.out.println(sequenceProtein);
		} catch(Exception e) {e.printStackTrace();}
	}
}


