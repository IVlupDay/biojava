package studyPackage;

public class interfaceStudy implements iMethod {
	
	public void protein() {
		System.out.println("Protein invoke...");
	}
	
	public void geneRegulation() {
		
		System.out.println("Start gene regulation"+"\n");
	}
 
	 public static void main(String[] args) {
		 
		interfaceStudy lifeProcess = new interfaceStudy(); 
		lifeProcess.protein();
		lifeProcess.geneRegulation();
		System.out.println("***Ending gene regulation***"); 
		
	 }
}

    interface iMethod {
	    public void protein(); 
	    public void geneRegulation(); 
	
  }

