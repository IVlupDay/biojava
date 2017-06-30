package studyPackage; 


class ThreadX extends Thread {
	public void run() {
		try {
			while(true) {
				Thread.sleep(1000);
				System.out.println("Hello");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadDemo1 {
	public static void main(String[] args) {
		ThreadX tx = new ThreadX();
		tx.start();
	}
}