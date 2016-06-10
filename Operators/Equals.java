package Operators;

import Exceptions.InvalidStackSizeException;

public class Equals extends Operation{
	
	@Override
	public void executeOperation() throws InvalidStackSizeException{
		String val1, val2, result;
		
		if(stack.size() < 2){
			throw new InvalidStackSizeException(2);
		}
		
		val1 = stack.pop();
		val2 = stack.pop();
		
		if(val1.equals(val2)){
			result = "1";
		}
		else{
			result = "0";
		}
		
		stack.push(result);
	}
	
}
