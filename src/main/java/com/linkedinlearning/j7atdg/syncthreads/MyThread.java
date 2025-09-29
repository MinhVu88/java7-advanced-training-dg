package main.java.com.linkedinlearning.j7atdg.syncthreads;

public class MyThread extends Thread {	
	private int threadId;
	private TargetClass target;
	
	public MyThread(int threadId, TargetClass target) {
		this.threadId = threadId;
		this.target = target;
	}

	@Override
	public void run() {
		synchronized (this.target) {
			try {
				sleep(2000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			
			this.target.call(threadId);
		}
	}
}
