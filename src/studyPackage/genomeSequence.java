package studyPackage;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Collection;
import java.util.LinkedHashMap;

import org.biojava3.core.sequence.ChromosomeSequence;
import org.biojava3.core.sequence.GeneSequence;
import org.biojava3.core.sequence.ProteinSequence;
import org.biojava3.core.sequence.io.FastaWriterHelper;
import org.biojava3.genome.GeneFeatureHelper;
import org.biojava3.genome.parsers.gff.GFF3Writer;

public class genomeSequence {
	
	public static void main(String[] args) throws Exception {
		
		LinkedHashMap<String, ChromosomeSequence> chromosomeSequenceList = 
				     GeneFeatureHelper.loadFastaAddGeneFeaturesFromGeneMarkGTF(new File("454Scaffolds.fna"), new File("genemark_hmm.gtf"));
		LinkedHashMap<String, ProteinSequence> proteinSequenceList = GeneFeatureHelper.getProteinSequences(chromosomeSequenceList.values());
		FastaWriterHelper.writeProteinSequence(new File("genemark_proteins.faa"), proteinSequenceList.values());
			
		LinkedHashMap<String, GeneSequence> geneSequenceHashMap = GeneFeatureHelper.getGeneSequences(chromosomeSequenceList.values());
		Collection<GeneSequence> geneSequences = geneSequenceHashMap.values();
		FastaWriterHelper.writeGeneSequence(new File("genemark_genes.fna"), geneSequences, true);
			
		/*
		FileOutputStream fo = new FileOutputStream("genemark.gff3");
		GFF3Writer gff3Writer = new GFF3Writer();
		gff3Writer.write(fo, chromosomeSequenceList);
		fo.close(); */
	}

}
