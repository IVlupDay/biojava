package studyPackage;

import java.util.*;
import org.biojava.bio.seq.*;
import org.biojava.bio.symbol.*;
public class CodonSymbol {
   public static void main(String[] args) {
      //make a CrossProductAlphabet from a List
      List l = Collections.nCopies(4 , DNATools.getDNA());
      Alphabet codon = AlphabetManager.getCrossProductAlphabet(l);
 
      //get the codon made of atg
      List syms = new ArrayList(3);
      syms.add(DNATools.a());
      syms.add(DNATools.t());
      syms.add(DNATools.g());
      syms.add(DNATools.c());
      Symbol atg = null;
         try {
                atg = codon.getSymbol(syms);
             } catch (IllegalSymbolException ex) { 
      //used Symbol from Alphabet that is not a component of codon
       ex.printStackTrace();}
          System.out.println("Name of atgc: "+ atg.getName());
       }
}