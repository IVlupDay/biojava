package studyPackage;


public class enumTest {
	
	public enum Day {
		
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY; 
	}
	
	Day day; 
	
	public enumTest(Day day){
		this.day = day; 
	}
	
	public void tellItLikeItis(){
		
		switch(day) {
		
		case MONDAY: 
			System.out.println("Monday is a busy day");
			break;
		case FRIDAY:
			System.out.println("This evening gonna have a small party"); 
			break; 
		case SATURDAY: 
			System.out.println("Play with family");
			break; 
		default: 
			System.out.println("Mid-week are so so");
			break;
		}
	}
	
	public static void main(String[] args) {
		
		enumTest firstDay = new enumTest(Day.FRIDAY);
		firstDay.tellItLikeItis();
		enumTest secondDay = new enumTest(Day.MONDAY);
		secondDay.tellItLikeItis();
		enumTest thirdDay = new enumTest(Day.TUESDAY);
		thirdDay.tellItLikeItis();
		
	}
	

}
