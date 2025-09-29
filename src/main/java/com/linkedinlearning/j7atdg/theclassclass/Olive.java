package main.java.com.linkedinlearning.j7atdg.theclassclass;

public class Olive {
	public OliveName eName;
	public long color;
	
	public Olive(OliveName oliveName, long color) {
		this.eName = oliveName;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return this.eName.toString();
	}
}
