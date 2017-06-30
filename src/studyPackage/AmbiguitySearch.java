package studyPackage;

//Biojava imports
import org.biojava.bio.seq.DNATools;
import org.biojava.bio.symbol.FiniteAlphabet;
import org.biojava.bio.symbol.SymbolList;
import org.biojava.utils.regex.Matcher;
import org.biojava.utils.regex.Pattern;
import org.biojava.utils.regex.PatternFactory;

public class AmbiguitySearch {
	public static void main(String[] args) {
	  
		try{ 
			
			Matcher occurances; 
			FiniteAlphabet searchString = DNATools.getDNA(); 
			SymbolList fileSearch = DNATools.createDNA("TATTCAAATGTCAACACTAAGCAAGCGCAGGAATTTAGTTGAGTCCAGGTAACTTTGCCCAGTCCCTTCCCGTCCCCCACCTCCAG");
			Pattern pattern; 
			PatternFactory filePreparation = PatternFactory.makeFactory(searchString);
			try{
				pattern = filePreparation.compile("att");
			 } catch(Exception e) {e.printStackTrace();return;}
             System.out.println("Finding position of "+pattern.patternAsString()+"\n");
             try{
            	 occurances = pattern.matcher(fileSearch);
             } catch(Exception e) {e.printStackTrace(); return;}
             while(occurances.find()) {
            	 System.out.println("Found motif on sequence: "+"\t\t\t"+ /*fileSearch.seqString()+"\n"+ */occurances.start()+
            			            "\t\t\t\t"+occurances.group().seqString());
             }
			 
		} catch (Exception e) {e.printStackTrace(); System.exit(1);}
	
	}
 }
