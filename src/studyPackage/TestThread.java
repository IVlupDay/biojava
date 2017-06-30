package studyPackage; 

public class TestThread {
	public static void main(String[] args) {
		ThreadLoadX T1 = new ThreadLoadX();
		ThreadLoadX T2 = new ThreadLoadX();
		Thread t1 = new Thread(T1);
		Thread t2 = new Thread(T2);
		t1.start();
		t2.start();
	}
}

class ThreadLoadX implements Runnable {
	@Override 
	public synchronized void run() {
		String s = Thread.currentThread().getName(); 
		for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(s+" Thread "+i);
			
		}
	}
}
