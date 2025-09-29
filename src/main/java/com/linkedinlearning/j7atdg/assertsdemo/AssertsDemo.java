package main.java.com.linkedinlearning.j7atdg.assertsdemo;

public class AssertsDemo {
	public static void main(String[] args) {
		//assert true;
		String s1 = InputHelper.getInput("\nEnter a numeric value: ");
		assert checkInput(s1);
		
		String s2 = InputHelper.getInput("\nEnter a numeric value: ");
		assert checkInput(s2);
		
		String op = InputHelper.getInput("\nEnter + or - or * or / ");
		double result = 0;
		
		switch(op) {
			case "+":
				result = MathHelper.addValues(s1, s2);
				break;
			case "-":
				result = MathHelper.subtractValues(s1, s2);
				break;
			case "*":
				result = MathHelper.multiplyValues(s1, s2);
				break;
			case "/":
				result = MathHelper.divideValues(s1, s2);
				break;
			default:
				System.out.println("\nYou entered an incorrect operator");
				return;
		}
		
		System.out.println("\nThe answer is " + result);
	}
	
	private static boolean checkInput(String s) {
		try {
			Integer.parseInt(s);
			return true;
		} catch(Exception e) {
			System.out.println("\n" + e.getMessage());
			return false;
		}
	}
}
