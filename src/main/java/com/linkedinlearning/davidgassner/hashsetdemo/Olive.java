package main.java.com.linkedinlearning.davidgassner.hashsetdemo;

public class Olive {
	public OliveName eName;
	public OliveColor eColor;

	public Olive() {}

	public Olive(OliveName eName, OliveColor eColor) {
		this.eName = eName;
		this.eColor = eColor;
	}

	@Override
	public String toString() {
		return "\nolive name: " + this.eName.toString() + ", color: " + this.eColor.toString();
	}
}
