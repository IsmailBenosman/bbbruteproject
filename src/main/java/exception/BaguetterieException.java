package exception;

public class BaguetterieException extends RuntimeException {

	public BaguetterieException() {
		
	}
	
	// exception avec un msg si on a envie

	public BaguetterieException(String message) {
		super(message);
	}
}
	