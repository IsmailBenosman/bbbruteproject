package exception;

public class ConfiserieException extends RuntimeException {

	public ConfiserieException() {
		
	}
	
	// exception avec un msg si on a envie

	public ConfiserieException(String message) {
		super(message);
	}
}
	