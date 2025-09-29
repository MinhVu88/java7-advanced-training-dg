package main.java.com.linkedinlearning.j7atdg.typeinfo;

public class Olive {
	public OliveName eName;
	//public long color;
	
	public OliveColor eColor;
	
	/*
	public Olive(OliveName eName, long color) {
		this.oliveName = eName;
		this.color = color;
	}
	*/
	
	public Olive(OliveName eName, OliveColor eColor) {
		this.eName = eName;
		this.eColor = eColor;
	}
	
	/*
	@Override
	public String toString() {
		return "\nolive name: " + this.oliveName.toString() + ", color: " + this.color;
	}
	*/
	
	@Override
	public String toString() {
		return "\nolive name: " + this.eName.toString() + ", color: " + this.eColor.toString();
	}
}
