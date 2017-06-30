package studyPackage;

import org.biojava3.ronn.*;
import org.biojava3.data.sequence.*;


public class disorderSearch {
	
	public static void main(String[] args) {
		
		FastaSequence fsequence = new FastaSequence("4hhc.C", "LLRGRHLMNGTMIMRPWNFLNDHHFPKFFPHLIEQQAIWLADWWRKKHC" +
				                                    "RPLPTRAPTMDQWDHFALIQKHWTANLWFLTFPFNDKWGWIWFLKDWTPGSADQAQRACTWFFCHGHDTN");
        float[]	rawProbabilityScores = Jronn.getDisorderScores(fsequence);
   
        for (int i=0; i<=rawProbabilityScores.length-1; i++) {
    	     
        	 System.out.print(rawProbabilityScores[i]+" - ");
		
         }
    
	 }

 }
