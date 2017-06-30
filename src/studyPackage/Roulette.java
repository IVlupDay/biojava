package studyPackage;

import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;

import org.biojava.utils.*;
import org.biojava.bio.*;
import org.biojava.bio.symbol.*;
import org.biojava.bio.dist.*;

public class Roulette extends JApplet{
	
	   public static final FiniteAlphabet rolls;
	   public static final Symbol[] allRolls;
	   public static final FiniteAlphabet redBlack;
	   public static final Symbol red;
	   public static final Symbol black;

	   // probability distribution used to sample rolls of the wheel
	   public static final Distribution wheelRoller;
	   
	   // stuff to make the roulette wheel exist.
	   static {
	     final int numRolls = 40;

	     // make the rolls alphabet
	     rolls = new SimpleAlphabet("Rolls");
	     allRolls = new Symbol[numRolls];
	    
	     for(int i = 1; i <= numRolls; i++) {
	         Symbol s = allRolls[i-1] = AlphabetManager.createSymbol(i + "", Annotation.EMPTY_ANNOTATION);

	         // attempt to add the symbol
	         // this should work, but we still have to catch the exceptions. Since they
	         // should be impossible to throw, we re-throw them as assertion-failures.
	         try {
	           rolls.addSymbol(s);
	         } catch (ChangeVetoException cve) {
	           throw new BioError("Assertion Failure: Can't add symbol to the rolls alphabet", cve);
	         } catch (IllegalSymbolException ise) {
	           throw new BioError("Assertion Failure: Can't add symbol to the rolls alphabet", ise);
	         }
	       }
	     rolls.addChangeListener(ChangeListener.ALWAYS_VETO, Alphabet.SYMBOLS); 
	     
	     // make the red/black alphabet
	     redBlack = new SimpleAlphabet("Red/Black");
	     red = AlphabetManager.createSymbol("red", Annotation.EMPTY_ANNOTATION);
	     black = AlphabetManager.createSymbol("black", Annotation.EMPTY_ANNOTATION);
	     
	     // again, add them and throw any exceptions on as assertion-failures.
	     try {
	       redBlack.addSymbol(red);
	       redBlack.addSymbol(black);
	     } catch (ChangeVetoException cve) {
	       throw new BioError("Assertion Failure: Can't add symbol to the red/black alphabet", cve);
	     } catch (IllegalSymbolException ise) {
	       throw new BioError("Assertion Failure: Can't add symbol to the red/black alphabet", ise);
	     }
	     // and again lock the alphabet
	     redBlack.addChangeListener(ChangeListener.ALWAYS_VETO, Alphabet.SYMBOLS);	     
	     wheelRoller = new UniformDistribution(rolls);
	     }
	   
	     private Distribution rollDist;
	     private Distribution redBlackDist;
	     private boolean running = false;
	     private Thread countAdder;
	   
