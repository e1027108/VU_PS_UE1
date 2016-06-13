package Operators;

import Exceptions.InvalidStackSizeException;
import Exceptions.UnexpectedBlockException;

public class Multiplication extends Operation {

	@Override
	public void executeOperation() throws UnexpectedBlockException, InvalidStackSizeException {
		int factor1, factor2;
		String element1, element2;

		if(stack.size() < 2){
			throw new InvalidStackSizeException(2);
		}
		
		element1 = stack.pop();
		element2 = stack.pop();

		try{
			factor1 = Integer.parseInt(element1);
			factor2 = Integer.parseInt(element2);
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

		stack.push(String.valueOf(factor1 * factor2));
	}

}
