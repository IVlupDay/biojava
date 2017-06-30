package studyPackage;


import java.net.URL;

import org.biojava3.alignment.Alignments;
import org.biojava3.alignment.Alignments.PairwiseSequenceAlignerType;
import org.biojava3.alignment.SimpleGapPenalty;
import org.biojava3.alignment.SimpleSubstitutionMatrix;
import org.biojava3.alignment.template.SequencePair;
import org.biojava3.core.sequence.ProteinSequence;
import org.biojava3.core.sequence.compound.AminoAcidCompound;
import org.biojava3.core.sequence.io.FastaReaderHelper;

public class aligmentSequence {
	
	public static void main(String[] args) throws Exception{
		
		   align("Q21691", "Q21495", PairwiseSequenceAlignerType.LOCAL);
		   // align("Q21691", "Q21495", PairwiseSequenceAlignerType.GLOBAL);
	}
	
	protected static void align(String uniProtID_1, String uniProtID_2, PairwiseSequenceAlignerType alignmentType) throws Exception {
		
		  ProteinSequence proteinSeq1 = FastaReaderHelper.readFastaProteinSequence((new URL(String.format
			                ("http://www.uniprot.org/uniprot/%s.fasta", uniProtID_1))).openStream()).get(uniProtID_1);
		    
		  ProteinSequence proteinSeq2 = FastaReaderHelper.readFastaProteinSequence((new URL(String.format
			                ("http://www.uniprot.org/uniprot/%s.fasta", uniProtID_2))).openStream()).get(uniProtID_2);
	 
	      SequencePair<ProteinSequence, AminoAcidCompound> result = Alignments.getPairwiseAlignment(proteinSeq1, proteinSeq2,
	                    	alignmentType, new SimpleGapPenalty(), new SimpleSubstitutionMatrix<AminoAcidCompound>());
	       	
		  System.out.println(result.toString());
	}

}
