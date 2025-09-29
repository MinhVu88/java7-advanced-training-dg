package main.java.com.linkedinlearning.j7atdg.throwing;

import java.io.IOException;

public class ThrowingDemo {
	public static void main(String[] args) throws IOException {
		String fileContents = MyFileReader.readFile("src\\main\\java\\com\\linkedinlearning\\j7atdg\\throwing\\TextFile2.txt");
		System.out.println("\n" + fileContents);
		
		if(fileContents.equals("Right file")) {
			System.out.println("\nyou chose the right file");
		} else {
			try {
				throw new WrongFileException();
			} catch(WrongFileException e) {
				System.out.println("\n" + e.getMessage());
			}
		}
	}
}
