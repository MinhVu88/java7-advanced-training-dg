package main.java.com.linkedinlearning.davidgassner.treesetdemo;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Olive lig = new Ligurio();
		Olive kal = new Kalamata();
		Olive pic = new Picholine();
		
		HashSet<Olive> hSet = new HashSet<>();		
		hSet.add(pic);		
		hSet.add(lig);
		hSet.add(kal);
		
		System.out.println("\nThere are " + hSet.size() + " olives in the set.");
		System.out.println("\n" + hSet);
	}
}
