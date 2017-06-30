package studyPackage;

import java.io.*;
import java.util.*; 

public class studyClass {
	
	public static void main(String[] args) throws IOException{
	
	   ArrayList<String> stringArray = new ArrayList<String>();
	   ArrayList<Integer> numberArray = new ArrayList<Integer>(); 
	   
	   int resultReturn = 0; 
	   
	   String[] firstChromPattern =  { "chr1", "chr2", "chr3", "chr4", "chr5", "chr6", "chr7", "chr8",
                                       "chr9", "chr10", "chr11", "chr12", "chr13", "chr14", "chr15",
                                       "chr16", "chr17", "chr18", "chr19", "chr20", "chr21", "chr22",
                                       "chrX", "chrY", "chrM" }; 
	   
	   String[] secondChromPattern = { "chr1", "chr2", "chr3", "chr4", "chr5", "chr6", "chr7", "chr8",
                                       "chr9", "chr10", "chr11", "chr12", "chr13", "chr14", "chr15",
                                       "chr16", "chr17", "chr18", "chr19", "chr20", "chr21", "chr22",
                                       "chrX", "chrY", "chrM" };
	   
	  // System.out.println(resultReturn);
	 
	  
	   ArrayList<String> tmpChrom = new ArrayList<String>();
	   String[] stringLoad = {"apple", "banana", "pinneaple"};
	   
	   
	   String seqLoad = "AACCTGACTGAACCAAACCTGACTGAACCAACTGGAACTGG";
	   String seqLoad1 = "AACCTGACTGAACCAAACCTGACTGAACCAACTGGAACTGG";

       returnMultipleValue stu = returnValue(); 
       
       System.out.println("Student Name: "+stu.studentName);
       System.out.println("Student Class: "+stu.studentClass);
       System.out.println("Student Grade"+stu.grade);
       System.out.println("Student Score"+ stu.score);
	    
	   		
	   	}
	
	public static returnMultipleValue returnValue() {
		
		return new returnMultipleValue("John", "Math", 20, 100);
	}
	   
			 
	   }

