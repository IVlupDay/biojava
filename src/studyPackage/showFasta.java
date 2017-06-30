package studyPackage;

import org.biojava3.data.sequence.*; 

public class showFasta {
	
	public static void main(String[] args) {
		
		FastaSequence fSequence = new FastaSequence("chr1", "ATCGGATTCCATCCGGATCGGAGATCCGGATCGGATTCCGATCCGG");
		printFasta(fSequence);
	}
	
   public static void printFasta(FastaSequence fastaFile) {
	   
	   System.out.println(fastaFile);
    }
}
	
	