	     public void init() {
	    	    super.init(); // can't hurt...
	    	    try {
	    	        rollDist = DistributionFactory.DEFAULT.createDistribution(rolls);
	    	      } catch (IllegalAlphabetException iae) {
	    	        throw new BioError("Could not create distribution", iae);
	    	      }
	    	      redBlackDist = new RedBlackDist(rollDist);
	    	      final DistributionTrainerContext dtc = new SimpleDistributionTrainerContext();
	    	      dtc.registerDistribution(rollDist);
	    	      countAdder = new Thread(new Runnable() {
	    	          public void run() {
	    	            while(true) {
	    	            	boolean running;
	    	                synchronized(countAdder) {
	    	                  running = Roulette.this.running;
	    	                }
	    	                if(running) {
	    	                	Symbol s = Roulette.wheelRoller.sampleSymbol();
	    	                    try {
	    	                      dtc.addCount(rollDist, s, 1.0);
	    	                      dtc.train();
	    	                    } catch (IllegalSymbolException ise) {
	    	                      // should be impossible!
	    	                      throw new BioError("Assertion Failure: Sampled symbol not in alphabet", ise);
	    	                    } catch (ChangeVetoException cve) {
	    	                      cve.printStackTrace();
	    	                    }
	    	                    synchronized(countAdder) {
	    	                        try {
	    	                          countAdder.wait(500);
	    	                        } catch (InterruptedException ie) {
	    	                        }
	    	                      }
	    	                } else {
	    	                    synchronized(countAdder) {
	    	                      try {
	    	                        countAdder.wait();
	    	                      } catch (InterruptedException ie) {
	    	                      } catch (IllegalMonitorStateException imse) {
	    	                        throw new Error("Ouch", imse);
	    	                      }
	    	                    }
	    	                  }
	    	                }
	    	              }
	    	            }); 
	    	           
	    	      final JButton start = new JButton("Start");
	    	      final JButton stop = new JButton("Stop");
	    	      final JButton clear = new JButton("Clear");	    	      
	    	      start.setEnabled(true);
	    	      start.addActionListener(new ActionListener() {
	    	        public void actionPerformed(ActionEvent ae) {
	    	          synchronized(countAdder) {
	    	            running = true;
	    	            start.setEnabled(false);
	    	            stop.setEnabled(true);
	    	            countAdder.notify();
	    	          }
	    	        }
	    	      });
	    	      
	    	      stop.setEnabled(false);
	    	      stop.addActionListener(new ActionListener() {
	    	        public void actionPerformed(ActionEvent ae) {
	    	          synchronized(countAdder) {
	    	            running = false;
	    	            start.setEnabled(true);
	    	            stop.setEnabled(false);
	    	            countAdder.notify();
	    	          }
	    	        }
	    	      });	    	      
	    	      clear.setEnabled(true);
	    	      clear.addActionListener(new ActionListener() {
	    	        public void actionPerformed(ActionEvent ae) {
	    	          synchronized(countAdder) {
	    	            running = false;
	    	            start.setEnabled(true);
	    	            stop.setEnabled(false);
	    	            dtc.clearCounts();
	    	            countAdder.notify();
	    	          }
	    	        }
	    	      });
	    	      
	    	      Pie allPie;
	    	      try {
	    	        allPie = new Pie(rollDist, AlphabetManager.getAlphabetIndex(allRolls));
	    	      } catch (IllegalSymbolException ise) {
	    	        throw new BioError("Assertion Failure: Can't make indexer", ise);
	    	      } catch (BioException be) {
	    	        throw new BioError("Assertion Failure: Can't make indexer", be);
	    	      }
	    	      Pie redBlackPie = new Pie(redBlackDist);	    	      
	    	      JPanel top = new JPanel();
	    	      top.setLayout(new FlowLayout());
	    	      top.add(start);
	    	      top.add(stop);
	    	      top.add(clear);

	    	      JPanel center = new JPanel();
	    	      center.setLayout(new FlowLayout());
	    	      center.add(redBlackPie);
	    	      center.add(allPie);
	    	      Dimension d = new Dimension(80, 80);
	    	      redBlackPie.setPreferredSize(d);
	    	      allPie.setPreferredSize(d);

	    	      getContentPane().setLayout(new BorderLayout());
	    	      getContentPane().add(top, BorderLayout.NORTH);
	    	      getContentPane().add(center, BorderLayout.CENTER);
	    	    }
	    	        
	     public void start() {
	    	    super.start();
	    	    countAdder.start();
	    	  }
	    	}

