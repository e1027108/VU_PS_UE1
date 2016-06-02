package Exceptions;

public class UnexpectedBlockException extends Exception{

	private static final long serialVersionUID = 7377928407769793940L;
	
	/**
	 * reports a block that shouldn't be
	 * @param message the block that was not accepted
	 */
	public UnexpectedBlockException(String message){
		super("The '&' and '|' operators do not accept block arguments!\n"
				+ "Invalid block: " + message);
	}

}
