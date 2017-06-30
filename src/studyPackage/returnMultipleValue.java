package studyPackage;

public class returnMultipleValue {
	
	String studentName;
	String studentClass;
	int grade;
	int score; 
	 
	public returnMultipleValue(String sn, String sc, int g, int s) {
		
		studentName = sn; 
		studentClass = sc; 
		grade = g;
		score = s; 
	}
	
	public String getStudentName() {
		
		return studentName; 
	}
	
	public String getStudentClass() {
		
		return studentClass ;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public int getScore() {
		
		return score; 
	}

}
