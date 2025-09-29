package main.java.com.linkedinlearning.j7atdg.findingfiles;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;

public  class FileFinder extends SimpleFileVisitor<Path> {
	private PathMatcher matcher;
	private ArrayList<Path> foundFiles = new ArrayList<>();
	
	public FileFinder(String pattern) {
		// glob: an ideal pattern matching syntax for seeking files by their names
		matcher = FileSystems.getDefault().getPathMatcher("glob:" + pattern);
	}
	
	public PathMatcher getMatcher() {return matcher;}
	public ArrayList<Path> getFoundFiles() {return foundFiles;}
	
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		Path fileName = file.getFileName();
		System.out.println("\nexamining " + fileName);
		
		if(matcher.matches(fileName)) {
			foundFiles.add(fileName);
		}
		
		return FileVisitResult.CONTINUE;
	}
}
