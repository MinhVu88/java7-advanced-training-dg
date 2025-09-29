package main.java.com.linkedinlearning.j7atdg.filetree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTreeDemo {
	public static void main(String[] args) throws IOException {
		Path topLevelDir = Paths.get("src\\main\\java\\com\\linkedinlearning\\j7atdg\\filetree\\files");
		MyFileVisitor visitor = new MyFileVisitor();
		Files.walkFileTree(topLevelDir, visitor);
	}
}
