package main.java.com.linkedinlearning.j7atdg.queues;

public class Olive implements Comparable<Olive> {
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

	@Override
	public int compareTo(Olive o) {
		String s1 = this.getClass().getSimpleName();
		String s2 = o.getClass().getSimpleName();
		System.out.println("comparing " + s1 + " to " + s2);
		return s1.compareTo(s2);
	}
}
