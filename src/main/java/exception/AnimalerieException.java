package exception;

public class AnimalerieException extends RuntimeException {

	public AnimalerieException() {
		
	}
	
	// exception avec un msg si on a envie

	public AnimalerieException(String message) {
		super(message);
	}
}
	