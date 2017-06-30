package studyPackage;

import org.biojava.bio.seq.DNATools;
import org.biojava.bio.symbol.FiniteAlphabet;
import org.biojava.bio.symbol.Symbol;

import java.util.Iterator;


public class showSymbolNucleotide {
	
	public static void main(String[] args) {
		
		FiniteAlphabet dna = DNATools.getDNA();
		Iterator dnaSymbol = dna.iterator(); 
		
		while(dnaSymbol.hasNext()) {
			
			Symbol s = (Symbol) dnaSymbol.next();
			System.out.println(s.getName());
		}
		
		
	
	}

}
