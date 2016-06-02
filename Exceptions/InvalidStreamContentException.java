package Exceptions;

public class InvalidStreamContentException extends Exception{

	private static final long serialVersionUID = -5642396355496056868L;
	
	/**
	 * An exception for false input in stream
	 * @param message should specify the invalid character(s)
	 */
	public InvalidStreamContentException(String message){
		super("The stack can only contain numbers and operators! ([n]*[o]*)\n"
				+ "Invalid input: " + message);
	}
	
}
