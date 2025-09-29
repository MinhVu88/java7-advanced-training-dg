package main.java.com.linkedinlearning.j7atdg.anonclasses;

import java.util.ArrayList;

public class OliveJar {
	public ArrayList<Olive> olives;
	
	{
		System.out.println("\ninitializing...");
		olives = new ArrayList<>();
		olives.add(new Olive("Golden", 0xDA9100));
	}
	
	public OliveJar() {
		System.out.println("\nConstructor...");
	}
	
	public OliveJar(int numberOfOlives, String oliveName, long color) {
		for(int i = 1; i <= numberOfOlives; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}

	public void addOlive(String oliveName, long color) {
		olives.add(new Olive(oliveName, color));
	}
	
	public void reportOlives() {
		/*
		class JarLid {
			public void open() {
				System.out.println("\n\tTwist, twist, twist...");
				System.out.println("\n\tPop!");
			}
		}
		new JarLid().open();		
		*/
		
		// define a local inner anonymous class that's called only once & only from within this method
		new Object() {
			public void open() {
				System.out.println("\n\tTwist, twist, twist...");
				System.out.println("\n\tPop!");
			}
		}.open();
		
		for(Olive o : olives) {
			System.out.println("\nIt's a " + o.oliveName + " olive!!");
		}
	}
	
	class Olive {
		public static final long BLACK = 0x000000;
		public String oliveName;
		public long color = BLACK;
		
		public Olive() {}

		public Olive(String oliveName) {
			this.oliveName = oliveName;
		}
		
		public Olive(String oliveName, long color) {
			this(oliveName);
			this.color = color;
		}
		
		public String toString() {
			return "\nname: " + this.oliveName + " & " + "color: " +  this.color;
		}
	}
}
