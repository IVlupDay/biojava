package studyPackage;

public class constructExtractSequence {
	
	int lineStr;
	int lineEnd; 
	int startCount;
	int endCount; 
	
	public constructExtractSequence(int ls, int le, int sc, int ec) {
		
		lineStr = ls; 
		lineEnd = le;
		startCount = sc;
		endCount = ec; 
	}
	
	public int getLineStr() {
		
		return lineStr;
	}
	
	public int getLineEnd() {
		return lineEnd; 
	}
	
	public int getStartCount() {
		
		return startCount;
	}
	
	public int getEndCount() {
		
		return endCount; 
	}

}
