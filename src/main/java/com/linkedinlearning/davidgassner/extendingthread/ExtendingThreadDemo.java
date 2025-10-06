package main.java.com.linkedinlearning.davidgassner.extendingthread;

public class ExtendingThreadDemo {
	public static void main(String[] args) {
		int iteration = 3;
		
		MyThread thread = new MyThread();
		thread.start();
		
		try {
			for(int i = 0; i < iteration; i++) {
				System.out.println("\nfrom main process");
				Thread.sleep(3000);
			}
		} catch(InterruptedException e) {
			System.err.println("\n" + e);
		}
	}
}
