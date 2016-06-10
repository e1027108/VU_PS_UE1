package Operators;

import Exceptions.InvalidStackSizeException;
import Exceptions.UnexpectedBlockException;

public class Division extends Operation {

	@Override
	public void executeOperation() throws UnexpectedBlockException, InvalidStackSizeException {
		int divisor, dividend;
		String element1, element2;

		if(stack.size() < 2){
			throw new InvalidStackSizeException(2);
		}
		
		element1 = stack.pop();
		element2 = stack.pop();

		try{
			divisor = Integer.parseInt(element1);
			dividend = Integer.parseInt(element2);
		} catch (NumberFormatException e){
			if(element1.contains("[")){
				throw new UnexpectedBlockException(element1);
			}
			else if(element2.contains("[")){
				throw new UnexpectedBlockException(element2);
			}
			else{
				throw e;
			}
		}

		if(divisor == 0){
			throw new ArithmeticException("Division by 0 not allowed!");
		}

		stack.push(String.valueOf(dividend/divisor));

	}

}
