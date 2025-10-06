package main.java.com.linkedinlearning.davidgassner.finallydemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FinallyDemo {
	public static void main(String[] args) throws IOException {
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader("src\\main\\java\\com\\linkedinlearning\\j7atdg\\finallydemo\\ATextFile.txt");
			br = new BufferedReader(fr); 
			String s;
			
			while((s = br.readLine()) != null) { 
				System.out.println("\n" + s); 
			} 
			
			/*
			fr.close();
			br.close();
			*/
		} catch(FileNotFoundException e) {
			System.out.println("\n" + e.getMessage());
		} finally {
			System.out.println("\nexecuting finally block");
			
			if(fr != null) {
				fr.close();
			}
			
			if(br != null) {
				br.close();
			}
		}
		
		System.out.println("\nstill alive");
		
		/*
		FileReader fr = new FileReader("src\\main\\java\\com\\linkedinlearning\\j7atdg\\finallydemo\\ATextFile.txt");
		BufferedReader br = new BufferedReader(fr); 
		String s;
		while((s = br.readLine()) != null) { 
			System.out.println("\n" + s); 
		} 
		fr.close();
		br.close();
		*/
	}
}
