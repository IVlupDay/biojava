package studyPackage;

import org.biojava.bio.structure.ResidueNumber;
import org.biojava.bio.structure.Structure;
import org.biojava.bio.structure.io.PDBFileReader;
import org.biojava3.protmod.ProteinModificationRegistry;
import org.biojava3.protmod.structure.ModifiedCompound;
import org.biojava3.protmod.structure.ProteinModificationIdentifier;
import org.biojava3.protmod.structure.StructureGroup;
import java.util.*;

public class biojavaStudy {
	
	public static void main(String[] args) {
		 try {
             PDBFileReader reader = new PDBFileReader();
             reader.setAutoFetch(true);

             // identify all modificaitons from PDB:1CAD and print them
             String pdbId = "1CAD";
             Structure struc = reader.getStructureById(pdbId);
             Set<ModifiedCompound> mcs = identifyAllModfications(struc);
             for (ModifiedCompound mc : mcs) {
                     System.out.println(mc.toString());
             }

             // identify all phosphosites from PDB:3MVJ and print them
             pdbId = "3MVJ";
             struc = reader.getStructureById(pdbId);
             List<ResidueNumber> psites = identifyPhosphosites(struc);
             for (ResidueNumber psite : psites) {
                     System.out.println(psite.toString());
             }
     } catch(Exception e) {
             e.printStackTrace();
     }
  }

	public static List<ResidueNumber> identifyPhosphosites(Structure struc) {
		List<ResidueNumber> phosphosites = new ArrayList<ResidueNumber>();
        ProteinModificationIdentifier parser = new ProteinModificationIdentifier();
        parser.identify(struc, ProteinModificationRegistry.getByKeyword("phosphoprotein"));
        Set<ModifiedCompound> mcs = parser.getIdentifiedModifiedCompound();
        for (ModifiedCompound mc : mcs) {
                Set<StructureGroup> groups = mc.getGroups(true);
                for (StructureGroup group : groups) {
                        phosphosites.add(group.getPDBResidueNumber());
                }
        }
        return phosphosites;
	 }

	public static Set<ModifiedCompound> identifyAllModfications(Structure struc) {
		    ProteinModificationIdentifier parser = new ProteinModificationIdentifier();
	        parser.identify(struc);
	        Set<ModifiedCompound> mcs = parser.getIdentifiedModifiedCompound();
	        return mcs;
	  }
   }

