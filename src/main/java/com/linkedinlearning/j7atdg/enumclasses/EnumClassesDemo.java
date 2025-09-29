package main.java.com.linkedinlearning.j7atdg.enumclasses;

public class EnumClassesDemo {
	public static void main(String[] args) throws Exception {
		OliveJar jar = new OliveJar();
		
		/*
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		*/
		
		jar.addOlive(OliveName.KALAMATA, 0x000000);
		jar.addOlive(OliveName.LIGURIO, 0x000000);
		jar.addOlive(OliveName.PICHOLINE, 0x000000);
		jar.reportOlives();
	}
}
