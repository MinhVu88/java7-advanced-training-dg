package main.java.com.linkedinlearning.davidgassner.staticinitializer;

import java.util.ArrayList;

public class StaticInitializerDemo {
	public static void main(String[] args) throws Exception {
		System.out.println("\nstarting application....");
		ArrayList<Olive> olives = OliveJar.olives;
		
		for(Olive o : olives) {
			System.out.println("\nit's a " + o.oliveName + " olive");
		}
	}
}
