package main.java.com.linkedinlearning.davidgassner.interruptthread;

public class InterruptThreadDemo {
	public static void main(String[] args) {
		MyThread t = new MyThread();
		t.start();
		
		try {
			Thread.sleep(2500);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		t.interrupt();
		System.out.println("\ncalled interruped()");
	}
}
