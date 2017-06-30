/*
 * 
 * This Java program is developed to extract all sequence 
 * (nucleotides) from human reference genome such as hg19
 * 
 * ++++++++++++ Java program is written by Mr. Vutha PHAV
 * ++++++++++++ first-year doctoral Student in Tokyo Tech
 * 
 * 
 */

package studyPackage;

import java.util.ArrayList; 
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.io.*; 

public class extractSequence {

   public static void main(String[] args) {
        
		long startingTime = System.currentTimeMillis(); 
		System.out.println("\n"+"Start searching sequences...");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
		
		String path = "./hg19/";
        File folder = new File(path); 
        File[] fileFolder = folder.listFiles();
        
        String[] chromPattern = { "chr1", "chr2", "chr3", "chr4", "chr5", "chr6", "chr7", "chr8", "chr9",
                                  "chr10", "chr11", "chr12", "chr13", "chr14", "chr15", "chr16", "chr17",
                                  "chr18", "chr19", "chr20", "chr21", "chr22",  "chrX", "chrY", "chrM" };
 
        ArrayList<String> tempSeq = new ArrayList<String>();
        
    	ArrayList<String> chromErbs = new ArrayList<String>();
        ArrayList<String> strandErbs = new ArrayList<String>();
        ArrayList<Integer> strErbs = new ArrayList<Integer>();
        ArrayList<Integer> endErbs = new ArrayList<Integer>();
        
        ArrayList<Integer> lineCalStart = new ArrayList<Integer>(); 
	    ArrayList<Integer> lineCalEnd = new ArrayList<Integer>();
	    ArrayList<Double> startCalCount = new ArrayList<Double>();
	    ArrayList<Double> endCalCount = new ArrayList<Double>();
	    
	    int count=0; 
	    int nextStop; 
	    String sequenceRead; 
	    StringBuffer stringPlus = new StringBuffer(); 
	    StringBuffer stringMinus = new StringBuffer();
        
        // Load Erbs coordinate into Arraylist for calculation
        try {
	            String erbsFile = "./ErbswithStrand/erbswithStrandHg19.csv";
                String lineErbs; 
                String splitPattern = ",";
                BufferedReader brErbs = new BufferedReader(new FileReader(erbsFile)); 
    	
	               while((lineErbs = brErbs.readLine()) != null) {
		   
	                    String[] erbsCoordinate = lineErbs.split(splitPattern); 
	                    chromErbs.add(erbsCoordinate[0]);
	                    strandErbs.add(erbsCoordinate[1]);
	                    strErbs.add(Integer.parseInt(erbsCoordinate[2]));
	                    endErbs.add(Integer.parseInt(erbsCoordinate[3]));
	                    
                   } brErbs.close(); 
                  
                  
        } catch (IOException e) {
        	e.printStackTrace(); 
        	
        } catch (InputMismatchException e) {
        	e.printStackTrace();
        	
        } catch(NoSuchElementException e) {
        	e.printStackTrace();
        }
        
        for(int i=0; i<= chromErbs.size()-1; i++) {
        	  
	         	 // Calculate the exact position and for substring search 
		         int positionCalStart = strErbs.get(i)%50;
	             int positionCalEnd = endErbs.get(i)%50;

	             lineCalStart.add((strErbs.get(i)-positionCalStart)/50);
	             lineCalEnd.add((endErbs.get(i)-positionCalEnd)/50) ; 

	             startCalCount.add((strErbs.get(i) +(49.*positionCalStart))/50);
	             endCalCount.add((endErbs.get(i)+(49.*positionCalEnd))/50); 
	           }  
        
        // Start extract sequence 
        for(int m=0; m<=chromErbs.size()-1; m++) {
        	
          for(int n=0; n<=fileFolder.length-1; n++) {
        		
        	while(chromErbs.get(m).equals(fileFolder[n])) {
        			
        		String[] chromSelection = {null}; 
        		BufferedReader bufferChrom = null; 
        		int lineCount = 0; 
        		
        		try {
        			   bufferChrom = new BufferedReader(new FileReader(path+chromErbs.get(m)));
        			   String lineChrom = bufferChrom.readLine(); 
        			      
        			      while(lineChrom != null) {
        				
        			           chromSelection[lineCount] = lineChrom; 
        			           lineCount++;
        			} bufferChrom.close();
        			   
        			   for(int i=0; i<= chromSelection.length-1; i++) {
        				   
            			   if(strandErbs.get(m).equals("+")) {
            				   
            				   if(lineCalStart.get(m).equals(i)) {
            					   
            					   Scanner sc = new Scanner(chromSelection[i]); 
            					   sc.useDelimiter("\\s*");
            					   
            					      while(sc.hasNext()) {
            					    	  count ++;
            					    	  sequenceRead = sc.next(); 
            					    	  nextStop = count; 
            					    	  
            					    	  // Read the from line and start to count until the end of erbs
            					    	  if((nextStop>=startCalCount.get(m)) && (nextStop <= endCalCount.get(m))) {
            					    		  
            					    		  tempSeq.add(sequenceRead); 
            					    	  } else {} 
            					    	  
            					    } sc.close();
            				   }
            				   
            				   //Convert Arraylist to String 
            				   for(int j=0; j<=tempSeq.size()-1; j++) {
            					   
            					   stringPlus.append(tempSeq.get(j)); 
            				   }
            				     loadSequence(chromErbs.get(m), strandErbs.get(m), strErbs.get(m), endErbs.get(m), stringPlus.toString());
            				   
            			   } else if (strandErbs.get(m).equals("-")) {
            				   
            				   if(lineCalStart.get(m).equals(i)) {
            					   
            					   Scanner sc = new Scanner(chromSelection[i]);
            					   sc.useDelimiter("\\s*");
            					   String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
							       String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
            					   
							       while(sc.hasNext()) {
            						   
            						   count ++; 
            						   sequenceRead = sc.next(); 
            						   nextStop = count; 
            						   
            						   // Read the from line and start to count until the end of erbs
            						   if((nextStop<=startCalCount.get(m)) && (nextStop>=endCalCount.get(m))) {
            							   
            							   for(int j=0; j<=9; j++) {
            								   
            								   if(sequenceRead.equals(nucleotide[j])) {
            									   
            									   tempSeq.add(minusNucleotide[j]);
            								   }
            								   else {}
            							       }
            						      }
            						   
            					    } sc.close();
            				   }
            				   
            				   // Inverse position of minus strand
            				   for (int k=0; k<=tempSeq.size()-1; k++) {
            					   
            					   stringMinus.append(tempSeq.get(k).toString()); 
            				   }
            				   loadSequence(chromErbs.get(m), strandErbs.get(m), strErbs.get(m), endErbs.get(m), stringMinus.toString());
            				   
            			   }
            			   else {}
        			   }
        			   
        			   
        		} catch(Exception e) {
        			e.printStackTrace();
        			
        		} finally {
        			
        			try {
        				bufferChrom.close();
        				
        			} catch (Exception e) {
        				e.printStackTrace();
        		    }
        	    }
            }
        }
	
		   System.out.print("\n\n\n");
		   long endingTime = System.currentTimeMillis(); 
		   
		   System.out.print((endingTime-startingTime)/(1000*60)+" Minutes"+"\n\n");
		   System.out.println("Finish loading sequences into TEXT files");
		   System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		
        }   
		  /*
	      System.out.println(strander+""+chrom+":"+strer+"-"+ender+" ## "+lineStart+" ## "+
	                         lineEnd+" ## "+startCount+" ## "+lineEnd+" ## "+endCount+" ## "); */
	}
	
