package studyPackage;

import org.biojava.bio.symbol.*;
import org.biojava.bio.seq.*;

public class Translation {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	try	{
	//create a DNA SymbolList
	SymbolList symL = DNATools.createDNA("atggccattgaatgaatggccattgaatga");
	//transcribe to RNA
	symL = RNATools.transcribe(symL);
	//translate to protein
	symL = RNATools.translate(symL);
	//prove that it worked
	System.out.println(symL.seqString());
	} catch (Exception ex) { ex.printStackTrace();}
	}
}
