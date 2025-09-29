package main.java.com.linkedinlearning.j7atdg.memberclasses;

public class MemberClassesDemo {
	public static void main(String[] args) throws Exception {
		/*
		OliveJar jar = new OliveJar(3, "Kalamata", 0x000000);		
		for(Olive o : jar.olives) {
			System.out.println("\nIt's a " + o.oliveName + " olive!");
		}
		*/
		
		OliveJar jar = new OliveJar();
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.reportOlive();
	}
}
	