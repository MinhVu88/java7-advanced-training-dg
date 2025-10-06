package main.java.com.linkedinlearning.davidgassner.theclassclass;

public class ClassClassDemo {
	public static void main(String[] args) {
		Olive o = new Olive(OliveName.PICHOLINE, 0x00ff00);
		
		Class<?> someClass = o.getClass(); // get the class reference for the o instance
		
		// find out info about the o instance & its class
		System.out.println("\nthe fully qualified package name & class name, preceded by the word 'class': " + someClass);
		System.out.println("\nthe fully qualified package name & class name, without 'class': " + someClass.getName());
		System.out.println("\njust the class name: " + someClass.getSimpleName());
	}
}
