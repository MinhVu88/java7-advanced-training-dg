package main.java.com.linkedinlearning.davidgassner.bytestreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamsDemo {
	public static void main(String[] args) {
		try( 
			/*
			FileInputStream fis = new FileInputStream("src\\main\\java\\com\\linkedinlearning\\j7atdg\\bytestreams\\textfile.txt");	
			FileOutputStream fos = new FileOutputStream("src\\main\\java\\com\\linkedinlearning\\j7atdg\\bytestreams\\NewTextFile.txt");
			*/	
			FileInputStream fis = new FileInputStream("src\\main\\java\\com\\linkedinlearning\\j7atdg\\bytestreams\\flower.jpg");	
			FileOutputStream fos = new FileOutputStream("src\\main\\java\\com\\linkedinlearning\\j7atdg\\bytestreams\\NewFlower.jpg");	
		) {	
			int b;
			
			while((b = fis.read()) != -1) {
				fos.write(b);
			}
		} catch(FileNotFoundException e) {
			System.out.println("\n" + e.getMessage());
		} catch(IOException e) {
			System.out.println("\n" + e.getMessage());
		}
	}
}
