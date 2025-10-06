package main.java.com.linkedinlearning.davidgassner.bufferedstreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamsDemo {
	public static void main(String[] args) {
		try(
			BufferedReader br = new BufferedReader(new FileReader("src\\main\\java\\com\\linkedinlearning\\j7atdg\\bufferedstreams\\hamlet.xml"));	
			BufferedWriter bw = new BufferedWriter(new FileWriter("src\\main\\java\\com\\linkedinlearning\\j7atdg\\bufferedstreams\\NewHamlet.txt"));	
		) {	
			int c;
			
			while((c = br.read()) != -1) {
				bw.write(c);
			}
			
			System.out.println("\ndone");
		} catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		} 
	}
}
