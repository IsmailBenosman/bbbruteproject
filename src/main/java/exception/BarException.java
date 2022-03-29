package exception;

public class BarException extends RuntimeException {

	public BarException() {
		
	}
	
	// exception avec un msg si on a envie

	public BarException(String message) {
		super(message);
	}
}
	