package main.java.com.linkedinlearning.davidgassner.filetree;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path> {
	@Override
	public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
		System.out.println("\n* Enter " + dir);
		
		// the FileVisitResult enumeration class's CONTINUE constant/option means continue navigating a directory, its sub-folders & files within
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		if(attrs.isRegularFile()) {
			System.out.print("\n\t-> regular file: " + file.getFileName());
		}
		
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.err.println("\n" + exc.getMessage());
		return FileVisitResult.CONTINUE;
	}

	@Override
	public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
		System.out.println("\n\n* Exit " + dir);
		return FileVisitResult.CONTINUE;
	}
}
