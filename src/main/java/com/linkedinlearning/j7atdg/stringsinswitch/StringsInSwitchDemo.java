package main.java.com.linkedinlearning.j7atdg.stringsinswitch;

import java.util.ArrayList;
import java.util.Random;

public class StringsInSwitchDemo {
	public static void main(String[] args) throws Exception {
		Olive o1 = new Olive("Kalamata", 0x000000);
		Olive o2 = new Olive("Picholine", 0x00FF00);
		Olive o3 = new Olive("Ligurio", 0x000000);
		
		ArrayList<Olive> olives = new ArrayList<>();
		olives.add(o1); // an Olive instance index #0
		olives.add(o2); // an Olive instance index #1
		olives.add(o3); // an Olive instance index #2
		
		Random generator = new Random();
		int index = generator.nextInt(3); // a randomly generated numeric value between 0, 1 & 2
		System.out.println("\nrandom number: " + index);
		
		// assign an index (0, 1 or 2)/a reference to an Olive instance to an Olive instance
		Olive o = olives.get(index); 
		
		switch(o.oliveName) {
			case "Kalamata":
				System.out.println("\n-> Greek");
				break;
			case "Picholine":
				System.out.println("\n-> French");
				break;
			case "Ligurio":
				System.out.println("\n-> Italian");
				break;
			default:
				System.out.println("\n-> unknown origin");
				break;
		}
	}
}
