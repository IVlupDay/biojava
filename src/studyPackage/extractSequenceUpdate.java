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
import java.util.Scanner;
import java.io.*; 

public class extractSequenceUpdate {

   public static void main(String[] args) {
        
		long startingTime = System.currentTimeMillis(); 
		System.out.println("\n"+"Start searching sequences...");
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++"+"\n");
		
	    ArrayList<String> chr1 = new ArrayList<String>();
	    ArrayList<String> chr2 = new ArrayList<String>();
	    ArrayList<String> chr3 = new ArrayList<String>();
	    ArrayList<String> chr4 = new ArrayList<String>();
	    ArrayList<String> chr5 = new ArrayList<String>();
	    ArrayList<String> chr6 = new ArrayList<String>();
	    ArrayList<String> chr7 = new ArrayList<String>();
	    ArrayList<String> chr8 = new ArrayList<String>();
	    ArrayList<String> chr9 = new ArrayList<String>();
	    ArrayList<String> chr10 = new ArrayList<String>();
	    ArrayList<String> chr11 = new ArrayList<String>();
	    ArrayList<String> chr12 = new ArrayList<String>();
	    ArrayList<String> chr13 = new ArrayList<String>();
	    ArrayList<String> chr14 = new ArrayList<String>();
	    ArrayList<String> chr15 = new ArrayList<String>();
	    ArrayList<String> chr16 = new ArrayList<String>();
	    ArrayList<String> chr17 = new ArrayList<String>();
	    ArrayList<String> chr18 = new ArrayList<String>();
	    ArrayList<String> chr19 = new ArrayList<String>();
	    ArrayList<String> chr20 = new ArrayList<String>();
	    ArrayList<String> chr21 = new ArrayList<String>();
	    ArrayList<String> chr22 = new ArrayList<String>();
	    ArrayList<String> chrX = new ArrayList<String>();
	    ArrayList<String> chrY = new ArrayList<String>();
	    ArrayList<String> chrM = new ArrayList<String>();
	    
        try {
        	  BufferedReader bfChr1 = new BufferedReader(new FileReader ("./hg19/chr1.fa")); 
        	  String lineChr1; 
        	       while((lineChr1=bfChr1.readLine())!=null) {chr1.add(lineChr1);} bfChr1.close();
        	  BufferedReader bfChr2 = new BufferedReader(new FileReader ("./hg19/chr2.fa")); 
              String lineChr2;
                   while((lineChr2=bfChr2.readLine())!=null) {chr2.add(lineChr2);} bfChr2.close();
         	  BufferedReader bfChr3 = new BufferedReader(new FileReader ("./hg19/chr3.fa")); 
              String lineChr3; 
                   while((lineChr3=bfChr3.readLine())!=null) {chr3.add(lineChr3);} bfChr3.close();
              BufferedReader bfChr4 = new BufferedReader(new FileReader ("./hg19/chr4.fa")); 
              String lineChr4; 
                   while((lineChr4=bfChr4.readLine())!=null) {chr4.add(lineChr4);} bfChr4.close();
              BufferedReader bfChr5 = new BufferedReader(new FileReader ("./hg19/chr5.fa")); 
              String lineChr5;
                   while((lineChr5=bfChr5.readLine())!=null) {chr5.add(lineChr5);} bfChr5.close();
              BufferedReader bfChr6 = new BufferedReader(new FileReader ("./hg19/chr6.fa")); 
              String lineChr6;
                   while((lineChr6=bfChr6.readLine())!=null) {chr6.add(lineChr6);} bfChr6.close();
              BufferedReader bfChr7 = new BufferedReader(new FileReader ("./hg19/chr7.fa")); 
              String lineChr7; 
                   while((lineChr7=bfChr7.readLine())!=null) {chr7.add(lineChr7);} bfChr7.close();
              BufferedReader bfChr8 = new BufferedReader(new FileReader ("./hg19/chr8.fa")); 
              String lineChr8;
                   while((lineChr8=bfChr8.readLine())!=null) {chr8.add(lineChr8);} bfChr8.close();
              BufferedReader bfChr9 = new BufferedReader(new FileReader ("./hg19/chr9.fa")); 
              String lineChr9; 
                   while((lineChr9=bfChr9.readLine())!=null) {chr9.add(lineChr9);} bfChr9.close();
              BufferedReader bfChr10 = new BufferedReader(new FileReader ("./hg19/chr10.fa")); 
              String lineChr10;
                   while((lineChr10=bfChr10.readLine())!=null) {chr10.add(lineChr10);} bfChr10.close();
              BufferedReader bfChr11 = new BufferedReader(new FileReader ("./hg19/chr11.fa")); 
              String lineChr11; 
                   while((lineChr11=bfChr11.readLine())!=null) {chr11.add(lineChr11);} bfChr11.close();
              BufferedReader bfChr12 = new BufferedReader(new FileReader ("./hg19/chr12.fa")); 
              String lineChr12; 
                   while((lineChr12=bfChr12.readLine())!=null) {chr12.add(lineChr12);} bfChr12.close();
              BufferedReader bfChr13 = new BufferedReader(new FileReader ("./hg19/chr13.fa")); 
              String lineChr13;
                   while((lineChr13=bfChr13.readLine())!=null) {chr13.add(lineChr13);} bfChr13.close();
              BufferedReader bfChr14 = new BufferedReader(new FileReader ("./hg19/chr14.fa")); 
              String lineChr14;
                   while((lineChr14=bfChr14.readLine())!=null) {chr14.add(lineChr14);} bfChr14.close();
              BufferedReader bfChr15 = new BufferedReader(new FileReader ("./hg19/chr15.fa")); 
              String lineChr15; 
                   while((lineChr15=bfChr15.readLine())!=null) {chr15.add(lineChr15);} bfChr15.close();
              BufferedReader bfChr16 = new BufferedReader(new FileReader ("./hg19/chr16.fa")); 
              String lineChr16;
                   while((lineChr16=bfChr16.readLine())!=null) {chr16.add(lineChr16);} bfChr16.close();
              BufferedReader bfChr17 = new BufferedReader(new FileReader ("./hg19/chr17.fa")); 
              String lineChr17;
                   while((lineChr17=bfChr17.readLine())!=null) {chr17.add(lineChr17);} bfChr17.close();
              BufferedReader bfChr18 = new BufferedReader(new FileReader ("./hg19/chr18.fa")); 
              String lineChr18; 
                   while((lineChr18=bfChr18.readLine())!=null) {chr18.add(lineChr18);} bfChr18.close();
              BufferedReader bfChr19 = new BufferedReader(new FileReader ("./hg19/chr19.fa")); 
              String lineChr19;
                   while((lineChr19=bfChr19.readLine())!=null) {chr19.add(lineChr19);} bfChr19.close();
              BufferedReader bfChr20 = new BufferedReader(new FileReader ("./hg19/chr20.fa")); 
              String lineChr20; 
                   while((lineChr20=bfChr20.readLine())!=null) {chr20.add(lineChr20);} bfChr20.close(); 
              BufferedReader bfChr21 = new BufferedReader(new FileReader ("./hg19/chr21.fa")); 
              String lineChr21; 
                   while((lineChr21=bfChr21.readLine())!=null) {chr21.add(lineChr21);} bfChr21.close();
              BufferedReader bfChr22 = new BufferedReader(new FileReader ("./hg19/chr22.fa")); 
              String lineChr22; 
                   while((lineChr22=bfChr22.readLine())!=null) {chr22.add(lineChr22);} bfChr22.close();
              BufferedReader bfChrX = new BufferedReader(new FileReader ("./hg19/chrX.fa")); 
              String lineChrX;
                   while((lineChrX=bfChrX.readLine())!=null) {chrX.add(lineChrX);} bfChrX.close();
              BufferedReader bfChrY = new BufferedReader(new FileReader ("./hg19/chrY.fa")); 
              String lineChrY; 
                   while((lineChrY=bfChrY.readLine())!=null) {chrY.add(lineChrY);} bfChrY.close(); 
              BufferedReader bfChrM = new BufferedReader(new FileReader ("./hg19/chrM.fa")); 
              String lineChrM; 
                   while((lineChrM=bfChrM.readLine())!=null) {chrM.add(lineChrM);} bfChrM.close();
        } catch(IOException e) {e.printStackTrace();}
        
        ArrayList<String> tempSeq = new ArrayList<String>();
	    int count=0; 
	    int nextStop; 
	    String sequenceRead; 
	    StringBuffer stringPlus = new StringBuffer(); 
	    StringBuffer stringMinus = new StringBuffer();
        
        try { BufferedReader erbsFile = new BufferedReader(new FileReader("./ErbswithStrand/erbswithStrandHg19.csv"));
              String lineErbs = erbsFile.readLine();
              String splitPattern = ",";
              while(lineErbs != null) {
            	 String[] erbsCoordinate = lineErbs.split(splitPattern);
            	 constructExtractSequence calCoordinate = calculateCoordinate(Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3])); 
            	   if(erbsCoordinate[1].equals("+")) {
            	      if(erbsCoordinate[0].equals("chr1")) {
            	    	  for(int i=0; i<=chr1.size()-1; i++) {
                	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    		 Scanner sc = new Scanner(chr1.get(i));
                	    		 sc.useDelimiter("\\s*");
                	    			  while(sc.hasNext()) {
                	    				  count ++;
                	    				  sequenceRead = sc.next(); 
                	    				  nextStop = count; 
                	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                	    				    	tempSeq.add(sequenceRead);
                	    				    } else {}
                	    			  } sc.close();
                	    		   } for (int j=0; j<=tempSeq.size()-1; j++) {
                	    	        	 stringPlus.append(tempSeq.get(j));
                	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                	    	    }
                	    	 }
            	      else if(erbsCoordinate[1].equals("-")) {
            	    	 if(erbsCoordinate[0].equals("chr1")) {
            	    		 for(int i=0; i<=chr1.size()-1; i++) {
            	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
            	    				 Scanner sc = new Scanner(chr1.get(i)); 
            	    				 sc.useDelimiter("\\s*");
            	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
  							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
            	    				      while(sc.hasNext()) {
            	    				    	  count ++;
            	    				    	  sequenceRead = sc.next(); 
            	    				    	  nextStop = count;
            	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
            	    				    		  for(int j=0; j<=9; j++) {
            	    				    			  if(sequenceRead.equals(nucleotide[j])) {
            	    				    				  tempSeq.add(minusNucleotide[j]);
            	    				    			  } else {}
            	    				    		  }
            	    				    	  } sc.close();
            	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
            	    				    	  stringMinus.append(tempSeq.get(k).toString());
            	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
            	    			      }
            	    		      }
            	    	      } else{}
            	    	  }
            	      }
            	    else if(erbsCoordinate[1].equals("+")) {
            	    	 if(erbsCoordinate[0].equals("chr2")) {
               	    	  for(int i=0; i<=chr1.size()-1; i++) {
                   	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                   	    		 Scanner sc = new Scanner(chr1.get(i));
                   	    		 sc.useDelimiter("\\s*");
                   	    			  while(sc.hasNext()) {
                   	    				  count ++;
                   	    				  sequenceRead = sc.next(); 
                   	    				  nextStop = count; 
                   	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                   	    				    	tempSeq.add(sequenceRead);
                   	    				    } else {}
                   	    			  } sc.close();
                   	    		   } for (int j=0; j<=tempSeq.size()-1; j++) {
                   	    	        	 stringPlus.append(tempSeq.get(j));
                   	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                   	    	    }
                   	    	 }
               	      else if(erbsCoordinate[1].equals("-")) {
               	    	 if(erbsCoordinate[0].equals("chr2")) {
               	    		 for(int i=0; i<=chr1.size()-1; i++) {
               	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
               	    				 Scanner sc = new Scanner(chr1.get(i)); 
               	    				 sc.useDelimiter("\\s*");
               	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
     							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
               	    				      while(sc.hasNext()) {
               	    				    	  count ++;
               	    				    	  sequenceRead = sc.next(); 
               	    				    	  nextStop = count;
               	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
               	    				    		  for(int j=0; j<=9; j++) {
               	    				    			  if(sequenceRead.equals(nucleotide[j])) {
               	    				    				  tempSeq.add(minusNucleotide[j]);
               	    				    			  } else {}
               	    				    		  }
               	    				    	  } sc.close();
               	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
               	    				    	  stringMinus.append(tempSeq.get(k).toString());
               	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
               	    			      }
               	    		      }
               	    	      } else{}
            	          }
            	      }
            	    else if(erbsCoordinate[1].equals("+")) {
           	    	 if(erbsCoordinate[0].equals("chr3")) {
              	    	  for(int i=0; i<=chr1.size()-1; i++) {
                  	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                  	    		 Scanner sc = new Scanner(chr1.get(i));
                  	    		 sc.useDelimiter("\\s*");
                  	    			  while(sc.hasNext()) {
                  	    				  count ++;
                  	    				  sequenceRead = sc.next(); 
                  	    				  nextStop = count; 
                  	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                  	    				    	tempSeq.add(sequenceRead);
                  	    				    } else {}
                  	    			  } sc.close();
                  	    		   } for (int j=0; j<=tempSeq.size()-1; j++) {
                  	    	        	 stringPlus.append(tempSeq.get(j));
                  	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                  	    	    }
                  	    	 }
              	      else if(erbsCoordinate[1].equals("-")) {
              	    	 if(erbsCoordinate[0].equals("chr3")) {
              	    		 for(int i=0; i<=chr1.size()-1; i++) {
              	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
              	    				 Scanner sc = new Scanner(chr1.get(i)); 
              	    				 sc.useDelimiter("\\s*");
              	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
    							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
              	    				      while(sc.hasNext()) {
              	    				    	  count ++;
              	    				    	  sequenceRead = sc.next(); 
              	    				    	  nextStop = count;
              	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
              	    				    		  for(int j=0; j<=9; j++) {
              	    				    			  if(sequenceRead.equals(nucleotide[j])) {
              	    				    				  tempSeq.add(minusNucleotide[j]);
              	    				    			  } else {}
              	    				    		  }
              	    				    	  } sc.close();
              	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
              	    				    	  stringMinus.append(tempSeq.get(k).toString());
              	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
              	    			      }
              	    		      }
              	    	      } else{}
              	          }
            	      }
            	    else if(erbsCoordinate[1].equals("+")) {
              	    	 if(erbsCoordinate[0].equals("chr4")) {
                 	    	  for(int i=0; i<=chr1.size()-1; i++) {
                     	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                     	    		 Scanner sc = new Scanner(chr1.get(i));
                     	    		 sc.useDelimiter("\\s*");
                     	    			  while(sc.hasNext()) {
                     	    				  count ++;
                     	    				  sequenceRead = sc.next(); 
                     	    				  nextStop = count; 
                     	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                     	    				    	tempSeq.add(sequenceRead);
                     	    				    } else {}
                     	    			  } sc.close();
                     	    		   } for (int j=0; j<=tempSeq.size()-1; j++) {
                     	    	        	 stringPlus.append(tempSeq.get(j));
                     	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                     	    	    }
                     	    	 }
                 	      else if(erbsCoordinate[1].equals("-")) {
                 	    	 if(erbsCoordinate[0].equals("chr4")) {
                 	    		 for(int i=0; i<=chr1.size()-1; i++) {
                 	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                 	    				 Scanner sc = new Scanner(chr1.get(i)); 
                 	    				 sc.useDelimiter("\\s*");
                 	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
       							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                 	    				      while(sc.hasNext()) {
                 	    				    	  count ++;
                 	    				    	  sequenceRead = sc.next(); 
                 	    				    	  nextStop = count;
                 	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                 	    				    		  for(int j=0; j<=9; j++) {
                 	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                 	    				    				  tempSeq.add(minusNucleotide[j]);
                 	    				    			  } else {}
                 	    				    		  }
                 	    				    	  } sc.close();
                 	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                 	    				    	  stringMinus.append(tempSeq.get(k).toString());
                 	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                 	    			      }
                 	    		      }
                 	    	      } else{}
                 	          }
               	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr5")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr5")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr6")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr6")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr7")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr7")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr8")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr8")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr9")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr9")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr10")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr10")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr11")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   } for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr11")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr12")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr12")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr13")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr13")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr14")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr14")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr15")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr15")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr16")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr16")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr17")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr17")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr18")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr18")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr19")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr19")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr20")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr20")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr21")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   } for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr21")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chr22")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chr22")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chrX")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chrX")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chrY")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chrY")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
            	    else if(erbsCoordinate[1].equals("+")) {
             	    	 if(erbsCoordinate[0].equals("chrM")) {
                	    	  for(int i=0; i<=chr1.size()-1; i++) {
                    	    	 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                    	    		 Scanner sc = new Scanner(chr1.get(i));
                    	    		 sc.useDelimiter("\\s*");
                    	    			  while(sc.hasNext()) {
                    	    				  count ++;
                    	    				  sequenceRead = sc.next(); 
                    	    				  nextStop = count; 
                    	    				    if((nextStop >= calCoordinate.startCount)&&(nextStop <= calCoordinate.endCount)) {
                    	    				    	tempSeq.add(sequenceRead);
                    	    				    } else {}
                    	    			  } sc.close();
                    	    		   }for (int j=0; j<=tempSeq.size()-1; j++) {
                    	    	        	 stringPlus.append(tempSeq.get(j));
                    	    	       }  loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringPlus.toString());
                    	    	    }
                    	    	 }
                	      else if(erbsCoordinate[1].equals("-")) {
                	    	 if(erbsCoordinate[0].equals("chrM")) {
                	    		 for(int i=0; i<=chr1.size()-1; i++) {
                	    			 if((calCoordinate.lineStr<=i)&&(calCoordinate.lineEnd>=i)) {
                	    				 Scanner sc = new Scanner(chr1.get(i)); 
                	    				 sc.useDelimiter("\\s*");
                	    				 String[] nucleotide = {"A","T","C","G","a","t","c","g", "N", "n"};
      							         String[] minusNucleotide = {"T","A","G","C","t","a","g","c", "N", "n"};
                	    				      while(sc.hasNext()) {
                	    				    	  count ++;
                	    				    	  sequenceRead = sc.next(); 
                	    				    	  nextStop = count;
                	    				    	  if((nextStop >= calCoordinate.startCount)&& (nextStop<=calCoordinate.endCount)) {
                	    				    		  for(int j=0; j<=9; j++) {
                	    				    			  if(sequenceRead.equals(nucleotide[j])) {
                	    				    				  tempSeq.add(minusNucleotide[j]);
                	    				    			  } else {}
                	    				    		  }
                	    				    	  } sc.close();
                	    				      } for (int k=tempSeq.size() -1; k>= 0; k--) {
                	    				    	  stringMinus.append(tempSeq.get(k).toString());
                	    				      } loadSequence(erbsCoordinate[1], erbsCoordinate[0], Integer.parseInt(erbsCoordinate[2]), Integer.parseInt(erbsCoordinate[3]), stringMinus.toString());
                	    			      }
                	    		      }
                	    	      } else{}
                	          }
              	          }
               } erbsFile.close();
         } catch (IOException e) {e.printStackTrace();}
        
		    System.out.print("\n\n\n");
		    long endingTime = System.currentTimeMillis(); 
		    System.out.print((endingTime-startingTime)/(1000*60)+" Minutes"+"\n\n");
		    System.out.println("Finish loading sequences into TEXT files");
		    System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
	     }
   
   // Calculate starting and ending position of erbs
   public static constructExtractSequence calculateCoordinate(int strCalculation, int endCalculation) { 
	  
	        int positionCalStart = strCalculation%50;
            int positionCalEnd = endCalculation%50;
            int lineCalStart = (strCalculation-positionCalStart)/50; 
            int lineCalEnd = (endCalculation-positionCalEnd)/50; 
            int startCalCount = (strCalculation+(49*positionCalStart))/50; 
            int endCalCount = (endCalculation+(49*positionCalEnd))/50;  
            return new constructExtractSequence(lineCalStart, lineCalEnd, startCalCount, endCalCount);
    }   
   
   // Load sequence and coordinate into text file
   public static void loadSequence(String chrLoad, String strandLoad, Integer strerLoad, Integer endLoad, String sequenceLoad) {
	  
	   ArrayList<String> listOfSequence = new ArrayList<String>();
	   listOfSequence.add(sequenceLoad);
	   File locationFile = new File("./Result/resultHg19.txt");
	   FileWriter writeFile = null;
	   BufferedWriter fileLoad = null;
	   try {writeFile = new FileWriter(locationFile, true);
	       fileLoad = new BufferedWriter(writeFile);
	          if(!locationFile.exists()){
		        locationFile.createNewFile(); 
	          } fileLoad.append(strandLoad+" "+chrLoad+":"+strerLoad+"-"+endLoad+"              "+sequenceLoad);
			    fileLoad.newLine();
			    fileLoad.flush();
			    fileLoad.close(); 
		      }  catch (IOException e) {e.printStackTrace();}  catch (Exception e) {
		    	      System.err.println("Error: "+e.getMessage());
		      }  finally {
		         try {
		    		  fileLoad.close();
		    		  writeFile.close(); 	  
		      }  catch (IOException e){e.printStackTrace();}
		  }
	  }
  }
 