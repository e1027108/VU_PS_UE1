package Exceptions;

public class InvalidStackSizeException extends Exception{

	private static final long serialVersionUID = 6890627637637359469L;

	public InvalidStackSizeException(String message){
		super("Stack size not as expected!\n"
				+ "Non readable part of stack: " + message);
	}
	
	public InvalidStackSizeException(int unreachable){
		super("Stack can't access element n=" + unreachable +"! Index out of bounds!");
	}
	
}
