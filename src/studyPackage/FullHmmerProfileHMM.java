package studyPackage;

import org.biojava.bio.Annotation;
import org.biojava.bio.dist.Distribution;
import org.biojava.bio.dp.EmissionState;
import org.biojava.bio.dp.IllegalTransitionException;
import org.biojava.bio.dp.ModelInState;
import org.biojava.bio.dp.SimpleEmissionState;
import org.biojava.bio.dp.SimpleMarkovModel;
import org.biojava.bio.dp.SimpleModelInState;
import org.biojava.bio.program.hmmer.HmmerProfileHMM;
import org.biojava.bio.symbol.IllegalAlphabetException;
import org.biojava.bio.symbol.IllegalSymbolException;
import org.biojava.utils.ChangeVetoException;

@SuppressWarnings("serial")
public class FullHmmerProfileHMM extends SimpleMarkovModel {
	
	    EmissionState j;
	    EmissionState c;
	    EmissionState n;
	    ModelInState hmmState;

	  private final static int [] advance = { 1 };

	  FullHmmerProfileHMM( HmmerProfileHMM hmm ) throws IllegalSymbolException, IllegalTransitionException,
	  IllegalAlphabetException, ChangeVetoException {
	     super(1, hmm.emissionAlphabet(), hmm.stateAlphabet().getName());

	     Distribution nullDist = hmm.getInsert(1).getDistribution();
	     hmmState = new SimpleModelInState(hmm, hmm.stateAlphabet().getName());

	     j = new SimpleEmissionState("j", Annotation.EMPTY_ANNOTATION, advance, nullDist);	   
	     c = new SimpleEmissionState("j", Annotation.EMPTY_ANNOTATION, advance, nullDist);
	     n = new SimpleEmissionState("j", Annotation.EMPTY_ANNOTATION, advance, nullDist);
	     addState(j);
	     addState(c);
	     addState(n);
	     addState(hmmState);
	     
	     createTransition(magicalState(), n);
	     createTransition(n, hmmState);
	     createTransition(n, n);
	     createTransition(hmmState,c);
	     createTransition(hmmState,j);
	     createTransition(j,hmmState);
	     createTransition(j,j);
	     createTransition(c,c);
	     createTransition(c,magicalState());

	 }

	    /** Gets the J loop state */
	    public EmissionState jState(){
	    return j;
	    }

	    /** Gets the c loop state */
	    public EmissionState cState(){
	    return c;
	    }

	    /** Gets the n loop state */
	    public EmissionState nState(){
	    return n;
	    }

	    /** Gets the inner HmmerProfileHMM state */
	    public ModelInState hmm(){ 
	    return hmmState;
	    }

}
