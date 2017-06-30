package studyPackage;

import java.util.*;

public class randomClass {

	public static void main(String[] args) {
		
		Random generator = new Random(); 
		for(int i=0; i<10; i++) {
			System.out.println(generator.nextInt());
		}
	}
}
