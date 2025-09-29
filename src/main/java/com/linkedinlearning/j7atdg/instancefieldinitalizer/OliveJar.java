package main.java.com.linkedinlearning.j7atdg.instancefieldinitalizer;

import java.util.ArrayList;

public class OliveJar {
	/*
	// a static field & a static initializer which executes before any constructors do
	public static ArrayList<Olive> olives;
	
	static {
		System.out.println("initializing...");
		olives = new ArrayList<>();
		olives.add(new Olive("Kalamata", 0x000000));
		olives.add(new Olive("Picholine", 0x00FF00));
		olives.add(new Olive("Kalamata", 0x000000));
	}
	*/
	
	// an instance field & an instance initializer which also executes before any constructors do
	public ArrayList<Olive> olives;
	
	{
		System.out.println("\n\tinitializing...");
		olives = new ArrayList<>();
		
		//olives.add(new Olive("Kalamata", 0x000000));
		//olives.add(new Olive("Picholine", 0x00FF00));
		//olives.add(new Olive("Kalamata", 0x000000));
		
		olives.add(new Olive("Golden", 0xDA9100));
	}
	
	// a no-arh constructor
	public OliveJar() {System.out.println("\n\tconstructor");}

	public OliveJar(int numberOfOlives, String oliveName, long color) {		
		for(int i = 1; i <= numberOfOlives; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}
}
