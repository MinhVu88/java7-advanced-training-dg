package main.java.com.linkedinlearning.j7atdg.implementrunnable;

public class MyRunnable implements Runnable {
	@Override
	public void run() {
		int iterations = 5;
		
		try {
			for(int i = 0; i < iterations; i++) {
				System.out.println("\nFrom Runnable");
				Thread.sleep(1500);
			}
		} catch(InterruptedException e) {
			System.err.println(e);
		}
	}
}
