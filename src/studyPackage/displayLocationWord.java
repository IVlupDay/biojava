package studyPackage;

import java.util.Scanner;
import java.util.ArrayList;

public class displayLocationWord {
	
	public static void main(String[] args) {
		
		String str = "TTTGTGTGATTTGACC";
		String find = "like";
		ArrayList<String> stringSearch = new ArrayList<String>();
		ArrayList<Integer> positionCount = new ArrayList<Integer>();
		ArrayList<String> resultSearch = new ArrayList<String>(); 		
		String[] sp = str.split("\\s*"); // "+" for multiple spaces
		int count=0;
		Scanner sc = new Scanner(str);
		sc.useDelimiter("\\s*");		
		while(sc.hasNext()) {
			count ++;
			String sentenceRead; 
			sentenceRead = sc.next();
			stringSearch.add(sentenceRead);
			positionCount.add(count);			
		    }
			
		
		
			/*
			// String[] motif= new String[]{"TGAC", "TGACC", "GTCA", "GGTCA"};	
			String[] motif = new String[]{"T", "G", "A", "C"}; 
			for(int i=0; i<= stringSearch.size()-1; i++) {
				for(int j=0; j<=motif.length-1; j++) {					
					if(stringSearch.get(i).equals(motif[j].toString())) {						
						System.out.println(stringSearch.get(i)+"  "+i);						
					}
					else {}
				}				
			}
			*/
			
		 
			
			
			for (int i=0; i<= stringSearch.size()-1; i++) {
				if(stringSearch.get(i).equals("T")) {
					for(int j=i+1; j<=stringSearch.size()-1; j++) {
					    if(stringSearch.get(j).equals("G")) {
							for(int k=j+1; k<= stringSearch.size()-1; k++) {
								if(stringSearch.get(k).equals("A")) {
									for (int m=k+1; m<=stringSearch.size()-1; m++) {
										if(stringSearch.get(m).equals("C")) {	
												  System.out.print(stringSearch.get(i)+stringSearch.get(j)+stringSearch.get(k)
												                    +stringSearch.get(m)+":"+positionCount.get(m)+" -  ");
											}		
										
										}
									}										
								}
							}							
						}
					}						
				}
			  	
			
			
		/*
		for (int i = 0; i < sp.length; i++) {
			if (sp[i].equals(find)) {
				
		System.out.println(sp[i]+"  "+(i+1));
				}
		   } */
	  }
	
	
	
 }
