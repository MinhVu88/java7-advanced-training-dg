package main.java.com.linkedinlearning.j7atdg.treesetdemo;

import java.util.TreeSet;

public class TreeSetDemo {
	public static void main(String[] args) {
		Olive lig = new Ligurio();
		Olive kal = new Kalamata();
		Olive pic = new Picholine();
		
		TreeSet<Olive> tSet = new TreeSet<>();
		
		try {
			tSet.add(pic);
			tSet.add(kal);
			tSet.add(lig);
		} catch(Exception e) {
			System.out.println("\n" + e.getMessage());
		}
		
		System.out.println(tSet);
	}
}
