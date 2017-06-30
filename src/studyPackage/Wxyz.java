package studyPackage;

class W {
	float f;
}

class X extends W {
	StringBuffer sb; 
}

class Y extends X {
	String s;
}

class Z extends Y {
	
	Integer i;
}
public class Wxyz {
	
	public static void main(String[] args) {
		
		Z z = new Z(); 
	    z.f = 4.567f; 
	    z.sb = new StringBuffer("abcdef");
	    z.s = "Teach your self Java";
	    System.out.println("z.f"+z.f);
	    
		
	}

}
