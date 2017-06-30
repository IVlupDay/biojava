package demos;

import org.biojava.utils.*;

public interface Nameable extends Changeable {
	 
	 /**
	   * The ChangeType that indicates that the name property has changed.
	   */
	  public static final ChangeType NAME = new ChangeType(
	    "The name has changed.", // human-readable description
	    "demos.Changeable",      // the current class name
	    "NAME"                   // field name
	  );
	  
	  /**
	   * Return the name associated with this Nameable.
	   *
	   * @return the name property
	   */
	  public String getName();

	  /**
	   * Change the name associated with this Nameable.
	   *
	   * @param the new value for the name property
	   * @throws ChangeVetoException if for any reason the name could not be set
	   */
	  public void setName(String name)
	  throws ChangeVetoException;
	}