package main.java.com.linkedinlearning.davidgassner.syncthreads;

public class TargetClass {	
	public void call(int threadId) {
		System.out.println("\ncalling thread from " + threadId);
	}
}
