package studyPackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;

public class testReadFile {

	 public static void main(String[] args) throws Exception{
		 
		BufferedReader br = null ;
		try {
			   String sCurrenceLine;
			   br = new BufferedReader(new FileReader("./inputFile/volvox.gff3"));
			   while((sCurrenceLine = br.readLine()) != null) {
				   System.out.println(sCurrenceLine); 
			   }
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if (br != null) 
					br.close();		}			
				 catch (IOException ex) {
					ex.printStackTrace();
				}
			}
		}	
   }
