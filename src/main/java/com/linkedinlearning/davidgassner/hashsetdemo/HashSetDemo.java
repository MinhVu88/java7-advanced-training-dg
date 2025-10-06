package main.java.com.linkedinlearning.davidgassner.hashsetdemo;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		Olive ligurio = new Ligurio();
		Olive kalamata = new Kalamata();
		Olive picholine = new Picholine();
		
		HashSet<Olive> hSet = new HashSet<>();

		hSet.add(ligurio);
		hSet.add(kalamata);
		System.out.println("\nthere are " + hSet.size() + " olives in the hashset");
		
		hSet.add(picholine);
		System.out.println("\nthere are " + hSet.size() + " olives in the hashset");
		
		hSet.add(ligurio);
		System.out.println("\nthere are " + hSet.size() + " olives in the hashset");
		
		hSet.add(null);
		System.out.println("\nthere are " + hSet.size() + " olives in the hashset");
		
		hSet.remove(ligurio);
		System.out.println("\nthere are " + hSet.size() + " olives in the hashset");
	}
}
