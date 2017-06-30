package demos;

import javax.swing.event.ChangeListener;

import org.biojava.utils.ChangeSupport;
import org.biojava.utils.ChangeType;
import org.biojava.utils.Changeable;

public abstract class AbstractChangeable implements Changeable {

	  private transient ChangeSupport changeSupport = null;
	  protected boolean hasListeners() {
		    return changeSupport != null;
		  }
	  
	  protected ChangeSupport getChangeSupport(ChangeType ct) {
		    if(changeSupport == null) {
		      changeSupport = new ChangeSupport();
		    }

		    return changeSupport;
		  }
	  
	  public void addChangeListener(ChangeListener cl) {
		    ChangeSupport cs = getChangeSupport(null);
		    synchronized(cs) {
		      cs.addChangeListener((org.biojava.utils.ChangeListener) cl);
		    }
		  }

		  public void addChangeListener(ChangeListener cl, ChangeType ct) {
		    ChangeSupport cs = getChangeSupport(ct);
		    synchronized(cs) {
		      cs.addChangeListener((org.biojava.utils.ChangeListener) cl, ct);
		    }
		  }

		  public void removeChangeListener(ChangeListener cl) {
		    ChangeSupport cs = getChangeSupport(null);
		    synchronized(cs) {
		      cs.removeChangeListener((org.biojava.utils.ChangeListener) cl);
		    }
		  }

		  public void removeChangeListener(ChangeListener cl, ChangeType ct) {
		    ChangeSupport cs = getChangeSupport(ct);
		    synchronized(cs) {
		      cs.removeChangeListener((org.biojava.utils.ChangeListener) cl, ct);
		    }
		  }
		}

