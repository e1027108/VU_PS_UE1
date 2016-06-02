package Operators;

public class Modulo extends Operation {

	@Override
	public void executeOperation() {
		int divisor, dividend;
		
		//TODO if block do sth.
		//TODO exception on Division by zero
		
		divisor = Integer.parseInt(stack.pop());
		dividend = Integer.parseInt(stack.pop());
		
		stack.push(String.valueOf(dividend % divisor));
	}

}
