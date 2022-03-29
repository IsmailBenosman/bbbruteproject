package exception;

public class BalaiterieException extends RuntimeException {

	public BalaiterieException() {
		
	}
	
	// exception avec un msg si on a envie

	public BalaiterieException(String message) {
		super(message);
	}
}
	