class Pie extends JComponent {
	  private Distribution dist;
	  private AlphabetIndex indexer;
	  protected ChangeListener repainter;	  
	  public Pie(Distribution dist) {
		    this(dist, AlphabetManager.getAlphabetIndex((FiniteAlphabet) dist.getAlphabet()));
		  }
	  public Pie(Distribution dist, AlphabetIndex indexer) {
		    this.dist = dist;
		    this.indexer = indexer;

		    dist.addChangeListener(repainter = new ChangeAdapter() {
		      public void postChange(ChangeEvent ce) {
		        repaint();
		      }
		    }, Distribution.WEIGHTS);
		  }
	  protected void paintComponent(Graphics g) {
		    super.paintComponent(g);
		    Graphics2D g2 = (Graphics2D) g;

		    double pad = 5.0;
		    Rectangle2D boundingBox = new Rectangle2D.Double(pad, pad, getWidth() - 2.0 * pad, getHeight() - 2.0 * pad);
		    double midx = getWidth() * 0.5;
		    double midy = getHeight() * 0.5;
		    
		    double angle = 0.0;
		    for(int i = 0; i < indexer.getAlphabet().size(); i++) {
		      try {
		        Symbol s = indexer.symbolForIndex(i);
		        double p = dist.getWeight(s);
		        if(p != 0.0) {
		          double extent = p * 365.0;
		          Arc2D slice = new Arc2D.Double(boundingBox, angle, extent, Arc2D.PIE);
		          angle += extent;
		          g2.setPaint((s == Roulette.red) ? Color.red : (s == Roulette.black) ? Color.black :
		              (((char) (Integer.parseInt(s.getName()) - '0') % 2) == 0) ? Color.red : Color.black);
		          g2.fill(slice);
		          g2.setPaint(Color.blue);
		          g2.draw(slice);
		        }
		      } catch (IllegalSymbolException ise) {
		        ise.printStackTrace();
		      }
		    } 		    
		    angle = 0.0;
		    g2.setPaint(Color.yellow);
		    for(int i = 0; i < indexer.getAlphabet().size(); i++) {
		      try {
		        Symbol s = indexer.symbolForIndex(i);
		        double p = dist.getWeight(s);
		        if(p != 0.0) {
		          double extent = p * 365.0;
		          double a2 = Math.toRadians(angle + 0.5 * extent);
		          angle += extent;
		          g2.drawString(s.getName(),
		              (float)(midx + Math.cos(a2) * midx * 0.8), (float) (midy - Math.sin(a2) * midy * 0.8));
		        }
		      } catch (IllegalSymbolException ise) {
		        ise.printStackTrace();
		      }
		    }
		  }
		}
class RedBlackDist extends AbstractDistribution {
	  private Distribution parent;
	  private Distribution nullModel;
	  private double red;
	  private double black;
	  protected ChangeListener parentListener;
	  protected ChangeListener propUpdater;	  
	  public RedBlackDist(final Distribution parent) {
		    this.parent = parent;
		    generateChangeSupport();
		    parent.addChangeListener(parentListener =
		      new ChangeForwarder(this, getChangeSupport(Distribution.WEIGHTS)) {
		    	 protected ChangeEvent generateEvent(ChangeEvent ce) {
		    	        return new ChangeEvent(getSource(), Distribution.WEIGHTS, null, null, ce);
		    	      }
		    	    }, Distribution.WEIGHTS);
		    addChangeListener(propUpdater = new ChangeAdapter() {
		        public void postChange(ChangeEvent ce) {
		          red = black = 0.0;
		          for(Iterator<Symbol> i = ((FiniteAlphabet) (parent.getAlphabet())).iterator(); i.hasNext(); ) {
		            Symbol s = i.next();
		            try {
		              if(((char) (Integer.parseInt(s.getName()) - '0') % 2) == 0) // even - red
		                red += parent.getWeight(s);
		              else // odd - black
		                black += parent.getWeight(s);
		            } catch (IllegalSymbolException ise) {
		              throw new BioError("Assertion Failure: Can't find symbol", ise);
		            }
		          }
		        }
		      }, Distribution.WEIGHTS);
		    }
	  public Alphabet getAlphabet() {
		    return Roulette.redBlack;
		  }

		  protected double getWeightImpl(AtomicSymbol sym) throws IllegalSymbolException {
		    if(sym == Roulette.red)
		      return red;
		    else if(sym == Roulette.black)
		      return black;
		    throw new IllegalSymbolException("No symbol known for " + sym);
		  }
		  protected void setWeightImpl(AtomicSymbol as, double weight)
				  throws ChangeVetoException, IllegalSymbolException {
				    throw new ChangeVetoException("RedBlackDist is immutable");
				  }
				  protected void setNullModelImpl(Distribution nullModel)
				  throws ChangeVetoException, IllegalAlphabetException {
				    throw new ChangeVetoException("RedBlackDist is immutable");
				  }
				  public Distribution getNullModel() {
				    if(nullModel == null)
				      nullModel = new RedBlackDist(parent.getNullModel());
				    return nullModel;
				  }
		  }
		    
 