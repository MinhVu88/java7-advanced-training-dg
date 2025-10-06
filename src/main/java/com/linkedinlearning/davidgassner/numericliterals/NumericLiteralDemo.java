package main.java.com.linkedinlearning.davidgassner.numericliterals;

import java.text.NumberFormat;

public class NumericLiteralDemo {
	public static void main(String[] args) {
		int olivesQty = 1000000000;
		System.out.println("\nthe pre-Java 7 numeric format: " + olivesQty);
		
		int upgradedOlivesQty = 1_000_000_000;
		NumberFormat formatter = NumberFormat.getInstance();
		System.out.println("\nthe post-Java 7 numeric format: " + formatter.format(upgradedOlivesQty));
	}
}
