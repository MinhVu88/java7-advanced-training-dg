package main.java.com.linkedinlearning.davidgassner.enumclasses;

public enum OliveName {
	// 4 constants/options whose identifiers are all in upper-case
	// along with the associated strings are all in lower-case
	// and those lower-case strings will be returned by toString() when the Enum constants are used 
	KALAMATA("Kalamata"), 
	LIGURIO("Ligurio"), 
	PICHOLINE("Picholine"), 
	GOLDEN("Golden"); 
	
	private String name;
	
	// an Enum constructor must be private
	private OliveName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
