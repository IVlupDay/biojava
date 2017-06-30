package studyPackage;

public class abstractClass {
	
	public static void main(String[] args) {
		
		proteinB protein = new proteinB();
		protein.interactStart();
		protein.transcriptStart();
	}
}

abstract class proteinA {
	
	abstract void interactStart(); 
	void transcriptStart() {
		System.out.println("State of transcription"); 
	}
}

class proteinB extends proteinA {
	void interactStart() {
		System.out.println("State of protein interaction");
	}
}


