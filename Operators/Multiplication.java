package Operators;

public class Multiplication extends Operation {

	@Override
	public void executeOperation() {
		int factor1, factor2;
		
		//TODO if block do sth.
		
		factor1 = Integer.parseInt(stack.pop());
		factor2 = Integer.parseInt(stack.pop());
		
		stack.push(String.valueOf(factor1 * factor2));
	}

}
