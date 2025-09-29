package main.java.com.linkedinlearning.j7atdg.pathclass;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathClassDemo {
	public static void main(String[] args) {
		Path p = Paths.get("src\\main\\java\\com\\linkedinlearning\\j7atdg\\pathclass\\loremipsum.txt");
		System.out.println("\n" + p.toString());
		System.out.println("\n" + p.getFileName());
		System.out.println("\n" + p.getNameCount());
		System.out.println("\n" + p.getName(0));
		System.out.println("\n" + p.getName(1));
		System.out.println("\n" + p.getName(p.getNameCount() - 1));
		
		Path realPath = null;
		
		try {
			realPath = p.toRealPath(LinkOption.NOFOLLOW_LINKS);
			System.out.println(realPath);
		} catch(IOException e) {
			System.out.println("\n" + e.getMessage());
		}
	}
}
