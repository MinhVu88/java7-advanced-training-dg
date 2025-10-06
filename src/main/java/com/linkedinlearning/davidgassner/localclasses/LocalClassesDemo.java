package main.java.com.linkedinlearning.davidgassner.localclasses;

public class LocalClassesDemo {
	public static void main(String[] args) throws Exception {
		OliveJar jar = new OliveJar();
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.addOlive("Kalamata", 0x000000);
		jar.reportOlives(); // this method contains the localized JarLid inner class
	}
}
