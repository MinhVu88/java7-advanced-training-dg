package main.java.com.linkedinlearning.j7atdg.interruptthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		int iterations = 5;
		
		try {
			for(int i = 0; i < iterations; i++) {
				System.out.println("\nFrom secondary thread");
				sleep(1000);
			}
		} catch(InterruptedException e) {
			//System.err.println(e);
			System.out.println("\nthread interrupted");
		}
	}
}
