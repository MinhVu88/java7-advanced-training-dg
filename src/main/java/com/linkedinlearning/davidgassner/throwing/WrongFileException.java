package main.java.com.linkedinlearning.davidgassner.throwing;

public class WrongFileException extends Exception {
	private static final long serialVersionUID = -7133532815749490220L;

	@Override
	public String getMessage() {
		return "\nyou chose the wrong file";
	}
}
