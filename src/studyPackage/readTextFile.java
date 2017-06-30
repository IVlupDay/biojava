package studyPackage;

import java.io.BufferedReader;
import java.io.FileReader;

public class readTextFile {
	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("./inputFile/searchPattern.txt"));
		try {
			StringBuilder sb = new StringBuilder(); 
			String line = br.readLine(); 
			while(line != null) {
				sb.append(line); 
				sb.append(System.lineSeparator());
				line = br.readLine(); 
			}
			String everything = sb.toString();
			System.out.println(everything);
		} finally{br.close();}
	}

}
