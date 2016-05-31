package Operators;

public class Subtraction extends Operation {

	@Override
	public void executeOperation() {
		int subtrahend, minuend;
		
		//TODO if block do sth.
		
		subtrahend = Integer.parseInt(stack.pop());
		minuend = Integer.parseInt(stack.pop());
		
		stack.push(String.valueOf(minuend - subtrahend));
	}
	
}
