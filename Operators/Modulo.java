package Operators;

public class Modulo extends Operation {

	@Override
	public void executeOperation() {
		int divisor, dividend;
		
		//TODO if block do sth.
		
		divisor = Integer.parseInt(stack.pop());
		dividend = Integer.parseInt(stack.pop());
		
		if(divisor == 0){
			throw new ArithmeticException("Division by 0 not allowed!");
		}
		
		stack.push(String.valueOf(dividend % divisor));
	}

}
