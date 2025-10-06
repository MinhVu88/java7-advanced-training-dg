package main.java.com.linkedinlearning.davidgassner.enumclasses;

public class Olive {
	public static final long BLACK = 0x000000;
	//public String oliveName;
	public OliveName eName;
	public long color = BLACK;
	
	public Olive() {}
	
	/*
	public Olive(String oliveName) {
		this.oliveName = oliveName;
	}
	*/
	
	public Olive(OliveName name) {
		this.eName = name;
	}
	
	/*
	public Olive(String oliveName, long color) {
		this(oliveName);
		this.color = color;
	}
	*/
	
	public Olive(OliveName name, long color) {
		this(name);
		this.color = color;
	}
	
	/*
	public String toString() {
		return "\nname: " + this.oliveName + " & " + "color: " +  this.color;
	}
	*/
	
	public String toString() {
		return "\nname: " + this.eName + " & " + "color: " +  this.color;
	}
}
