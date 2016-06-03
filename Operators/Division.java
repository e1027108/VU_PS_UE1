package Operators;

public class Division extends Operation {

	@Override
	public void executeOperation() {
		int divisor, dividend;
		
		//TODO if block do sth.
		//TODO exception on Division by zero (ArithmeticException?)
		
		divisor = Integer.parseInt(stack.pop());
		dividend = Integer.parseInt(stack.pop());
		
		if(divisor == 0){
			throw new ArithmeticException("Division by 0 not allowed!");
		}
		
		stack.push(String.valueOf(dividend/divisor));

	}

}
