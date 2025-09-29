package main.java.com.linkedinlearning.j7atdg.memberclasses;

import java.util.ArrayList;

public class OliveJar {
	public ArrayList<innerOlive> olives;
	
	{
		System.out.println("\ninitializing...");
		olives = new ArrayList<>();
		olives.add(new innerOlive("Golden", 0xDA9100));
	}
	
	public OliveJar() {
		System.out.println("\nConstructor...");
	}
	
	public OliveJar(int numberOfOlives, String oliveName, long color) {
		for(int i = 1; i <= numberOfOlives; i++) {
			olives.add(new innerOlive(oliveName, color));
		}
	}
	
	public void addOlive(String oliveName, long color) {
		olives.add(new innerOlive(oliveName, color));
	}
	
	public void reportOlive() {
		for(innerOlive o : olives) {
			System.out.println("\nit's a " + o.oliveName + " olive"); 
		}
	}
	
	// turn the Olive class (here with a different name) into a member of the OliveJar class
	class innerOlive {
		public static final long BLACK = 0x000000;
		public String oliveName;
		public long color = BLACK;
		public innerOlive() {}

		public innerOlive(String oliveName) {
			this.oliveName = oliveName;
		}
		
		public innerOlive(String oliveName, long color) {
			this(oliveName);
			this.color = color;
		}
		
		public String toString() {
			return "\nname: " + this.oliveName + " & " + "color: " +  this.color;
		}
	}
}
