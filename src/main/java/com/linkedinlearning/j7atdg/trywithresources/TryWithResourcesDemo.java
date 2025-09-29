package main.java.com.linkedinlearning.j7atdg.trywithresources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
	public static void main(String[] args) throws IOException {
		/*
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader("ATextFile.txt");
			br = new BufferedReader(fr); 
			String s;
			while((s = br.readLine()) != null) { 
				System.out.println(s); 
			} 	
		} catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("\nExecuting finally!");
			if(fr != null) {
				fr.close();
			}
			if(br != null) {
				br.close();	
			}
		}
		*/
		
		try(
			FileReader fr = new FileReader("src\\main\\java\\com\\linkedinlearning\\j7atdg\\trywithresources\\ATextFile.txt");
			BufferedReader br = new BufferedReader(fr);
		) {	
			String s;
			
			while((s = br.readLine()) != null) { 
				System.out.println("\n" + s); 
			}
		} catch(FileNotFoundException e) {
			System.out.println("\n" + e.getMessage());
		}
		
		System.out.println("\nStill Alive!!!");
	}
}
