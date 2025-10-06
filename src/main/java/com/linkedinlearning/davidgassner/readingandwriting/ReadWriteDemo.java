package main.java.com.linkedinlearning.davidgassner.readingandwriting;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadWriteDemo {
	public static void main(String[] args) throws IOException {
		Path source = Paths.get("src\\main\\java\\com\\linkedinlearning\\j7atdg\\readingandwriting\\loremipsum.txt");
		System.out.println("\n" + source.getFileName());
		
		Path target = Paths.get("src\\main\\java\\com\\linkedinlearning\\j7atdg\\readingandwriting\\newFile.txt");
		System.out.println("\n" + target.getFileName());
		
		System.out.println();
		
		Charset charset = Charset.forName("US-ASCII");
		
		ArrayList<String> lines = new ArrayList<>();
		
		try(BufferedReader br = Files.newBufferedReader(source, charset)) {
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
				lines.add(line);
			}
		} catch(IOException e) {
			System.out.println("\n" + e.getMessage());
		}
		
		try(BufferedWriter bw = Files.newBufferedWriter(target, charset)) {
			Iterator<String> i = lines.iterator();
			
			while(i.hasNext()) {
				String str = (String) i.next();
				bw.append(str, 0, str.length()); // append data to the end of the file
				bw.newLine(); // add a newline character
			}
		} catch(IOException e) {
			System.out.println("\n" + e.getMessage());
		}
	}
}
