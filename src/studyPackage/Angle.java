package studyPackage;

public class Angle {
	
	public static void main(String[] args) {
		
		if(args.length > 0) {
			double angle = Double.valueOf(args[0]).doubleValue();
			double radians = angle*Math.PI/180;
			System.out.println("Cosin: "+Math.cos(radians));
			System.out.println("Sin: "+Math.sin(radians));
			System.out.println("Tan: "+Math.tan(radians));
		}
		
		else {
			System.out.println("Provide an angle in degree");
		}
	}

}
