package studyPackage;

import java.net.*;

public class InetAddressDemo {
	public static void main(String[] args) {
		try {
			InetAddress ias[] = InetAddress.getAllByName(args[0]); 
			for(int i=0; i<ias.length; i++) {
				System.out.println(ias[i].getHostName());
				System.out.println(ias[i].getHostAddress());
				byte bytes[] = ias[i].getAddress(); 
				for(int j=0; j<bytes.length; j++) {
					if(j>0)
						System.out.println("."); 
					else 
						System.out.println(bytes[j]+256);
				}
				System.out.println("");
 			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
