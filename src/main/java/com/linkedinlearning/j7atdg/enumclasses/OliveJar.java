package main.java.com.linkedinlearning.j7atdg.enumclasses;

import java.util.ArrayList;

public class OliveJar {
	public ArrayList<Olive> olives;
	
	{
		System.out.println("\ninitializing...");
		olives = new ArrayList<>();
		//olives.add(new Olive("Golden", 0xDA9100));
		olives.add(new Olive(OliveName.GOLDEN, 0xDA9100));
	}
	
	public OliveJar() {
		System.out.println("\nConstructor...");
	}
	
	/*
	public OliveJar(int numberOfOlives, String oliveName, long color) {
		for(int i = 1; i <= numberOfOlives; i++) {
			olives.add(new Olive(oliveName, color));
		}
	}
	*/
	
	public OliveJar(int numberOfOlives, OliveName name, long color) {
		for(int i = 1; i <= numberOfOlives; i++) {
			olives.add(new Olive(name, color));
		}
	}
	
	/*
	public void addOlive(String oliveName, long color) {
		olives.add(new Olive(oliveName, color));
	}
	*/
	
	public void addOlive(OliveName name, long color) {
		olives.add(new Olive(name, color));
	}
	
	public void reportOlives() {
		new Object() {
			public void open() {
				System.out.println("\n\tTwist, twist, twist...");
				System.out.println("\n\tPop!");
			}
		}.open();
		
		for(Olive o : olives) {
			System.out.println("\nIt's a " + o.eName + " olive!!");
		}
	}
}
