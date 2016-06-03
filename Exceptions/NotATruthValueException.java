package Exceptions;

public class NotATruthValueException extends Exception{

	private static final long serialVersionUID = 5869307568170050178L;

	public NotATruthValueException(String message, String value){
		super("The operation " + message + " only accepts truth values (0/1)! "
				+ "The specified value: "+ value + " is not a truth value.");
	}
	
}
