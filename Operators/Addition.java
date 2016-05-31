package Operators;

public class Addition extends Operation{

	@Override
	public void executeOperation() {
		int summand1, summand2;
		
		//TODO if block do sth.
		
		summand1 = Integer.parseInt(stack.pop());
		summand2 = Integer.parseInt(stack.pop());
		
		stack.push(String.valueOf(summand1 + summand2));
	}

}
