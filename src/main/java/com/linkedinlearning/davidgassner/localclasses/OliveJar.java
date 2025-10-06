package main.java.com.linkedinlearning.davidgassner.localclasses;

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
	
	public OliveJar(int nOlives, String oliveName, long color) {
		
		for (int i = 1; i <= nOlives; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}

	public void addOlive(String oliveName, long color) {
		olives.add(new Olive(oliveName, color));
	}
	
	public void reportOlives() {
		
		// a local inner class is one that is defined within a code block (in this case, a method definition)
		// and whose fields & methods must be instance members, not static
		// so an instance of JarLid must be created to call this class's methods
		class jarLid {
			
			public void open() {
				System.out.println("\n\ttwist twist twist....");
				
				System.out.println("\n\tPOP!");
			}
		}
		
		// instantiate JarLid just once & call open()
		new jarLid().open();
		
		for (Olive o : olives) {
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
