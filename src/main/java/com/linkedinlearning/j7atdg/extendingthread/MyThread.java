package main.java.com.linkedinlearning.j7atdg.extendingthread;

public class MyThread extends Thread {
	@Override
	public void run() {
		int interations = 5;
		
		try {
			for(int i = 0; i < interations; i++) {
				System.out.println("\nfrom secondary thread");
				sleep(2000);
			}
		} catch(InterruptedException e) {
			System.out.println("\n" + e.getMessage());
		}
	}
}
