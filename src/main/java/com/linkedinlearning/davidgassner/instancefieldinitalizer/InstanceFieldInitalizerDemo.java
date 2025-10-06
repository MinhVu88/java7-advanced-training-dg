package main.java.com.linkedinlearning.davidgassner.instancefieldinitalizer;

import java.util.ArrayList;

public class InstanceFieldInitalizerDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("Starting application...");
		
		// an OliveJar instance isn't required to be created in order to access the olives static field
		//ArrayList<Olive> olives = OliveJar.olives;
		
		// there must be an OliveJar instance, here created by the constructor, to access the olives instance field
		//ArrayList<Olive> olives = new OliveJar().olives;
		
		ArrayList<Olive> olives = new OliveJar(7, "Kalamata", 0x000000).olives;
		
		for(Olive o : olives) {
			System.out.println("\nIt's a " + o.oliveName + " olive!");
		}
	}
}