   public static void loadSequence(String chrLoad, String strandLoad, Integer strerLoad, Integer endLoad, String sequenceLoad){
		  
		   ArrayList<String> listOfSequence = new ArrayList<String>();
		   listOfSequence.add(sequenceLoad);
		   
		   File locationFile = new File("./Result/resultHg19.txt");
		   FileWriter writeFile = null;
		   BufferedWriter fileLoad = null;
		   
		   try {
			   
		     writeFile = new FileWriter(locationFile, true);
		     fileLoad = new BufferedWriter(writeFile);
		     
		       if(!locationFile.exists()){
			        locationFile.createNewFile(); 
		         }
		            fileLoad.append(strandLoad+" "+chrLoad+":"+strerLoad+"-"+endLoad+"              "+sequenceLoad);
				    fileLoad.newLine();
				    fileLoad.flush();
				    fileLoad.close(); 
				   
			    }  catch (IOException e) {
			    	e.printStackTrace(); 
			    
			    }  catch (Exception e) {
			    	System.err.println("Error: "+e.getMessage());
			    
			    }  finally {
			    	
			    	try {
			    		  fileLoad.close();
			    		  writeFile.close(); 
			    		  
			    }  catch (IOException e){
			    	e.printStackTrace();
			    }
			}
		}
    }
