package main.java.com.linkedinlearning.davidgassner.characterstreams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamsDemo {
	public static void main(String[] args) {
		try(
			FileReader fr = new FileReader("src\\main\\java\\com\\linkedinlearning\\j7atdg\\characterstreams\\textfile.txt");	
			FileWriter fw = new FileWriter("src\\main\\java\\com\\linkedinlearning\\j7atdg\\characterstreams\\NewTextFile.txt");	
		) {	
			int c;
			
			while((c = fr.read()) != -1) {
				fw.write(c);
			}
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
